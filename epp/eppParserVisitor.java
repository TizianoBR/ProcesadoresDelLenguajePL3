// Generated from eppParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link eppParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface eppParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link eppParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(eppParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineStatement}
	 * labeled alternative in {@link eppParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStatement(eppParser.LineStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineComment}
	 * labeled alternative in {@link eppParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineComment(eppParser.LineCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssignment}
	 * labeled alternative in {@link eppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(eppParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSimpleAssign}
	 * labeled alternative in {@link eppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSimpleAssign(eppParser.StatementSimpleAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementShow}
	 * labeled alternative in {@link eppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementShow(eppParser.StatementShowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link eppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(eppParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link eppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(eppParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link eppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(eppParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by {@link eppParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(eppParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link eppParser#simpleAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssign(eppParser.SimpleAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link eppParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(eppParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link eppParser#cond_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_line(eppParser.Cond_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link eppParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(eppParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link eppParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(eppParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link eppParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(eppParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link eppParser#terminarStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminarStmt(eppParser.TerminarStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link eppParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(eppParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMas}
	 * labeled alternative in {@link eppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMas(eppParser.ExprMasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link eppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTerm(eppParser.ExprTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMenos}
	 * labeled alternative in {@link eppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMenos(eppParser.ExprMenosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link eppParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDiv(eppParser.TermDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termPor}
	 * labeled alternative in {@link eppParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermPor(eppParser.TermPorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termMod}
	 * labeled alternative in {@link eppParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMod(eppParser.TermModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termFactor}
	 * labeled alternative in {@link eppParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermFactor(eppParser.TermFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorParen}
	 * labeled alternative in {@link eppParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorParen(eppParser.FactorParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorNumber}
	 * labeled alternative in {@link eppParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNumber(eppParser.FactorNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorId}
	 * labeled alternative in {@link eppParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorId(eppParser.FactorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorString}
	 * labeled alternative in {@link eppParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorString(eppParser.FactorStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprOr}
	 * labeled alternative in {@link eppParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprOr(eppParser.BoolExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprExprT}
	 * labeled alternative in {@link eppParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprExprT(eppParser.BoolExprExprTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprTExprF}
	 * labeled alternative in {@link eppParser#boolExprT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprTExprF(eppParser.BoolExprTExprFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprTAnd}
	 * labeled alternative in {@link eppParser#boolExprT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprTAnd(eppParser.BoolExprTAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprFTrue}
	 * labeled alternative in {@link eppParser#boolExprF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprFTrue(eppParser.BoolExprFTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprFFalse}
	 * labeled alternative in {@link eppParser#boolExprF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprFFalse(eppParser.BoolExprFFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprFNot}
	 * labeled alternative in {@link eppParser#boolExprF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprFNot(eppParser.BoolExprFNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprFParen}
	 * labeled alternative in {@link eppParser#boolExprF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprFParen(eppParser.BoolExprFParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExprFComp}
	 * labeled alternative in {@link eppParser#boolExprF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprFComp(eppParser.BoolExprFCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compOpIgualIgual}
	 * labeled alternative in {@link eppParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpIgualIgual(eppParser.CompOpIgualIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compOpNoIgual}
	 * labeled alternative in {@link eppParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpNoIgual(eppParser.CompOpNoIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compOpMenorIgual}
	 * labeled alternative in {@link eppParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpMenorIgual(eppParser.CompOpMenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compOpMayorIgual}
	 * labeled alternative in {@link eppParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpMayorIgual(eppParser.CompOpMayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compOpMenor}
	 * labeled alternative in {@link eppParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpMenor(eppParser.CompOpMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compOpMayor}
	 * labeled alternative in {@link eppParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpMayor(eppParser.CompOpMayorContext ctx);
}