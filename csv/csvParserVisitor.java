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
	 * Visit a parse tree produced by {@link csvParser#rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRows(csvParser.RowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link csvParser#firstRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstRow(csvParser.FirstRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link csvParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(csvParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link csvParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(csvParser.FieldContext ctx);
}