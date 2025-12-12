import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TranslatorJasmin {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            System.out.println("Reading from file: " + args[0]);

            CharStream cs = CharStreams.fromFileName(args[0]);
            eppLexer lexer = new eppLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            eppParser parser = new eppParser(tokens);

            ParseTree tree = parser.prog();

            try (FileWriter writer = new FileWriter(new File("epp.j"))) {
                eppToJasminVisitor visitor = new eppToJasminVisitor();
                writer.write(visitor.visit(tree));
            }
            return;
        }

        System.out.println("No input file provided.");
    }
}
