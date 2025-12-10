// Generated from csvParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link csvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface csvParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link csvParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(csvParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ManyRows}
	 * labeled alternative in {@link csvParser#rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyRows(csvParser.ManyRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleRow}
	 * labeled alternative in {@link csvParser#rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleRow(csvParser.SingleRowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleFieldFR}
	 * labeled alternative in {@link csvParser#firstRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFieldFR(csvParser.SingleFieldFRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ManyFieldsFR}
	 * labeled alternative in {@link csvParser#firstRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyFieldsFR(csvParser.ManyFieldsFRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleFieldR}
	 * labeled alternative in {@link csvParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFieldR(csvParser.SingleFieldRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ManyFieldsR}
	 * labeled alternative in {@link csvParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyFieldsR(csvParser.ManyFieldsRContext ctx);
	/**
	 * Visit a parse tree produced by {@link csvParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(csvParser.FieldContext ctx);
}