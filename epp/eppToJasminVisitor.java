import java.util.ArrayList;

public class eppToJasminVisitor extends eppParserBaseVisitor<String> {
    // Array con tres listas: [0] nombres, [1] índices, [2] tipos
    private ArrayList<String>[] variables = new ArrayList[3];
    
    public eppToJasminVisitor() {
        variables[0] = new ArrayList<>(); // nombres
        variables[1] = new ArrayList<>(); // índices
        variables[2] = new ArrayList<>(); // tipos
    }

    private int labelCount = 0;
    private int forDepth = 0; // Profundidad de anidamiento de bucles for

    @Override
    public String visitProg(eppParser.ProgContext ctx) {
        String result = ".class public Ejemplo01_ProgramaVacio\n" + 
                        ".super java/lang/Object\n" + 
                        "\n" + 
                        ".method public static main([Ljava/lang/String;)V\n" + 
                        "\n" + 
                        "   ; reservar espacio en la pila, podria ser 0 aqui\n" + 
                        "   .limit stack 100\n" + 
                        "   .limit locals 100\n" +
                        "\n"
                        ;
        for (int i=0; i<ctx.line().size(); i++) {
            result += visit(ctx.line(i));
        }
        result += "; terminar el main\n" + 
                        "   return\n" + 
                        "\n" + 
                        ".end method";
        return result;
    }

