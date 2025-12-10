import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TranslatorJson {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            System.out.println("Reading from file: " + args[0]);

            CharStream cs = CharStreams.fromFileName(args[0]);
            csvLexer lexer = new csvLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            csvParser parser = new csvParser(tokens);

            ParseTree tree = parser.prog();

            try (FileWriter writer = new FileWriter(new File("csv.json"))) {
                csvToJsonVisitor visitor = new csvToJsonVisitor();
                writer.write(visitor.visit(tree));
            }
            return;
        }

        System.out.println("No input file provided.");
    }
}
