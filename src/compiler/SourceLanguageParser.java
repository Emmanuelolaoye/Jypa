// Generated from M:/CE305/The Small Compiler/src/compiler\SourceLanguage.g4 by ANTLR 4.12.0
package compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SourceLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN_OPERATOR=1, MINUSMINUS=2, PLUSPLUS=3, NULL=4, BOOLEAN=5, IF=6, 
		ELSEIF=7, ELSE=8, WHILE=9, FOR=10, LPAREN=11, RPAREN=12, LCURLY=13, RCURLY=14, 
		EQUALS=15, EQUAL_TO=16, NOT_EQUAL=17, GREATER_THAN=18, GREATER_THAN_EQUAL=19, 
		LESS_THAN=20, LESS_THAN_EQUAL=21, NOT=22, AND=23, OR=24, MULTIPLY=25, 
		INDICES=26, DIVISION=27, REMAINDER=28, PLUS=29, MINUS=30, SEMI_COLON=31, 
		DECIMAL=32, METHOD=33, COMMA=34, RETURN=35, TYPE=36, ID=37, NUMBER=38, 
		STRING=39, DIGITS=40, WS=41, NEWL=42, COMMENT=43, CHARACTER=44;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_statement = 2, RULE_set_variable = 3, 
		RULE_if_Statement = 4, RULE_def_method = 5, RULE_set_parameter = 6, RULE_set_function_Parameter = 7, 
		RULE_method = 8, RULE_while_Statement = 9, RULE_for_Statement = 10, RULE_expression = 11, 
		RULE_name = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "statement", "set_variable", "if_Statement", "def_method", 
			"set_parameter", "set_function_Parameter", "method", "while_Statement", 
			"for_Statement", "expression", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'null'", null, "'if'", "'elif'", "'else'", "'while'", 
			"'for'", "'('", "')'", "'{'", "'}'", "'='", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'!'", "'and'", "'or'", "'*'", "'^'", "'/'", "'%'", "'+'", 
			"'-'", "';'", "'.'", "'method'", "','", "'ret'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN_OPERATOR", "MINUSMINUS", "PLUSPLUS", "NULL", "BOOLEAN", 
			"IF", "ELSEIF", "ELSE", "WHILE", "FOR", "LPAREN", "RPAREN", "LCURLY", 
			"RCURLY", "EQUALS", "EQUAL_TO", "NOT_EQUAL", "GREATER_THAN", "GREATER_THAN_EQUAL", 
			"LESS_THAN", "LESS_THAN_EQUAL", "NOT", "AND", "OR", "MULTIPLY", "INDICES", 
			"DIVISION", "REMAINDER", "PLUS", "MINUS", "SEMI_COLON", "DECIMAL", "METHOD", 
			"COMMA", "RETURN", "TYPE", "ID", "NUMBER", "STRING", "DIGITS", "WS", 
			"NEWL", "COMMENT", "CHARACTER"
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
	public String getGrammarFileName() { return "SourceLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SourceLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SourceLanguageParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			stat();
			setState(27);
			match(EOF);
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
	public static class StatContext extends ParserRuleContext {
		public List<TerminalNode> NEWL() { return getTokens(SourceLanguageParser.NEWL); }
		public TerminalNode NEWL(int i) {
			return getToken(SourceLanguageParser.NEWL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			int _alt;
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(29);
						match(NEWL);
						}
						} 
					}
					setState(34);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(38);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWL) {
							{
							{
							setState(35);
							match(NEWL);
							}
							}
							setState(40);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(41);
						statement();
						setState(45);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(42);
								match(NEWL);
								}
								} 
							}
							setState(47);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						}
						}
						} 
					}
					setState(52);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
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
	public static class StatementContext extends ParserRuleContext {
		public Set_variableContext set_variable() {
			return getRuleContext(Set_variableContext.class,0);
		}
		public If_StatementContext if_Statement() {
			return getRuleContext(If_StatementContext.class,0);
		}
		public While_StatementContext while_Statement() {
			return getRuleContext(While_StatementContext.class,0);
		}
		public For_StatementContext for_Statement() {
			return getRuleContext(For_StatementContext.class,0);
		}
		public Def_methodContext def_method() {
			return getRuleContext(Def_methodContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				set_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				if_Statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				while_Statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				for_Statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				def_method();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				method();
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
	public static class Set_variableContext extends ParserRuleContext {
		public Set_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_variable; }
	 
		public Set_variableContext() { }
		public void copyFrom(Set_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends Set_variableContext {
		public Token identifier;
		public ExpressionContext expr;
		public TerminalNode ID() { return getToken(SourceLanguageParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(SourceLanguageParser.TYPE, 0); }
		public TerminalNode EQUALS() { return getToken(SourceLanguageParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(Set_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends Set_variableContext {
		public Token identifier;
		public ExpressionContext expr;
		public TerminalNode EQUALS() { return getToken(SourceLanguageParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(SourceLanguageParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(Set_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorsContext extends Set_variableContext {
		public Token identifier;
		public Token op;
		public ExpressionContext expr;
		public TerminalNode ID() { return getToken(SourceLanguageParser.ID, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(SourceLanguageParser.ASSIGN_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorsContext(Set_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterAssignmentOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitAssignmentOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitAssignmentOperators(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentIncDecContext extends Set_variableContext {
		public Token identifier;
		public Token op;
		public TerminalNode ID() { return getToken(SourceLanguageParser.ID, 0); }
		public TerminalNode PLUSPLUS() { return getToken(SourceLanguageParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(SourceLanguageParser.MINUSMINUS, 0); }
		public AssignmentIncDecContext(Set_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterAssignmentIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitAssignmentIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitAssignmentIncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_variableContext set_variable() throws RecognitionException {
		Set_variableContext _localctx = new Set_variableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_set_variable);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(63);
					match(TYPE);
					}
				}

				setState(66);
				((VarDeclarationContext)_localctx).identifier = match(ID);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(67);
					match(EQUALS);
					setState(68);
					((VarDeclarationContext)_localctx).expr = expression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((AssignmentContext)_localctx).identifier = match(ID);
				setState(72);
				match(EQUALS);
				setState(73);
				((AssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 3:
				_localctx = new AssignmentOperatorsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				((AssignmentOperatorsContext)_localctx).identifier = match(ID);
				setState(75);
				((AssignmentOperatorsContext)_localctx).op = match(ASSIGN_OPERATOR);
				setState(76);
				((AssignmentOperatorsContext)_localctx).expr = expression(0);
				}
				break;
			case 4:
				_localctx = new AssignmentIncDecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				((AssignmentIncDecContext)_localctx).identifier = match(ID);
				setState(78);
				((AssignmentIncDecContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUSMINUS || _la==PLUSPLUS) ) {
					((AssignmentIncDecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class If_StatementContext extends ParserRuleContext {
		public StatContext elseBlock;
		public TerminalNode IF() { return getToken(SourceLanguageParser.IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SourceLanguageParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SourceLanguageParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SourceLanguageParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SourceLanguageParser.RPAREN, i);
		}
		public List<TerminalNode> LCURLY() { return getTokens(SourceLanguageParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(SourceLanguageParser.LCURLY, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(SourceLanguageParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(SourceLanguageParser.RCURLY, i);
		}
		public List<TerminalNode> NEWL() { return getTokens(SourceLanguageParser.NEWL); }
		public TerminalNode NEWL(int i) {
			return getToken(SourceLanguageParser.NEWL, i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(SourceLanguageParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(SourceLanguageParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(SourceLanguageParser.ELSE, 0); }
		public If_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterIf_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitIf_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitIf_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_StatementContext if_Statement() throws RecognitionException {
		If_StatementContext _localctx = new If_StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_Statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IF);
			setState(82);
			match(LPAREN);
			setState(83);
			expression(0);
			setState(84);
			match(RPAREN);
			setState(85);
			match(LCURLY);
			setState(86);
			stat();
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(87);
				match(NEWL);
				}
				break;
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(90);
				match(ELSEIF);
				setState(91);
				match(LPAREN);
				setState(92);
				expression(0);
				setState(93);
				match(RPAREN);
				setState(94);
				match(LCURLY);
				setState(95);
				stat();
				setState(96);
				match(RCURLY);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(103);
				match(NEWL);
				}
				break;
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(106);
				match(ELSE);
				setState(107);
				match(LCURLY);
				setState(108);
				((If_StatementContext)_localctx).elseBlock = stat();
				setState(109);
				match(RCURLY);
				}
			}

			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWL) {
				{
				setState(113);
				match(NEWL);
				}
			}

			setState(116);
			match(RCURLY);
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
	public static class Def_methodContext extends ParserRuleContext {
		public NameContext identifier;
		public ExpressionContext returnValue;
		public TerminalNode METHOD() { return getToken(SourceLanguageParser.METHOD, 0); }
		public TerminalNode LPAREN() { return getToken(SourceLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SourceLanguageParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(SourceLanguageParser.LCURLY, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(SourceLanguageParser.RCURLY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Set_parameterContext set_parameter() {
			return getRuleContext(Set_parameterContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SourceLanguageParser.RETURN, 0); }
		public List<TerminalNode> NEWL() { return getTokens(SourceLanguageParser.NEWL); }
		public TerminalNode NEWL(int i) {
			return getToken(SourceLanguageParser.NEWL, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Def_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterDef_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitDef_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitDef_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_methodContext def_method() throws RecognitionException {
		Def_methodContext _localctx = new Def_methodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(METHOD);
			setState(119);
			((Def_methodContext)_localctx).identifier = name();
			setState(120);
			match(LPAREN);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(121);
				set_parameter();
				}
				break;
			}
			setState(124);
			match(RPAREN);
			setState(125);
			match(LCURLY);
			setState(126);
			stat();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(127);
				match(RETURN);
				setState(128);
				((Def_methodContext)_localctx).returnValue = expression(0);
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWL) {
				{
				{
				setState(131);
				match(NEWL);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(RCURLY);
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
	public static class Set_parameterContext extends ParserRuleContext {
		public List<Set_function_ParameterContext> set_function_Parameter() {
			return getRuleContexts(Set_function_ParameterContext.class);
		}
		public Set_function_ParameterContext set_function_Parameter(int i) {
			return getRuleContext(Set_function_ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SourceLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SourceLanguageParser.COMMA, i);
		}
		public Set_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterSet_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitSet_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitSet_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_parameterContext set_parameter() throws RecognitionException {
		Set_parameterContext _localctx = new Set_parameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_set_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(139);
				set_function_Parameter();
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				set_function_Parameter();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Set_function_ParameterContext extends ParserRuleContext {
		public NameContext identifier;
		public TerminalNode TYPE() { return getToken(SourceLanguageParser.TYPE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Set_function_ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_function_Parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterSet_function_Parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitSet_function_Parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitSet_function_Parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_function_ParameterContext set_function_Parameter() throws RecognitionException {
		Set_function_ParameterContext _localctx = new Set_function_ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set_function_Parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(TYPE);
			setState(150);
			((Set_function_ParameterContext)_localctx).identifier = name();
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
	public static class MethodContext extends ParserRuleContext {
		public NameContext identifier;
		public TerminalNode LPAREN() { return getToken(SourceLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SourceLanguageParser.RPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SourceLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SourceLanguageParser.COMMA, i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((MethodContext)_localctx).identifier = name();
			setState(153);
			match(LPAREN);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 963687483440L) != 0)) {
				{
				setState(154);
				expression(0);
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157);
				match(COMMA);
				setState(158);
				expression(0);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RPAREN);
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
	public static class While_StatementContext extends ParserRuleContext {
		public ExpressionContext cond;
		public TerminalNode WHILE() { return getToken(SourceLanguageParser.WHILE, 0); }
		public TerminalNode LCURLY() { return getToken(SourceLanguageParser.LCURLY, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(SourceLanguageParser.RCURLY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public While_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterWhile_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitWhile_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitWhile_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_StatementContext while_Statement() throws RecognitionException {
		While_StatementContext _localctx = new While_StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(WHILE);
			setState(167);
			((While_StatementContext)_localctx).cond = expression(0);
			setState(168);
			match(LCURLY);
			setState(169);
			stat();
			setState(170);
			match(RCURLY);
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
	public static class For_StatementContext extends ParserRuleContext {
		public ExpressionContext cond;
		public Set_variableContext step;
		public TerminalNode FOR() { return getToken(SourceLanguageParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(SourceLanguageParser.LPAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(SourceLanguageParser.SEMI_COLON, 0); }
		public TerminalNode RPAREN() { return getToken(SourceLanguageParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(SourceLanguageParser.LCURLY, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(SourceLanguageParser.RCURLY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_variableContext set_variable() {
			return getRuleContext(Set_variableContext.class,0);
		}
		public For_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterFor_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitFor_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitFor_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_StatementContext for_Statement() throws RecognitionException {
		For_StatementContext _localctx = new For_StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(FOR);
			setState(173);
			match(LPAREN);
			setState(174);
			((For_StatementContext)_localctx).cond = expression(0);
			setState(175);
			match(SEMI_COLON);
			setState(176);
			((For_StatementContext)_localctx).step = set_variable();
			setState(177);
			match(RPAREN);
			setState(178);
			match(LCURLY);
			setState(179);
			stat();
			setState(180);
			match(RCURLY);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyExpressionContext extends ExpressionContext {
		public ExpressionContext l_expr;
		public Token op;
		public ExpressionContext r_expr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(SourceLanguageParser.MULTIPLY, 0); }
		public TerminalNode INDICES() { return getToken(SourceLanguageParser.INDICES, 0); }
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SourceLanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SourceLanguageParser.MINUS, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(SourceLanguageParser.NUMBER, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketsExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(SourceLanguageParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SourceLanguageParser.RPAREN, 0); }
		public BracketsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterBracketsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitBracketsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitBracketsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(SourceLanguageParser.NULL, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegateExpressionContext extends ExpressionContext {
		public Token negate;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SourceLanguageParser.NOT, 0); }
		public NegateExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterNegateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitNegateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitNegateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ExpressionContext {
		public ExpressionContext l_expr;
		public Token op;
		public ExpressionContext r_expr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL_TO() { return getToken(SourceLanguageParser.EQUAL_TO, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SourceLanguageParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SourceLanguageParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUAL() { return getToken(SourceLanguageParser.GREATER_THAN_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(SourceLanguageParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUAL() { return getToken(SourceLanguageParser.LESS_THAN_EQUAL, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(SourceLanguageParser.BOOLEAN, 0); }
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(SourceLanguageParser.STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExpressionContext extends ExpressionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public IdExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Plus_MinusContext extends ExpressionContext {
		public ExpressionContext l_expr;
		public Token op;
		public ExpressionContext r_expr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SourceLanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SourceLanguageParser.MINUS, 0); }
		public Plus_MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterPlus_Minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitPlus_Minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitPlus_Minus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionExpressionContext extends ExpressionContext {
		public ExpressionContext l_expr;
		public Token op;
		public ExpressionContext r_expr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(SourceLanguageParser.DIVISION, 0); }
		public TerminalNode REMAINDER() { return getToken(SourceLanguageParser.REMAINDER, 0); }
		public DivisionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterDivisionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitDivisionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitDivisionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndOrExpressionContext extends ExpressionContext {
		public ExpressionContext l_expr;
		public Token op;
		public ExpressionContext r_expr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SourceLanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(SourceLanguageParser.OR, 0); }
		public AndOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterAndOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitAndOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitAndOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				expression(14);
				}
				break;
			case 2:
				{
				_localctx = new NegateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				((NegateExpressionContext)_localctx).negate = match(NOT);
				setState(186);
				expression(8);
				}
				break;
			case 3:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				name();
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				method();
				}
				break;
			case 5:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(NULL);
				}
				break;
			case 6:
				{
				_localctx = new BracketsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(LPAREN);
				setState(191);
				expression(0);
				setState(192);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(NUMBER);
				}
				break;
			case 8:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(STRING);
				}
				break;
			case 9:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(200);
						((MultiplyExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==INDICES) ) {
							((MultiplyExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						((MultiplyExpressionContext)_localctx).r_expr = expression(14);
						}
						break;
					case 2:
						{
						_localctx = new DivisionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivisionExpressionContext)_localctx).l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(203);
						((DivisionExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIVISION || _la==REMAINDER) ) {
							((DivisionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						((DivisionExpressionContext)_localctx).r_expr = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new Plus_MinusContext(new ExpressionContext(_parentctx, _parentState));
						((Plus_MinusContext)_localctx).l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(206);
						((Plus_MinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Plus_MinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						((Plus_MinusContext)_localctx).r_expr = expression(12);
						}
						break;
					case 4:
						{
						_localctx = new AndOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndOrExpressionContext)_localctx).l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(209);
						((AndOrExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						((AndOrExpressionContext)_localctx).r_expr = expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ComparisonExpressionContext)_localctx).l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(212);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						((ComparisonExpressionContext)_localctx).r_expr = expression(10);
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SourceLanguageParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ID);
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
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u00de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001\u0001\u0005\u0001%\b\u0001"+
		"\n\u0001\f\u0001(\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001,\b\u0001"+
		"\n\u0001\f\u0001/\t\u0001\u0005\u00011\b\u0001\n\u0001\f\u00014\t\u0001"+
		"\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001\u0003\u0003\u0003"+
		"A\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003F\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Y\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004c\b\u0004\n\u0004\f\u0004f\t"+
		"\u0004\u0001\u0004\u0003\u0004i\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004p\b\u0004\u0001\u0004\u0003"+
		"\u0004s\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0082\b\u0005\u0001\u0005\u0005"+
		"\u0005\u0085\b\u0005\n\u0005\f\u0005\u0088\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0003\u0006\u008d\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0091\b\u0006\n\u0006\f\u0006\u0094\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\b\u0001\b\u0005"+
		"\b\u00a0\b\b\n\b\f\b\u00a3\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00c6\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00d7\b\u000b\n\u000b\f\u000b\u00da\t\u000b\u0001\f\u0001\f\u0001\f\u0000"+
		"\u0001\u0016\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u0000\u0006\u0001\u0000\u0002\u0003\u0001\u0000\u001d\u001e\u0001"+
		"\u0000\u0019\u001a\u0001\u0000\u001b\u001c\u0001\u0000\u0017\u0018\u0001"+
		"\u0000\u0010\u0015\u00f8\u0000\u001a\u0001\u0000\u0000\u0000\u00025\u0001"+
		"\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000"+
		"\u0000\bQ\u0001\u0000\u0000\u0000\nv\u0001\u0000\u0000\u0000\f\u008c\u0001"+
		"\u0000\u0000\u0000\u000e\u0095\u0001\u0000\u0000\u0000\u0010\u0098\u0001"+
		"\u0000\u0000\u0000\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00ac\u0001"+
		"\u0000\u0000\u0000\u0016\u00c5\u0001\u0000\u0000\u0000\u0018\u00db\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0005"+
		"\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001f\u0005"+
		"*\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!6\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#%\u0005*\u0000\u0000"+
		"$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)-\u0003\u0004\u0002\u0000*,\u0005*\u0000\u0000+*\u0001\u0000"+
		"\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"0&\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u00005 \u0001\u0000\u0000\u000052\u0001\u0000\u0000\u00006\u0003"+
		"\u0001\u0000\u0000\u00007>\u0003\u0006\u0003\u00008>\u0003\b\u0004\u0000"+
		"9>\u0003\u0012\t\u0000:>\u0003\u0014\n\u0000;>\u0003\n\u0005\u0000<>\u0003"+
		"\u0010\b\u0000=7\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000=9\u0001"+
		"\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?A\u0005$\u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BE\u0005%\u0000\u0000CD\u0005\u000f\u0000\u0000DF\u0003\u0016"+
		"\u000b\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FP\u0001"+
		"\u0000\u0000\u0000GH\u0005%\u0000\u0000HI\u0005\u000f\u0000\u0000IP\u0003"+
		"\u0016\u000b\u0000JK\u0005%\u0000\u0000KL\u0005\u0001\u0000\u0000LP\u0003"+
		"\u0016\u000b\u0000MN\u0005%\u0000\u0000NP\u0007\u0000\u0000\u0000O@\u0001"+
		"\u0000\u0000\u0000OG\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000P\u0007\u0001\u0000\u0000\u0000QR\u0005\u0006"+
		"\u0000\u0000RS\u0005\u000b\u0000\u0000ST\u0003\u0016\u000b\u0000TU\u0005"+
		"\f\u0000\u0000UV\u0005\r\u0000\u0000VX\u0003\u0002\u0001\u0000WY\u0005"+
		"*\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Yd\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0007\u0000\u0000[\\\u0005\u000b\u0000\u0000"+
		"\\]\u0003\u0016\u000b\u0000]^\u0005\f\u0000\u0000^_\u0005\r\u0000\u0000"+
		"_`\u0003\u0002\u0001\u0000`a\u0005\u000e\u0000\u0000ac\u0001\u0000\u0000"+
		"\u0000bZ\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000gi\u0005*\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000io\u0001\u0000\u0000\u0000jk\u0005\b\u0000\u0000kl\u0005"+
		"\r\u0000\u0000lm\u0003\u0002\u0001\u0000mn\u0005\u000e\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pr\u0001\u0000\u0000\u0000qs\u0005*\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0005\u000e\u0000"+
		"\u0000u\t\u0001\u0000\u0000\u0000vw\u0005!\u0000\u0000wx\u0003\u0018\f"+
		"\u0000xz\u0005\u000b\u0000\u0000y{\u0003\f\u0006\u0000zy\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\f\u0000"+
		"\u0000}~\u0005\r\u0000\u0000~\u0081\u0003\u0002\u0001\u0000\u007f\u0080"+
		"\u0005#\u0000\u0000\u0080\u0082\u0003\u0016\u000b\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0086\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0005*\u0000\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u000e"+
		"\u0000\u0000\u008a\u000b\u0001\u0000\u0000\u0000\u008b\u008d\u0003\u000e"+
		"\u0007\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u0092\u0001\u0000\u0000\u0000\u008e\u008f\u0005\"\u0000"+
		"\u0000\u008f\u0091\u0003\u000e\u0007\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\r\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005$\u0000\u0000\u0096"+
		"\u0097\u0003\u0018\f\u0000\u0097\u000f\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0003\u0018\f\u0000\u0099\u009b\u0005\u000b\u0000\u0000\u009a\u009c\u0003"+
		"\u0016\u000b\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u00a1\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\"\u0000\u0000\u009e\u00a0\u0003\u0016\u000b\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\f\u0000"+
		"\u0000\u00a5\u0011\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\t\u0000\u0000"+
		"\u00a7\u00a8\u0003\u0016\u000b\u0000\u00a8\u00a9\u0005\r\u0000\u0000\u00a9"+
		"\u00aa\u0003\u0002\u0001\u0000\u00aa\u00ab\u0005\u000e\u0000\u0000\u00ab"+
		"\u0013\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u00ae"+
		"\u0005\u000b\u0000\u0000\u00ae\u00af\u0003\u0016\u000b\u0000\u00af\u00b0"+
		"\u0005\u001f\u0000\u0000\u00b0\u00b1\u0003\u0006\u0003\u0000\u00b1\u00b2"+
		"\u0005\f\u0000\u0000\u00b2\u00b3\u0005\r\u0000\u0000\u00b3\u00b4\u0003"+
		"\u0002\u0001\u0000\u00b4\u00b5\u0005\u000e\u0000\u0000\u00b5\u0015\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0006\u000b\uffff\uffff\u0000\u00b7\u00b8"+
		"\u0007\u0001\u0000\u0000\u00b8\u00c6\u0003\u0016\u000b\u000e\u00b9\u00ba"+
		"\u0005\u0016\u0000\u0000\u00ba\u00c6\u0003\u0016\u000b\b\u00bb\u00c6\u0003"+
		"\u0018\f\u0000\u00bc\u00c6\u0003\u0010\b\u0000\u00bd\u00c6\u0005\u0004"+
		"\u0000\u0000\u00be\u00bf\u0005\u000b\u0000\u0000\u00bf\u00c0\u0003\u0016"+
		"\u000b\u0000\u00c0\u00c1\u0005\f\u0000\u0000\u00c1\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c6\u0005&\u0000\u0000\u00c3\u00c6\u0005\'\u0000\u0000"+
		"\u00c4\u00c6\u0005\u0005\u0000\u0000\u00c5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00c5\u00b9\u0001\u0000\u0000\u0000\u00c5\u00bb\u0001\u0000\u0000\u0000"+
		"\u00c5\u00bc\u0001\u0000\u0000\u0000\u00c5\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c5\u00be\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00d8\u0001\u0000\u0000\u0000\u00c7\u00c8\n\r\u0000\u0000\u00c8"+
		"\u00c9\u0007\u0002\u0000\u0000\u00c9\u00d7\u0003\u0016\u000b\u000e\u00ca"+
		"\u00cb\n\f\u0000\u0000\u00cb\u00cc\u0007\u0003\u0000\u0000\u00cc\u00d7"+
		"\u0003\u0016\u000b\r\u00cd\u00ce\n\u000b\u0000\u0000\u00ce\u00cf\u0007"+
		"\u0001\u0000\u0000\u00cf\u00d7\u0003\u0016\u000b\f\u00d0\u00d1\n\n\u0000"+
		"\u0000\u00d1\u00d2\u0007\u0004\u0000\u0000\u00d2\u00d7\u0003\u0016\u000b"+
		"\u000b\u00d3\u00d4\n\t\u0000\u0000\u00d4\u00d5\u0007\u0005\u0000\u0000"+
		"\u00d5\u00d7\u0003\u0016\u000b\n\u00d6\u00c7\u0001\u0000\u0000\u0000\u00d6"+
		"\u00ca\u0001\u0000\u0000\u0000\u00d6\u00cd\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d7"+
		"\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d9\u0017\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u0005%\u0000\u0000\u00dc\u0019"+
		"\u0001\u0000\u0000\u0000\u0018 &-25=@EOXdhorz\u0081\u0086\u008c\u0092"+
		"\u009b\u00a1\u00c5\u00d6\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}