// Generated from csvParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class csvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, NUMBER=2, STRING=3, SEP=4, NEWLINE=5, BLANK=6;
	public static final int
		RULE_prog = 0, RULE_rows = 1, RULE_firstRow = 2, RULE_row = 3, RULE_field = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "rows", "firstRow", "row", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT", "NUMBER", "STRING", "SEP", "NEWLINE", "BLANK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "csvParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public FirstRowContext FirstRow;
		public RowsContext Rows;
		public TerminalNode NEWLINE() { return getToken(csvParser.NEWLINE, 0); }
		public FirstRowContext firstRow() {
			return getRuleContext(FirstRowContext.class,0);
		}
		public RowsContext rows() {
			return getRuleContext(RowsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csvParserVisitor ) return ((csvParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((ProgContext)_localctx).FirstRow = firstRow();
			setState(11);
			match(NEWLINE);
			setState(12);
			((ProgContext)_localctx).Rows = rows(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowsContext extends ParserRuleContext {
		public RowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rows; }
	 
		public RowsContext() { }
		public void copyFrom(RowsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyRowsContext extends RowsContext {
		public RowsContext Rows;
		public RowContext Row;
		public TerminalNode SEP() { return getToken(csvParser.SEP, 0); }
		public RowsContext rows() {
			return getRuleContext(RowsContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ManyRowsContext(RowsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csvParserVisitor ) return ((csvParserVisitor<? extends T>)visitor).visitManyRows(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleRowContext extends RowsContext {
		public RowContext Row;
		public TerminalNode NEWLINE() { return getToken(csvParser.NEWLINE, 0); }
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public SingleRowContext(RowsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csvParserVisitor ) return ((csvParserVisitor<? extends T>)visitor).visitSingleRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowsContext rows() throws RecognitionException {
		return rows(0);
	}

	private RowsContext rows(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RowsContext _localctx = new RowsContext(_ctx, _parentState);
		RowsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rows, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleRowContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(15);
			((SingleRowContext)_localctx).Row = row();
			setState(16);
			match(NEWLINE);
			}
			_ctx.stop = _input.LT(-1);
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ManyRowsContext(new RowsContext(_parentctx, _parentState));
					((ManyRowsContext)_localctx).Rows = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_rows);
					setState(18);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(19);
					match(SEP);
					setState(20);
					((ManyRowsContext)_localctx).Row = row();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FirstRowContext extends ParserRuleContext {
		public FirstRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstRow; }
	 
		public FirstRowContext() { }
		public void copyFrom(FirstRowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyFieldsFRContext extends FirstRowContext {
		public FieldContext Field;
		public FirstRowContext FirstRow;
		public TerminalNode SEP() { return getToken(csvParser.SEP, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FirstRowContext firstRow() {
			return getRuleContext(FirstRowContext.class,0);
		}
		public ManyFieldsFRContext(FirstRowContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csvParserVisitor ) return ((csvParserVisitor<? extends T>)visitor).visitManyFieldsFR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleFieldFRContext extends FirstRowContext {
		public FieldContext Field;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public SingleFieldFRContext(FirstRowContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csvParserVisitor ) return ((csvParserVisitor<? extends T>)visitor).visitSingleFieldFR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstRowContext firstRow() throws RecognitionException {
		FirstRowContext _localctx = new FirstRowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_firstRow);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new SingleFieldFRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				((SingleFieldFRContext)_localctx).Field = field();
				}
				break;
			case 2:
				_localctx = new ManyFieldsFRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				((ManyFieldsFRContext)_localctx).Field = field();
				setState(28);
				match(SEP);
				setState(29);
				((ManyFieldsFRContext)_localctx).FirstRow = firstRow();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
	 
		public RowContext() { }
		public void copyFrom(RowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleFieldRContext extends RowContext {
		public FieldContext Field;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public SingleFieldRContext(RowContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csvParserVisitor ) return ((csvParserVisitor<? extends T>)visitor).visitSingleFieldR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyFieldsRContext extends RowContext {
		public FieldContext Field;
		public RowContext Row;
		public TerminalNode SEP() { return getToken(csvParser.SEP, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ManyFieldsRContext(RowContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csvParserVisitor ) return ((csvParserVisitor<? extends T>)visitor).visitManyFieldsR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_row);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SingleFieldRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((SingleFieldRContext)_localctx).Field = field();
				}
				break;
			case 2:
				_localctx = new ManyFieldsRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((ManyFieldsRContext)_localctx).Field = field();
				setState(35);
				match(SEP);
				setState(36);
				((ManyFieldsRContext)_localctx).Row = row();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(csvParser.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(csvParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(csvParser.STRING, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csvParserVisitor ) return ((csvParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return rows_sempred((RowsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rows_sempred(RowsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0006+\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016"+
		"\b\u0001\n\u0001\f\u0001\u0019\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0000\u0001\u0002\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0001\u0001\u0000\u0001\u0003(\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000"+
		"\u0006&\u0001\u0000\u0000\u0000\b(\u0001\u0000\u0000\u0000\n\u000b\u0003"+
		"\u0004\u0002\u0000\u000b\f\u0005\u0005\u0000\u0000\f\r\u0003\u0002\u0001"+
		"\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0006\u0001\uffff\uffff"+
		"\u0000\u000f\u0010\u0003\u0006\u0003\u0000\u0010\u0011\u0005\u0005\u0000"+
		"\u0000\u0011\u0017\u0001\u0000\u0000\u0000\u0012\u0013\n\u0001\u0000\u0000"+
		"\u0013\u0014\u0005\u0004\u0000\u0000\u0014\u0016\u0003\u0006\u0003\u0000"+
		"\u0015\u0012\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u001a \u0003\b\u0004\u0000\u001b\u001c\u0003\b\u0004\u0000\u001c\u001d"+
		"\u0005\u0004\u0000\u0000\u001d\u001e\u0003\u0004\u0002\u0000\u001e \u0001"+
		"\u0000\u0000\u0000\u001f\u001a\u0001\u0000\u0000\u0000\u001f\u001b\u0001"+
		"\u0000\u0000\u0000 \u0005\u0001\u0000\u0000\u0000!\'\u0003\b\u0004\u0000"+
		"\"#\u0003\b\u0004\u0000#$\u0005\u0004\u0000\u0000$%\u0003\u0006\u0003"+
		"\u0000%\'\u0001\u0000\u0000\u0000&!\u0001\u0000\u0000\u0000&\"\u0001\u0000"+
		"\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000()\u0007\u0000\u0000\u0000"+
		")\t\u0001\u0000\u0000\u0000\u0003\u0017\u001f&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}