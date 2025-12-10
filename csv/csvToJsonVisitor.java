public class csvToJsonVisitor extends csvParserBaseVisitor<String> {
    private String[] titles = null;
    
    @Override
    public String visitProg(csvParser.ProgContext ctx) {
        visit(ctx.FirstRow);
        return "[\n" + visit(ctx.Rows) + "\n]\n";
    }

    @Override
    public String visitSingleFieldFR(csvParser.SingleFieldFRContext ctx) {
        titles = new String[] { ctx.Field.getText() };
        return "";
    }

    @Override
    public String visitManyFieldsFR(csvParser.ManyFieldsFRContext ctx) {
        String[] subTitles = visit(ctx.FirstRow).split(",");
        String[] result = new String[subTitles.length + 1];
        System.arraycopy(subTitles, 0, result, 0, subTitles.length);
        result[subTitles.length] = ctx.Field.getText();
        titles = result;
        return "";
    }
}