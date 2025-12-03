// Generated from csvParser.g4 by ANTLR 4.13.2
package csv;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csvParser}.
 */
public interface csvParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csvParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(csvParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(csvParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link csvParser#firstRow}.
	 * @param ctx the parse tree
	 */
	void enterFirstRow(csvParser.FirstRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvParser#firstRow}.
	 * @param ctx the parse tree
	 */
	void exitFirstRow(csvParser.FirstRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link csvParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(csvParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(csvParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link csvParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(csvParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(csvParser.FieldContext ctx);
}