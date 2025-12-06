import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TranslatorTree {
    private static CharStream cs;
    private static csvLexer lexer;
    private static CommonTokenStream tokens;
    private static csvParser parser;
    private static ParseTree tree;

    private static File f;
    private static FileWriter writer;

    public static void main(String[] args) throws Exception {
        if (args.length>0 && args[0].length()>3 && args[0].substring(args[0].length()-4).equals(".txt")){
            System.out.println("Reading from file: " + args[0]);
            cs = CharStreams.fromFileName(args[0]);
            lexer = new csvLexer(cs);
            tokens = new CommonTokenStream(lexer);
            parser = new csvParser(tokens);

            tree = parser.prog();

            try{
                f = new File("tree.txt");
                writer = new FileWriter(f);
            } catch (IOException e){
                e.printStackTrace();
                return;
            }

            write2txt(tree, 0);
            writer.close();
            return;
        } else{
            System.out.println("No input file provided.");
        }
    }

    public static void write2txt(ParseTree tree, int indentation) throws IOException {
        // writer.write(tree.getText() + "\n");
        for (int i=0; i<tree.getChildCount(); i++){
            String ruleName = getRule(tree.getChild(i));
            if (!ruleName.equals("")) {
                writer.write("  ".repeat(indentation) + ruleName + ":\n");
                write2txt(tree.getChild(i), indentation + 1);
            } else{
                String childText = tree.getChild(i).getText();
                writer.write("  ".repeat(indentation) + (childText.equals("\r\n")?"\\r\\n": childText) + "\n");
            }
        }
    }

    public static String getRule(ParseTree tree){
        if (tree instanceof ParserRuleContext ctx) {
            int ruleIndex = ctx.getRuleIndex();
            return parser.getRuleNames()[ruleIndex];
        } else{
            return "";
        }
    }
}
