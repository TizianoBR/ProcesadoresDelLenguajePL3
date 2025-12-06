import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TranslatorJson {
    private static CharStream cs;
    private static csvLexer lexer;
    private static CommonTokenStream tokens;
    private static csvParser parser;
    private static ParseTree tree;

    private static File f;
    private static FileWriter writer;

    private static String[] titles;

    public static void main(String[] args) throws Exception {
        if (args.length>0 && args[0].length()>3 && args[0].substring(args[0].length()-4).equals(".txt")){
            System.out.println("Reading from file: " + args[0]);
            cs = CharStreams.fromFileName(args[0]);
            lexer = new csvLexer(cs);
            tokens = new CommonTokenStream(lexer);
            parser = new csvParser(tokens);

            tree = parser.prog();

            try{
                f = new File("csv.json");
                writer = new FileWriter(f);
            } catch (IOException e){
                e.printStackTrace();
                return;
            }
            
            writer.write("[\n");
            translate(tree);
            writer.write(" ]\n");

            writer.close();
            return;
        } else{
            System.out.println("No input file provided.");
        }
    }

    public static void translate(ParseTree tree) throws IOException {
        // writer.write(tree.getText() + "\n");
        for (int i=0; i<tree.getChildCount(); i++){
            String ruleName = getRule(tree.getChild(i));
            if (!ruleName.equals("")) {
                if (ruleName.equals("firstRow")){
                    prepareTitles(tree.getChild(i));
                } else if (ruleName.equals("row")){
                    writer.write("{ ");
                    writeRow(tree.getChild(i));
                    if (i < tree.getChildCount() - 2){
                        writer.write(" },\n");
                    } else{
                        writer.write(" }\n");
                    }
                }
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

    public static void prepareTitles(ParseTree tree) {
        titles = new String[tree.getChildCount()];
        for (int i=0; i<tree.getChildCount(); i++){
            String ruleName = getRule(tree.getChild(i));
            if (ruleName.equals("field")){
                titles[i] = tree.getChild(i).getText();
            }
        }
    }

    public static void writeRow(ParseTree tree) throws IOException {
        if (tree.getChildCount() != titles.length){
            throw new IOException("Row length does not match titles length.");
        }
        for (int i=0; i<tree.getChildCount(); i++){
            String ruleName = getRule(tree.getChild(i));
            if (ruleName.equals("field")){
                if (i != 0){
                    writer.write("  ");
                }
                writer.write("\"" + titles[i] + "\": \"" + tree.getChild(i).getText() + "\"");
                if (i < tree.getChildCount() - 1){
                    writer.write(",\n");
                }
            }
        }
    }
}