    @Override
    public String visitLineStatement(eppParser.LineStatementContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public String visitLineComment(eppParser.LineCommentContext ctx) {
        return "";
    }

    @Override
    public String visitStatementAssignment(eppParser.StatementAssignmentContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public String visitStatementSimpleAssign(eppParser.StatementSimpleAssignContext ctx) {
        return visit(ctx.simpleAssign());
    }

    @Override
    public String visitStatementShow(eppParser.StatementShowContext ctx) {
        return visit(ctx.show());
    }

    @Override
    public String visitStatementIf(eppParser.StatementIfContext ctx) {
        return visit(ctx.ifStmt());
    }

    @Override
    public String visitStatementWhile(eppParser.StatementWhileContext ctx) {
        return visit(ctx.whileStmt());
    }

    @Override
    public String visitStatementFor(eppParser.StatementForContext ctx) {
        return visit(ctx.forStmt());
    }

    @Override
    public String visitAssignment(eppParser.AssignmentContext ctx) {
        visit(ctx.expr());
        String id = ctx.ID().getText();
        String exprCode = visit(ctx.expr());
        if (!variables[0].contains(id)) {
            variables[0].add(id); // nombre
            variables[1].add(String.valueOf(variables[0].size() - 1)); // índice
            variables[2].add("int"); // tipo (por defecto int)
        }
        int varIndex = variables[0].indexOf(id);
        String result = exprCode +
                        "istore " + varIndex + "\n";
        return result;
    }

    @Override
    public String visitSimpleAssign(eppParser.SimpleAssignContext ctx) {
        visit(ctx.expr());
        String id = ctx.ID().getText();
        String exprCode = visit(ctx.expr());
        if (!variables[0].contains(id)) {
            variables[0].add(id); // nombre
            variables[1].add(String.valueOf(variables[0].size() - 1)); // índice
            variables[2].add("int"); // tipo (por defecto int)
        }
        int varIndex = variables[0].indexOf(id);
        String result = exprCode +
                        "istore " + varIndex + "\n";
        return result;
    }

    @Override
    public String visitShow(eppParser.ShowContext ctx) {
        return "getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                        visit(ctx.expr()) +
                        "invokevirtual java/io/PrintStream/println(I)V\n";
    }

    @Override
    public String visitIfStmt(eppParser.IfStmtContext ctx) {
        String result = "";
        String elseLabel = "ELSE_LABEL_" + labelCount;
        String endIfLabel = "END_IF_LABEL_" + labelCount;
        labelCount++;

        result += visit(ctx.boolExpr());
        result += "ldc 1\n";
        result += "ifeq " + (ctx.block().size()>1?elseLabel : endIfLabel) + "\n";

        result += visit(ctx.block(0));
        result += "goto " + endIfLabel + "\n";

        if (ctx.block().size() > 1) {
            result += elseLabel + ":\n";
            result += visit(ctx.block(1));
        }

        result += endIfLabel + ":\n";
        return result;
    }

    @Override
    public String visitWhileStmt(eppParser.WhileStmtContext ctx) {
        String result = "";
        String startWhileLabel = "START_WHILE_LABEL_" + labelCount;
        String endWhileLabel = "END_WHILE_LABEL_" + labelCount;
        labelCount++;

        result += startWhileLabel + ":\n";
        result += visit(ctx.boolExpr());
        result += "ldc 0\n";
        result += "ifeq " + endWhileLabel + "\n";

        result += visit(ctx.block());
        result += "goto " + startWhileLabel + "\n";

        result += endWhileLabel + ":\n";
        return result;
    }

    @Override
    public String visitForStmt(eppParser.ForStmtContext ctx) {
        String result = "";
        String startForLabel = "START_FOR_LABEL_" + labelCount;
        String endForLabel = "END_FOR_LABEL_" + labelCount;
        labelCount++;

        // Usar índices altos basados en la profundidad de anidamiento
        // Cada nivel usa 2 variables: límite y contador
        // Primer for: 98, 99
        // Segundo for anidado: 96, 97
        // Tercer for anidado: 94, 95, etc.
        int limitVarIndex = 98 - (forDepth * 2);
        int counterVarIndex = 99 - (forDepth * 2);
        
        // Incrementar profundidad al entrar en el for
        forDepth++;
        
        // Evaluar la expresión del límite y guardarla
        result += visit(ctx.expr());
        result += "istore " + limitVarIndex + "\n";
        
        // Inicializar el contador en 0
        result += "ldc 0\n";
        result += "istore " + counterVarIndex + "\n";
        
        // Etiqueta de inicio del bucle
        result += startForLabel + ":\n";
        
        // Cargar el contador y el límite para compararlos
        result += "iload " + counterVarIndex + "\n";
        result += "iload " + limitVarIndex + "\n";
        
        // Si contador >= límite, salir del bucle
        result += "if_icmpge " + endForLabel + "\n";
        
        // Ejecutar el bloque de código
        result += visit(ctx.block());
        
        // Incrementar el contador
        result += "iload " + counterVarIndex + "\n";
        result += "ldc 1\n";
        result += "iadd\n";
        result += "istore " + counterVarIndex + "\n";
        
        // Volver al inicio del bucle
        result += "goto " + startForLabel + "\n";
        
        // Etiqueta de fin del bucle
        result += endForLabel + ":\n";
        
        // Decrementar profundidad al salir del for
        forDepth--;
        
        return result;
    }

    @Override
    public String visitTerminarStmt(eppParser.TerminarStmtContext ctx) {
        return "";
    }

    @Override
    public String visitBlock(eppParser.BlockContext ctx) {
        String result = "";
        for (int i=0; i<ctx.statement().size(); i++) {
            result += visit(ctx.statement(i));
        }
        return result;
    }

    @Override
    public String visitExprMas(eppParser.ExprMasContext ctx) {
        return visit(ctx.expr()) +
               visit(ctx.term()) +
               "iadd\n";
    }

    @Override
    public String visitExprMenos(eppParser.ExprMenosContext ctx) {
        return visit(ctx.expr()) +
               visit(ctx.term()) +
               "isub\n";
    }

    @Override
    public String visitExprTerm(eppParser.ExprTermContext ctx) {
        return visit(ctx.term());
    }

    @Override
    public String visitTermPor(eppParser.TermPorContext ctx) {
        return visit(ctx.term()) +
               visit(ctx.factor()) +
               "imul\n";
    }

    @Override
    public String visitTermDiv(eppParser.TermDivContext ctx) {
        return visit(ctx.term()) +
               visit(ctx.factor()) +
               "idiv\n";
    }

    @Override
    public String visitTermFactor(eppParser.TermFactorContext ctx) {
        return visit(ctx.factor());
    }

    @Override
    public String visitFactorParen(eppParser.FactorParenContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitFactorNumber(eppParser.FactorNumberContext ctx) {
        return "ldc " + ctx.NUMBER().getText() + "\n";
    }

    @Override
    public String visitFactorId(eppParser.FactorIdContext ctx) {
        String id = ctx.ID().getText();
        if (!variables[0].contains(id)) {
            System.err.println("Error: variable '" + id + "' no declarada. Cargando 0 por defecto.");
            return "ldc 0\n";
        }
        int varIndex = variables[0].indexOf(id);
        return "iload " + varIndex + "\n";
    }

    @Override
    public String visitBoolExprOr(eppParser.BoolExprOrContext ctx) {
        return visit(ctx.boolExpr()) +
               visit(ctx.boolExprT()) +
               "ior\n";
    }

    @Override
    public String visitBoolExprExprT(eppParser.BoolExprExprTContext ctx) {
        return visit(ctx.boolExprT());
    }

    @Override
    public String visitBoolExprTAnd(eppParser.BoolExprTAndContext ctx) {
        return visit(ctx.boolExprT()) +
               visit(ctx.boolExprT()) +
               "iand\n";
    }

    @Override
    public String visitBoolExprTExprF(eppParser.BoolExprTExprFContext ctx) {
        return visit(ctx.boolExprF());
    }

    @Override
    public String visitBoolExprFTrue(eppParser.BoolExprFTrueContext ctx) {
        return "ldc 1\n";
    }

    @Override
    public String visitBoolExprFFalse(eppParser.BoolExprFFalseContext ctx) {
        return "ldc 0\n";
    }

    @Override
    public String visitBoolExprFNot(eppParser.BoolExprFNotContext ctx) {
        return visit(ctx.boolExpr()) +
               "ldc 1\n" +
               "ixor\n";
    }

    @Override
    public String visitBoolExprFParen(eppParser.BoolExprFParenContext ctx) {
        return visit(ctx.boolExpr());
    }

    @Override
    public String visitBoolExprFComp(eppParser.BoolExprFCompContext ctx) {
        String result = "";
        result += visit(ctx.expr(0));
        result += visit(ctx.expr(1));
        result += visit(ctx.compOp()) + " LABEL_TRUE_" + labelCount + "\n";
        result += "ldc 0\n" +
                  "goto LABEL_END_" + labelCount + "\n" +
                  "LABEL_TRUE_" + labelCount + ":\n" +
                  "ldc 1\n" +
                  "LABEL_END_" + labelCount + ":\n";
        labelCount++;
        return result;
    }

    @Override
    public String visitCompOpIgualIgual(eppParser.CompOpIgualIgualContext ctx) {
        return "if_icmpeq";
    }

    @Override
    public String visitCompOpNoIgual(eppParser.CompOpNoIgualContext ctx) {
        return "if_icmpne";
    }

    @Override
    public String visitCompOpMenor(eppParser.CompOpMenorContext ctx) {
        return "if_icmplt";
    }

    @Override
    public String visitCompOpMenorIgual(eppParser.CompOpMenorIgualContext ctx) {
        return "if_icmple";
    }

    @Override
    public String visitCompOpMayor(eppParser.CompOpMayorContext ctx) {
        return "if_icmpgt";
    }

    @Override
    public String visitCompOpMayorIgual(eppParser.CompOpMayorIgualContext ctx) {
        return "if_icmpge";
    }
}
