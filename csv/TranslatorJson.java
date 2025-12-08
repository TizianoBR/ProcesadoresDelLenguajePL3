import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TranslatorJson {
    public static void main(String[] args) throws Exception {
        if (args.length > 0 && args[0].endsWith(".txt")) {
            System.out.println("Reading from file: " + args[0]);

            CharStream cs = CharStreams.fromFileName(args[0]);
            csvLexer lexer = new csvLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            csvParser parser = new csvParser(tokens);

            ParseTree tree = parser.prog();

            try (FileWriter writer = new FileWriter(new File("csv.json"))) {
                CsvJsonVisitor visitor = new CsvJsonVisitor(writer);
                visitor.visit(tree);
            }
            return;
        }

        System.out.println("No input file provided.");
    }

    /** Visitor that converts the parse tree into JSON. */
    private static class CsvJsonVisitor extends AbstractParseTreeVisitor<Void> {
        private final FileWriter writer;
        private String[] titles;

        CsvJsonVisitor(FileWriter writer) {
            this.writer = writer;
        }

        @Override
        public Void visit(ParseTree tree) {
            if (tree instanceof csvParser.ProgContext ctx) {
                return visitProg(ctx);
            }
            if (tree instanceof csvParser.FirstRowContext ctx) {
                return visitFirstRow(ctx);
            }
            if (tree instanceof csvParser.RowContext ctx) {
                return visitRow(ctx);
            }
            return super.visit(tree);
        }

        private Void visitProg(csvParser.ProgContext ctx) {
            write("[\n");
            visit(ctx.firstRow());

            var rows = ctx.row();
            for (int i = 0; i < rows.size(); i++) {
                write("  { ");
                visit(rows.get(i));
                if (i < rows.size() - 1) {
                    write(" },\n");
                } else {
                    write(" }\n");
                }
            }

            write("]\n");
            return null;
        }

        private Void visitFirstRow(csvParser.FirstRowContext ctx) {
            int fields = ctx.field().size();
            titles = new String[fields];
            for (int i = 0; i < fields; i++) {
                titles[i] = ctx.field(i).getText();
            }
            return null;
        }

        private Void visitRow(csvParser.RowContext ctx) {
            if (titles == null) {
                throw new IllegalStateException("Titles must be parsed before rows");
            }
            if (ctx.field().size() != titles.length) {
                throw new IllegalStateException("Row length does not match titles length.");
            }

            for (int i = 0; i < titles.length; i++) {
                if (i != 0) {
                    write("  ");
                }
                write("\"" + titles[i] + "\": \"" + ctx.field(i).getText() + "\"");
                if (i < titles.length - 1) {
                    write(",\n");
                }
            }
            return null;
        }

        private void write(String text) {
            try {
                writer.write(text);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
