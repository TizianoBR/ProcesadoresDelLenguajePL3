// Generated from c:/Users/tizia/Desktop/Universidad/Procesadores del lenguaje/ProcesadoresDelLenguajePL3/epp/eppLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class eppLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASIGNAR=1, MOSTRAR=2, SI=3, NO=4, TERMINAR=5, MIENTRAS=6, ARROW=7, QMARKS=8, 
		END=9, AND=10, OR=11, NOT=12, ID=13, NUMBER=14, STRING=15, COMMENT_LINE=16, 
		NEWLINE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASIGNAR", "MOSTRAR", "SI", "NO", "TERMINAR", "MIENTRAS", "ARROW", "QMARKS", 
			"END", "AND", "OR", "NOT", "ID", "NUMBER", "STRING", "COMMENT_LINE", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'asignar'", "'mostrar'", "'si'", "'no'", "'terminar'", "'mientras'", 
			"'->'", "'???'", null, "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASIGNAR", "MOSTRAR", "SI", "NO", "TERMINAR", "MIENTRAS", "ARROW", 
			"QMARKS", "END", "AND", "OR", "NOT", "ID", "NUMBER", "STRING", "COMMENT_LINE", 
			"NEWLINE", "WS"
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


	public eppLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "eppLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0005\bW\b\b\n\b\f\bZ\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fh\b"+
		"\f\n\f\f\fk\t\f\u0001\r\u0004\rn\b\r\u000b\r\f\ro\u0001\r\u0001\r\u0004"+
		"\rt\b\r\u000b\r\f\ru\u0003\rx\b\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"|\b\u000e\n\u000e\f\u000e\u007f\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0085\b\u000f\n\u000f\f\u000f\u0088\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u008f\b\u0010\u0001\u0011\u0004\u0011\u0092\b\u0011\u000b\u0011\f\u0011"+
		"\u0093\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012\u0001\u0000\u0006\u0002\u0000\t\t  \u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0002\u0000\n\n\r\r\u009f"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003-\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u0007"+
		"8\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000bD\u0001\u0000"+
		"\u0000\u0000\rM\u0001\u0000\u0000\u0000\u000fP\u0001\u0000\u0000\u0000"+
		"\u0011T\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015`"+
		"\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019e\u0001\u0000"+
		"\u0000\u0000\u001bm\u0001\u0000\u0000\u0000\u001dy\u0001\u0000\u0000\u0000"+
		"\u001f\u0082\u0001\u0000\u0000\u0000!\u008e\u0001\u0000\u0000\u0000#\u0091"+
		"\u0001\u0000\u0000\u0000%&\u0005a\u0000\u0000&\'\u0005s\u0000\u0000\'"+
		"(\u0005i\u0000\u0000()\u0005g\u0000\u0000)*\u0005n\u0000\u0000*+\u0005"+
		"a\u0000\u0000+,\u0005r\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005"+
		"m\u0000\u0000./\u0005o\u0000\u0000/0\u0005s\u0000\u000001\u0005t\u0000"+
		"\u000012\u0005r\u0000\u000023\u0005a\u0000\u000034\u0005r\u0000\u0000"+
		"4\u0004\u0001\u0000\u0000\u000056\u0005s\u0000\u000067\u0005i\u0000\u0000"+
		"7\u0006\u0001\u0000\u0000\u000089\u0005n\u0000\u00009:\u0005o\u0000\u0000"+
		":\b\u0001\u0000\u0000\u0000;<\u0005t\u0000\u0000<=\u0005e\u0000\u0000"+
		"=>\u0005r\u0000\u0000>?\u0005m\u0000\u0000?@\u0005i\u0000\u0000@A\u0005"+
		"n\u0000\u0000AB\u0005a\u0000\u0000BC\u0005r\u0000\u0000C\n\u0001\u0000"+
		"\u0000\u0000DE\u0005m\u0000\u0000EF\u0005i\u0000\u0000FG\u0005e\u0000"+
		"\u0000GH\u0005n\u0000\u0000HI\u0005t\u0000\u0000IJ\u0005r\u0000\u0000"+
		"JK\u0005a\u0000\u0000KL\u0005s\u0000\u0000L\f\u0001\u0000\u0000\u0000"+
		"MN\u0005-\u0000\u0000NO\u0005>\u0000\u0000O\u000e\u0001\u0000\u0000\u0000"+
		"PQ\u0005?\u0000\u0000QR\u0005?\u0000\u0000RS\u0005?\u0000\u0000S\u0010"+
		"\u0001\u0000\u0000\u0000TX\u0005;\u0000\u0000UW\u0007\u0000\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[\\\u0005P\u0000\u0000\\\u0012\u0001\u0000\u0000\u0000]^\u0005"+
		"&\u0000\u0000^_\u0005&\u0000\u0000_\u0014\u0001\u0000\u0000\u0000`a\u0005"+
		"|\u0000\u0000ab\u0005|\u0000\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005"+
		"!\u0000\u0000d\u0018\u0001\u0000\u0000\u0000ei\u0007\u0001\u0000\u0000"+
		"fh\u0007\u0002\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u001a\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000ln\u0007\u0003\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pw\u0001\u0000\u0000\u0000qs\u0005.\u0000"+
		"\u0000rt\u0007\u0003\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001"+
		"\u0000\u0000\u0000wq\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x\u001c\u0001\u0000\u0000\u0000y}\u0005\"\u0000\u0000z|\b\u0004\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\"\u0000\u0000"+
		"\u0081\u001e\u0001\u0000\u0000\u0000\u0082\u0086\u0005#\u0000\u0000\u0083"+
		"\u0085\b\u0005\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0006\u000f\u0000\u0000\u008a \u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\r\u0000\u0000\u008c\u008f\u0005\n"+
		"\u0000\u0000\u008d\u008f\u0007\u0005\u0000\u0000\u008e\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\"\u0001\u0000\u0000"+
		"\u0000\u0090\u0092\u0007\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0006\u0011\u0000\u0000\u0096$\u0001\u0000\u0000\u0000"+
		"\n\u0000Xiouw}\u0086\u008e\u0093\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}