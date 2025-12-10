public class csvToJsonVisitor extends csvParserBaseVisitor<String> {
    private String[] titles = null;
    
    @Override
    public String visitProg(csvParser.ProgContext ctx) {
        visit(ctx.FirstRow);
        return "[\n" + visit(ctx.Rows) + "\n]\n";
    }

    @Override
    public String visitFirstRow(csvParser.FirstRowContext ctx) {
        int fields = ctx.field().size();
        titles = new String[fields];
        for (int i = 0; i < fields; i++) {
            titles[i] = ctx.field().get(i).getText();
        }
        return null;
    }

    @Override
    public String visitRows(csvParser.RowsContext ctx) {
        String result = "";
        System.out.println("Number of rows: " + ctx.row().size());
        for (int i=0; i<ctx.row().size(); i++){
            if (i != 0) {
                result += ",\n";
            }
            result += visit(ctx.row(i));
        }
        return result;
    }

    @Override
    public String visitRow(csvParser.RowContext ctx){
        String result = "  { ";
        if (titles.length != ctx.field().size()) {
            throw new RuntimeException("Number of fields in row does not match number of titles");
        }
        for (int i = 0; i < titles.length; i++) {
            if (i != 0) {
                result += ",\n  ";
            }
            result += "\"" + titles[i] + "\": \"" + ctx.field().get(i).getText() + "\"";
        }
        result += " }";
        return result;
    }
}