// Generated from /home/aybehrouz/IdeaProjects/maven/argon/src/main/java/org/argonlang/argc/grammar/ArgonParser.g4 by ANTLR 4.9.1
package org.argonlang.argc.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArgonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, AS=3, BOOLEAN=4, BREAK=5, BYTE=6, CASE=7, CATCH=8, 
		CHAR=9, CLASS=10, CONST=11, CONTINUE=12, DEFAULT=13, DO=14, DOUBLE=15, 
		ELSE=16, ENUM=17, EXTENDS=18, FINAL=19, FINALLY=20, FLOAT=21, FOR=22, 
		IF=23, GOTO=24, IMPLEMENTS=25, IMPORT=26, INSTANCEOF=27, INT=28, INTERFACE=29, 
		LONG=30, NATIVE=31, NEW=32, PACKAGE=33, PRIVATE=34, PROTECTED=35, PUBLIC=36, 
		RETURN=37, SHORT=38, STATIC=39, STRICTFP=40, SUPER=41, SWITCH=42, SYNCHRONIZED=43, 
		THIS=44, THROW=45, THROWS=46, TRANSIENT=47, TRY=48, VAR=49, VOID=50, VOLATILE=51, 
		WHILE=52, DECIMAL_LITERAL=53, HEX_LITERAL=54, OCT_LITERAL=55, BINARY_LITERAL=56, 
		FLOAT_LITERAL=57, HEX_FLOAT_LITERAL=58, BOOL_LITERAL=59, CHAR_LITERAL=60, 
		STRING_LITERAL=61, NULL_LITERAL=62, LPAREN=63, RPAREN=64, LBRACE=65, RBRACE=66, 
		LBRACK=67, RBRACK=68, SEMI=69, COMMA=70, DOT=71, ASSIGN=72, GT=73, LT=74, 
		BANG=75, TILDE=76, QUESTION=77, COLON=78, EQUAL=79, LE=80, GE=81, NOTEQUAL=82, 
		AND=83, OR=84, INC=85, DEC=86, ADD=87, SUB=88, MUL=89, DIV=90, BITAND=91, 
		BITOR=92, CARET=93, MOD=94, ADD_ASSIGN=95, SUB_ASSIGN=96, MUL_ASSIGN=97, 
		DIV_ASSIGN=98, AND_ASSIGN=99, OR_ASSIGN=100, XOR_ASSIGN=101, MOD_ASSIGN=102, 
		LSHIFT_ASSIGN=103, RSHIFT_ASSIGN=104, URSHIFT_ASSIGN=105, ARROW=106, COLONCOLON=107, 
		AT=108, ELLIPSIS=109, WS=110, COMMENT=111, LINE_COMMENT=112, IDENTIFIER=113;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_classBody = 16, RULE_interfaceBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_methodDeclaration = 20, 
		RULE_methodBody = 21, RULE_typeTypeOrVoid = 22, RULE_genericMethodDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_constructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_interfaceMethodModifier = 32, RULE_genericInterfaceMethodDeclaration = 33, 
		RULE_variableDeclarators = 34, RULE_variableDeclarator = 35, RULE_variableInitializer = 36, 
		RULE_arrayInitializer = 37, RULE_classOrInterfaceType = 38, RULE_typeArgument = 39, 
		RULE_qualifiedNameList = 40, RULE_formalParameters = 41, RULE_formalParameterList = 42, 
		RULE_formalParameter = 43, RULE_lastFormalParameter = 44, RULE_qualifiedName = 45, 
		RULE_literal = 46, RULE_integerLiteral = 47, RULE_floatLiteral = 48, RULE_altAnnotationQualifiedName = 49, 
		RULE_annotation = 50, RULE_elementValuePairs = 51, RULE_elementValuePair = 52, 
		RULE_elementValue = 53, RULE_elementValueArrayInitializer = 54, RULE_annotationTypeDeclaration = 55, 
		RULE_annotationTypeBody = 56, RULE_annotationTypeElementDeclaration = 57, 
		RULE_annotationTypeElementRest = 58, RULE_annotationMethodOrConstantRest = 59, 
		RULE_annotationMethodRest = 60, RULE_annotationConstantRest = 61, RULE_defaultValue = 62, 
		RULE_block = 63, RULE_blockStatement = 64, RULE_localVariableDeclaration = 65, 
		RULE_localTypeDeclaration = 66, RULE_statement = 67, RULE_catchClause = 68, 
		RULE_catchType = 69, RULE_finallyBlock = 70, RULE_resourceSpecification = 71, 
		RULE_resources = 72, RULE_resource = 73, RULE_switchBlockStatementGroup = 74, 
		RULE_switchLabel = 75, RULE_forControl = 76, RULE_forInit = 77, RULE_enhancedForControl = 78, 
		RULE_parExpression = 79, RULE_expressionList = 80, RULE_methodCall = 81, 
		RULE_expression = 82, RULE_lambdaExpression = 83, RULE_lambdaParameters = 84, 
		RULE_lambdaBody = 85, RULE_primary = 86, RULE_classType = 87, RULE_creator = 88, 
		RULE_createdName = 89, RULE_innerCreator = 90, RULE_arrayCreatorRest = 91, 
		RULE_classCreatorRest = 92, RULE_explicitGenericInvocation = 93, RULE_typeArgumentsOrDiamond = 94, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 95, RULE_nonWildcardTypeArguments = 96, 
		RULE_typeList = 97, RULE_typeType = 98, RULE_simpleType = 99, RULE_primitiveType = 100, 
		RULE_typeArguments = 101, RULE_superSuffix = 102, RULE_explicitGenericInvocationSuffix = 103, 
		RULE_arguments = 104;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "classBody", 
			"interfaceBody", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", 
			"methodBody", "typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
			"variableDeclarators", "variableDeclarator", "variableInitializer", "arrayInitializer", 
			"classOrInterfaceType", "typeArgument", "qualifiedNameList", "formalParameters", 
			"formalParameterList", "formalParameter", "lastFormalParameter", "qualifiedName", 
			"literal", "integerLiteral", "floatLiteral", "altAnnotationQualifiedName", 
			"annotation", "elementValuePairs", "elementValuePair", "elementValue", 
			"elementValueArrayInitializer", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodOrConstantRest", 
			"annotationMethodRest", "annotationConstantRest", "defaultValue", "block", 
			"blockStatement", "localVariableDeclaration", "localTypeDeclaration", 
			"statement", "catchClause", "catchType", "finallyBlock", "resourceSpecification", 
			"resources", "resource", "switchBlockStatementGroup", "switchLabel", 
			"forControl", "forInit", "enhancedForControl", "parExpression", "expressionList", 
			"methodCall", "expression", "lambdaExpression", "lambdaParameters", "lambdaBody", 
			"primary", "classType", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
			"classCreatorRest", "explicitGenericInvocation", "typeArgumentsOrDiamond", 
			"nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", "typeList", 
			"typeType", "simpleType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'as'", "'boolean'", "'break'", "'byte'", 
			"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'var'", "'void'", "'volatile'", "'while'", null, 
			null, null, null, null, null, null, null, null, "'null'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
			"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='", "'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "AS", "BOOLEAN", "BREAK", "BYTE", "CASE", 
			"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
			"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", 
			"GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", 
			"NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			"SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", 
			"THROW", "THROWS", "TRANSIENT", "TRY", "VAR", "VOID", "VOLATILE", "WHILE", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", 
			"IDENTIFIER"
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
	public String getGrammarFileName() { return "ArgonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArgonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArgonParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			packageDeclaration();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(211);
				importDeclaration();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PUBLIC))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (AT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				{
				setState(217);
				typeDeclaration();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(ArgonParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				{
				setState(225);
				annotation();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(PACKAGE);
			setState(232);
			qualifiedName();
			setState(233);
			match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ArgonParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public TerminalNode DOT() { return getToken(ArgonParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(ArgonParser.MUL, 0); }
		public TerminalNode AS() { return getToken(ArgonParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IMPORT);
			setState(236);
			qualifiedName();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(237);
				match(DOT);
				setState(238);
				match(MUL);
				}
			}

			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(241);
				match(AS);
				setState(242);
				match(IDENTIFIER);
				}
			}

			setState(245);
			match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PUBLIC:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(247);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(257);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(253);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(254);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(255);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(256);
					annotationTypeDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(ArgonParser.NATIVE, 0); }
		public TerminalNode STATIC() { return getToken(ArgonParser.STATIC, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(ArgonParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(ArgonParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(ArgonParser.VOLATILE, 0); }
		public TerminalNode PROTECTED() { return getToken(ArgonParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(ArgonParser.PRIVATE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PUBLIC:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(NATIVE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(STATIC);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				match(VOLATILE);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(ArgonParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ArgonParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(ArgonParser.FINAL, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(ArgonParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(FINAL);
				}
				break;
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ArgonParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ArgonParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(ArgonParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(CLASS);
			setState(283);
			match(IDENTIFIER);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(284);
				typeParameters();
				}
			}

			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(287);
				match(EXTENDS);
				setState(288);
				typeType();
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(291);
				match(IMPLEMENTS);
				setState(292);
				typeList();
				}
			}

			setState(295);
			classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ArgonParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(ArgonParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(LT);
			setState(298);
			typeParameter();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(299);
				match(COMMA);
				setState(300);
				typeParameter();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(ArgonParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					annotation();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(314);
			match(IDENTIFIER);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(315);
				match(EXTENDS);
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(316);
						annotation();
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(322);
				typeBound();
				}
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(ArgonParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(ArgonParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			typeType();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(326);
				match(BITAND);
				setState(327);
				typeType();
				}
				}
				setState(332);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(ArgonParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(ArgonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArgonParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(ArgonParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArgonParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ENUM);
			setState(334);
			match(IDENTIFIER);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(335);
				match(IMPLEMENTS);
				setState(336);
				typeList();
				}
			}

			setState(339);
			match(LBRACE);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(340);
				enumConstants();
				}
			}

			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(343);
				match(COMMA);
				}
			}

			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(346);
				enumBodyDeclarations();
				}
			}

			setState(349);
			match(RBRACE);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			enumConstant();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352);
					match(COMMA);
					setState(353);
					enumConstant();
					}
					} 
				}
				setState(358);
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
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(359);
					annotation();
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(365);
			match(IDENTIFIER);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(366);
				arguments();
				}
			}

			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(369);
				classBody();
				}
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(SEMI);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(373);
				classBodyDeclaration();
				}
				}
				setState(378);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ArgonParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ArgonParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(INTERFACE);
			setState(380);
			match(IDENTIFIER);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(381);
				typeParameters();
				}
			}

			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(384);
				match(EXTENDS);
				setState(385);
				typeList();
				}
			}

			setState(388);
			interfaceBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ArgonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArgonParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(LBRACE);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(391);
				classBodyDeclaration();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ArgonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArgonParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(LBRACE);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (AT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				{
				setState(400);
				interfaceBodyDeclaration();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ArgonParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(409);
					match(STATIC);
					}
				}

				setState(412);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	 
		public MemberDeclarationContext() { }
		public void copyFrom(MemberDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TempContext extends MemberDeclarationContext {
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TempContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTemp(this);
		}
	}
	public static class InnerInterfaceDeclarationContext extends MemberDeclarationContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InnerInterfaceDeclarationContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterInnerInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitInnerInterfaceDeclaration(this);
		}
	}
	public static class InnerEnumDeclarationContext extends MemberDeclarationContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InnerEnumDeclarationContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterInnerEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitInnerEnumDeclaration(this);
		}
	}
	public static class ConstructorDeclarationFullContext extends MemberDeclarationContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ConstructorDeclarationFullContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterConstructorDeclarationFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitConstructorDeclarationFull(this);
		}
	}
	public static class InnerClassDeclarationContext extends MemberDeclarationContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InnerClassDeclarationContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterInnerClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitInnerClassDeclaration(this);
		}
	}
	public static class MethodDeclarationFullContext extends MemberDeclarationContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public MethodDeclarationFullContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterMethodDeclarationFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitMethodDeclarationFull(this);
		}
	}
	public static class GenericMethodDeclarationFullContext extends MemberDeclarationContext {
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public GenericMethodDeclarationFullContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterGenericMethodDeclarationFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitGenericMethodDeclarationFull(this);
		}
	}
	public static class FieldDeclarationFullContext extends MemberDeclarationContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FieldDeclarationFullContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterFieldDeclarationFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitFieldDeclarationFull(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDeclaration);
		int _la;
		try {
			int _alt;
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new MethodDeclarationFullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(416);
						modifier();
						}
						} 
					}
					setState(421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(422);
				methodDeclaration();
				}
				break;
			case 2:
				_localctx = new GenericMethodDeclarationFullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(423);
					modifier();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(429);
				genericMethodDeclaration();
				}
				break;
			case 3:
				_localctx = new FieldDeclarationFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(430);
						modifier();
						}
						} 
					}
					setState(435);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(436);
				fieldDeclaration();
				}
				break;
			case 4:
				_localctx = new ConstructorDeclarationFullContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(437);
						modifier();
						}
						} 
					}
					setState(442);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(443);
				constructorDeclaration();
				}
				break;
			case 5:
				_localctx = new TempContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(444);
					modifier();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				_localctx = new InnerInterfaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(451);
					modifier();
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(457);
				interfaceDeclaration();
				}
				break;
			case 7:
				_localctx = new TempContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(458);
						modifier();
						}
						} 
					}
					setState(463);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(464);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				_localctx = new InnerClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(465);
					modifier();
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(471);
				classDeclaration();
				}
				break;
			case 9:
				_localctx = new InnerEnumDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(472);
					modifier();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(478);
				enumDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ArgonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ArgonParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ArgonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ArgonParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(ArgonParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			typeTypeOrVoid();
			setState(482);
			match(IDENTIFIER);
			setState(483);
			formalParameters();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(484);
				match(LBRACK);
				setState(485);
				match(RBRACK);
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(491);
				match(THROWS);
				setState(492);
				qualifiedNameList();
				}
			}

			setState(495);
			methodBody();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodBody);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ArgonParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeTypeOrVoid);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			typeParameters();
			setState(506);
			methodDeclaration();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			typeParameters();
			setState(509);
			constructorDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(ArgonParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(IDENTIFIER);
			setState(512);
			formalParameters();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(513);
				match(THROWS);
				setState(514);
				qualifiedNameList();
				}
			}

			setState(517);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			typeType();
			setState(520);
			variableDeclarators();
			setState(521);
			match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VAR:
			case VOID:
			case VOLATILE:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(523);
						modifier();
						}
						} 
					}
					setState(528);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(529);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(537);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(538);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(539);
				enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			typeType();
			setState(543);
			constantDeclarator();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(544);
				match(COMMA);
				setState(545);
				constantDeclarator();
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(551);
			match(SEMI);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ArgonParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ArgonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ArgonParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ArgonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ArgonParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(IDENTIFIER);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(554);
				match(LBRACK);
				setState(555);
				match(RBRACK);
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(ASSIGN);
			setState(562);
			variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ArgonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ArgonParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ArgonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ArgonParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(ArgonParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(564);
					interfaceMethodModifier();
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case VOID:
			case AT:
			case IDENTIFIER:
				{
				setState(570);
				typeTypeOrVoid();
				}
				break;
			case LT:
				{
				setState(571);
				typeParameters();
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(572);
						annotation();
						}
						} 
					}
					setState(577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(578);
				typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(582);
			match(IDENTIFIER);
			setState(583);
			formalParameters();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(584);
				match(LBRACK);
				setState(585);
				match(RBRACK);
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(591);
				match(THROWS);
				setState(592);
				qualifiedNameList();
				}
			}

			setState(595);
			methodBody();
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

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(ArgonParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ArgonParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(ArgonParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(ArgonParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(ArgonParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodModifier);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(601);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(602);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			typeParameters();
			setState(606);
			interfaceMethodDeclaration();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			variableDeclarator();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(609);
				match(COMMA);
				setState(610);
				variableDeclarator();
				}
				}
				setState(615);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ArgonParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(IDENTIFIER);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(617);
				match(ASSIGN);
				setState(618);
				variableInitializer();
				}
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableInitializer);
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VAR:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ArgonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArgonParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(LBRACE);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(626);
				variableInitializer();
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(627);
						match(COMMA);
						setState(628);
						variableInitializer();
						}
						} 
					}
					setState(633);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(634);
					match(COMMA);
					}
				}

				}
			}

			setState(639);
			match(RBRACE);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArgonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArgonParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ArgonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ArgonParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(IDENTIFIER);
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(642);
				typeArguments();
				}
				break;
			}
			setState(652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(645);
					match(DOT);
					setState(646);
					match(IDENTIFIER);
					setState(648);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(647);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ArgonParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(ArgonParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(ArgonParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeArgument);
		int _la;
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT || _la==IDENTIFIER) {
					{
					{
					setState(656);
					annotation();
					}
					}
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(662);
				match(QUESTION);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(663);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(664);
					typeType();
					}
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			qualifiedName();
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(670);
				match(COMMA);
				setState(671);
				qualifiedName();
				}
				}
				setState(676);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(LPAREN);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(678);
				formalParameterList();
				}
			}

			setState(681);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				formalParameter();
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(684);
						match(COMMA);
						setState(685);
						formalParameter();
						}
						} 
					}
					setState(690);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(691);
					match(COMMA);
					setState(692);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(698);
					variableModifier();
					}
					} 
				}
				setState(703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(704);
			typeType();
			setState(705);
			match(IDENTIFIER);
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(ArgonParser.ELLIPSIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(707);
					variableModifier();
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(713);
			typeType();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				{
				setState(714);
				annotation();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			match(ELLIPSIS);
			setState(721);
			match(IDENTIFIER);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArgonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArgonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ArgonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ArgonParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(IDENTIFIER);
			setState(728);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(724);
					match(DOT);
					setState(725);
					match(IDENTIFIER);
					}
					} 
				}
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(ArgonParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ArgonParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(ArgonParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(ArgonParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literal);
		try {
			setState(737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(733);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(734);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(735);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(736);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(ArgonParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ArgonParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(ArgonParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ArgonParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(ArgonParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(ArgonParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

	public static class AltAnnotationQualifiedNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ArgonParser.AT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArgonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArgonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ArgonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ArgonParser.DOT, i);
		}
		public AltAnnotationQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAnnotationQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterAltAnnotationQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitAltAnnotationQualifiedName(this);
		}
	}

	public final AltAnnotationQualifiedNameContext altAnnotationQualifiedName() throws RecognitionException {
		AltAnnotationQualifiedNameContext _localctx = new AltAnnotationQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(743);
				match(IDENTIFIER);
				setState(744);
				match(DOT);
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(750);
			match(AT);
			setState(751);
			match(IDENTIFIER);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ArgonParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AltAnnotationQualifiedNameContext altAnnotationQualifiedName() {
			return getRuleContext(AltAnnotationQualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(753);
				match(AT);
				setState(754);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(755);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(758);
				match(LPAREN);
				setState(761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(759);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(760);
					elementValue();
					}
					break;
				}
				setState(763);
				match(RPAREN);
				}
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			elementValuePair();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(767);
				match(COMMA);
				setState(768);
				elementValuePair();
				}
				}
				setState(773);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ArgonParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(IDENTIFIER);
			setState(775);
			match(ASSIGN);
			setState(776);
			elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elementValue);
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ArgonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArgonParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(LBRACE);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(784);
				elementValue();
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(785);
						match(COMMA);
						setState(786);
						elementValue();
						}
						} 
					}
					setState(791);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				}
			}

			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(794);
				match(COMMA);
				}
			}

			setState(797);
			match(RBRACE);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ArgonParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(ArgonParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(AT);
			setState(800);
			match(INTERFACE);
			setState(801);
			match(IDENTIFIER);
			setState(802);
			annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ArgonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArgonParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(LBRACE);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SEMI - 69)) | (1L << (AT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				{
				setState(805);
				annotationTypeElementDeclaration();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			match(RBRACE);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VAR:
			case VOLATILE:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(813);
						modifier();
						}
						} 
					}
					setState(818);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				setState(819);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationTypeElementRest);
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				typeType();
				setState(824);
				annotationMethodOrConstantRest();
				setState(825);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				classDeclaration();
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(828);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(831);
				interfaceDeclaration();
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(832);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(835);
				enumDeclaration();
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(836);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(839);
				annotationTypeDeclaration();
				setState(841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(840);
					match(SEMI);
					}
					break;
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationMethodOrConstantRest);
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(IDENTIFIER);
			setState(850);
			match(LPAREN);
			setState(851);
			match(RPAREN);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(852);
				defaultValue();
				}
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(ArgonParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(DEFAULT);
			setState(858);
			elementValue();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ArgonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArgonParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(LBRACE);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(861);
				blockStatement();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(867);
			match(RBRACE);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_blockStatement);
		try {
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				localVariableDeclaration();
				setState(870);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(873);
				localTypeDeclaration();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(876);
					variableModifier();
					}
					} 
				}
				setState(881);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(882);
			typeType();
			setState(883);
			variableDeclarators();
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

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitLocalTypeDeclaration(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PUBLIC:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(885);
					classOrInterfaceModifier();
					}
					}
					setState(890);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(893);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(891);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(892);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(ArgonParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(ArgonParser.COLON, 0); }
		public TerminalNode IF() { return getToken(ArgonParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ArgonParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(ArgonParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(ArgonParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(ArgonParser.DO, 0); }
		public TerminalNode TRY() { return getToken(ArgonParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(ArgonParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(ArgonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArgonParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(ArgonParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(ArgonParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(ArgonParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(ArgonParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(ArgonParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(ASSERT);
				setState(900);
				expression(0);
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(901);
					match(COLON);
					setState(902);
					expression(0);
					}
				}

				setState(905);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(907);
				match(IF);
				setState(908);
				parExpression();
				setState(909);
				statement();
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(910);
					match(ELSE);
					setState(911);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(914);
				match(FOR);
				setState(915);
				match(LPAREN);
				setState(916);
				forControl();
				setState(917);
				match(RPAREN);
				setState(918);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(920);
				match(WHILE);
				setState(921);
				parExpression();
				setState(922);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(924);
				match(DO);
				setState(925);
				statement();
				setState(926);
				match(WHILE);
				setState(927);
				parExpression();
				setState(928);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(930);
				match(TRY);
				setState(931);
				block();
				setState(941);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(933); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(932);
						catchClause();
						}
						}
						setState(935); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(937);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(940);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(943);
				match(TRY);
				setState(944);
				resourceSpecification();
				setState(945);
				block();
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(946);
					catchClause();
					}
					}
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(952);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(955);
				match(SWITCH);
				setState(956);
				parExpression();
				setState(957);
				match(LBRACE);
				setState(961);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(958);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(963);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				}
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(964);
					switchLabel();
					}
					}
					setState(969);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(970);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(972);
				match(SYNCHRONIZED);
				setState(973);
				parExpression();
				setState(974);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(976);
				match(RETURN);
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(977);
					expression(0);
					}
				}

				setState(980);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(981);
				match(THROW);
				setState(982);
				expression(0);
				setState(983);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(985);
				match(BREAK);
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(986);
					match(IDENTIFIER);
					}
				}

				setState(989);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(990);
				match(CONTINUE);
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(991);
					match(IDENTIFIER);
					}
				}

				setState(994);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(995);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(996);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(997);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(999);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(1000);
				match(COLON);
				setState(1001);
				statement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ArgonParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(CATCH);
			setState(1005);
			match(LPAREN);
			setState(1009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1006);
					variableModifier();
					}
					} 
				}
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(1012);
			catchType();
			setState(1013);
			match(IDENTIFIER);
			setState(1014);
			match(RPAREN);
			setState(1015);
			block();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(ArgonParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(ArgonParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			qualifiedName();
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1018);
				match(BITOR);
				setState(1019);
				qualifiedName();
				}
				}
				setState(1024);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ArgonParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(FINALLY);
			setState(1026);
			block();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ArgonParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(LPAREN);
			setState(1029);
			resources();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1030);
				match(SEMI);
				}
			}

			setState(1033);
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

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ArgonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ArgonParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			resource();
			setState(1040);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1036);
					match(SEMI);
					setState(1037);
					resource();
					}
					} 
				}
				setState(1042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ArgonParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_resource);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1043);
					variableModifier();
					}
					} 
				}
				setState(1048);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(1049);
			classOrInterfaceType();
			setState(1050);
			match(IDENTIFIER);
			setState(1051);
			match(ASSIGN);
			setState(1052);
			expression(0);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1054);
				switchLabel();
				}
				}
				setState(1057); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1060); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1059);
				blockStatement();
				}
				}
				setState(1062); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(ArgonParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(ArgonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(ArgonParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_switchLabel);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				match(CASE);
				setState(1067);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1065);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1066);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(1069);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(DEFAULT);
				setState(1071);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ArgonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ArgonParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_forControl);
		int _la;
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1075);
					forInit();
					}
				}

				setState(1078);
				match(SEMI);
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1079);
					expression(0);
					}
				}

				setState(1082);
				match(SEMI);
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1083);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_forInit);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ArgonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1092);
					variableModifier();
					}
					} 
				}
				setState(1097);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1098);
			typeType();
			setState(1099);
			match(IDENTIFIER);
			setState(1100);
			match(COLON);
			setState(1101);
			expression(0);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(LPAREN);
			setState(1104);
			expression(0);
			setState(1105);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			expression(0);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1108);
				match(COMMA);
				setState(1109);
				expression(0);
				}
				}
				setState(1114);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(ArgonParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(ArgonParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_methodCall);
		int _la;
		try {
			setState(1133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				match(IDENTIFIER);
				setState(1116);
				match(LPAREN);
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1117);
					expressionList();
					}
				}

				setState(1120);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1121);
				match(THIS);
				setState(1122);
				match(LPAREN);
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1123);
					expressionList();
					}
				}

				setState(1126);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1127);
				match(SUPER);
				setState(1128);
				match(LPAREN);
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1129);
					expressionList();
					}
				}

				setState(1132);
				match(RPAREN);
				}
			break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		public ExpressionContext() {
		}

		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class MethodCallExprContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class, 0);
		}

		public MethodCallExprContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).exitMethodCallExpr(this);
		}
	}
	public static class TmpExprContext extends ExpressionContext {
		public Token prefix;
		public Token bop;
		public Token postfix;

		public TerminalNode NEW() {
			return getToken(ArgonParser.NEW, 0);
		}

		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(ArgonParser.LPAREN, 0);
		}

		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(ArgonParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(ArgonParser.BITAND, i);
		}
		public TerminalNode ADD() { return getToken(ArgonParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ArgonParser.SUB, 0); }
		public TerminalNode INC() { return getToken(ArgonParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ArgonParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(ArgonParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(ArgonParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(ArgonParser.COLONCOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public List<TerminalNode> LT() {
			return getTokens(ArgonParser.LT);
		}

		public TerminalNode LT(int i) {
			return getToken(ArgonParser.LT, i);
		}

		public List<TerminalNode> GT() {
			return getTokens(ArgonParser.GT);
		}

		public TerminalNode GT(int i) {
			return getToken(ArgonParser.GT, i);
		}

		public TerminalNode EQUAL() {
			return getToken(ArgonParser.EQUAL, 0);
		}

		public TerminalNode NOTEQUAL() {
			return getToken(ArgonParser.NOTEQUAL, 0);
		}

		public TerminalNode CARET() {
			return getToken(ArgonParser.CARET, 0);
		}

		public TerminalNode BITOR() {
			return getToken(ArgonParser.BITOR, 0);
		}

		public TerminalNode AND() {
			return getToken(ArgonParser.AND, 0);
		}

		public TerminalNode OR() {
			return getToken(ArgonParser.OR, 0);
		}

		public TerminalNode COLON() {
			return getToken(ArgonParser.COLON, 0);
		}

		public TerminalNode QUESTION() {
			return getToken(ArgonParser.QUESTION, 0);
		}

		public TerminalNode INSTANCEOF() {
			return getToken(ArgonParser.INSTANCEOF, 0);
		}

		public TmpExprContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).enterTmpExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).exitTmpExpr(this);
		}
	}

	public static class DotExprContext extends ExpressionContext {
		public Token bop;

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(ArgonParser.DOT, 0);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(ArgonParser.IDENTIFIER, 0);
		}

		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class, 0);
		}

		public TerminalNode THIS() {
			return getToken(ArgonParser.THIS, 0);
		}

		public TerminalNode NEW() {
			return getToken(ArgonParser.NEW, 0);
		}

		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class, 0);
		}

		public TerminalNode SUPER() {
			return getToken(ArgonParser.SUPER, 0);
		}

		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class, 0);
		}

		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class, 0);
		}

		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
		}

		public DotExprContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).enterDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).exitDotExpr(this);
		}
	}
	public static class PrimaryExprContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public PrimaryExprContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).exitPrimaryExpr(this);
		}
	}

	public static class ArrayExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode LBRACK() {
			return getToken(ArgonParser.LBRACK, 0);
		}

		public TerminalNode RBRACK() {
			return getToken(ArgonParser.RBRACK, 0);
		}

		public ArrayExprContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).enterArrayExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).exitArrayExpr(this);
		}
	}

	public static class AddExprContext extends ExpressionContext {
		public Token bop;

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode ADD() {
			return getToken(ArgonParser.ADD, 0);
		}

		public TerminalNode SUB() {
			return getToken(ArgonParser.SUB, 0);
		}

		public AddExprContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).enterAddExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).exitAddExpr(this);
		}
	}

	public static class MulExprContext extends ExpressionContext {
		public Token bop;

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode MUL() {
			return getToken(ArgonParser.MUL, 0);
		}

		public TerminalNode DIV() {
			return getToken(ArgonParser.DIV, 0);
		}

		public TerminalNode MOD() {
			return getToken(ArgonParser.MOD, 0);
		}

		public MulExprContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).enterMulExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).exitMulExpr(this);
		}
	}

	public static class AssignExprContext extends ExpressionContext {
		public Token bop;

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode ASSIGN() {
			return getToken(ArgonParser.ASSIGN, 0);
		}

		public TerminalNode ADD_ASSIGN() {
			return getToken(ArgonParser.ADD_ASSIGN, 0);
		}

		public TerminalNode SUB_ASSIGN() {
			return getToken(ArgonParser.SUB_ASSIGN, 0);
		}

		public TerminalNode MUL_ASSIGN() {
			return getToken(ArgonParser.MUL_ASSIGN, 0);
		}

		public TerminalNode DIV_ASSIGN() {
			return getToken(ArgonParser.DIV_ASSIGN, 0);
		}

		public TerminalNode AND_ASSIGN() {
			return getToken(ArgonParser.AND_ASSIGN, 0);
		}

		public TerminalNode OR_ASSIGN() {
			return getToken(ArgonParser.OR_ASSIGN, 0);
		}

		public TerminalNode XOR_ASSIGN() {
			return getToken(ArgonParser.XOR_ASSIGN, 0);
		}

		public TerminalNode RSHIFT_ASSIGN() {
			return getToken(ArgonParser.RSHIFT_ASSIGN, 0);
		}

		public TerminalNode URSHIFT_ASSIGN() {
			return getToken(ArgonParser.URSHIFT_ASSIGN, 0);
		}

		public TerminalNode LSHIFT_ASSIGN() {
			return getToken(ArgonParser.LSHIFT_ASSIGN, 0);
		}

		public TerminalNode MOD_ASSIGN() {
			return getToken(ArgonParser.MOD_ASSIGN, 0);
		}

		public AssignExprContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).enterAssignExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).exitAssignExpr(this);
		}
	}

	public static class CmpExprContext extends ExpressionContext {
		public Token bop;

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode LE() {
			return getToken(ArgonParser.LE, 0);
		}

		public TerminalNode GE() {
			return getToken(ArgonParser.GE, 0);
		}

		public TerminalNode GT() {
			return getToken(ArgonParser.GT, 0);
		}

		public TerminalNode LT() {
			return getToken(ArgonParser.LT, 0);
		}

		public CmpExprContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).enterCmpExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgonParserListener) ((ArgonParserListener) listener).exitCmpExpr(this);
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
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1: {
					_localctx = new PrimaryExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;

					setState(1136);
					primary();
				}
				break;
				case 2: {
					_localctx = new MethodCallExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(1137);
					methodCall();
				}
				break;
				case 3: {
					_localctx = new TmpExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(1138);
					match(NEW);
					setState(1139);
					creator();
				}
				break;
				case 4: {
					_localctx = new TmpExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(1140);
					match(LPAREN);
					setState(1144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 140, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(1141);
									annotation();
								}
							}
						}
						setState(1146);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 140, _ctx);
				}
				setState(1147);
				typeType();
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1148);
					match(BITAND);
					setState(1149);
					typeType();
					}
					}
					setState(1154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
					setState(1155);
					match(RPAREN);
					setState(1156);
					expression(21);
				}
				break;
				case 5: {
					_localctx = new TmpExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(1158);
					((TmpExprContext) _localctx).prefix = _input.LT(1);
					_la = _input.LA(1);
					if (!(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (INC - 85)) | (1L << (DEC - 85)) | (1L << (ADD - 85)) | (1L << (SUB - 85)))) != 0))) {
						((TmpExprContext) _localctx).prefix = (Token) _errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1159);
					expression(19);
				}
				break;
				case 6: {
					_localctx = new TmpExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(1160);
					((TmpExprContext) _localctx).prefix = _input.LT(1);
					_la = _input.LA(1);
					if (!(_la == BANG || _la == TILDE)) {
						((TmpExprContext) _localctx).prefix = (Token) _errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1161);
					expression(18);
				}
				break;
				case 7: {
					_localctx = new TmpExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(1162);
					lambdaExpression();
				}
				break;
				case 8: {
					_localctx = new TmpExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(1163);
					typeType();
					setState(1164);
					match(COLONCOLON);
					setState(1170);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case LT:
						case IDENTIFIER: {
							setState(1166);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la == LT) {
								{
									setState(1165);
									typeArguments();
								}
							}

					setState(1168);
					match(IDENTIFIER);
					}
					break;
				case NEW: {
					setState(1169);
					match(NEW);
				}
				break;
						default:
							throw new NoViableAltException(this);
					}
				}
				break;
				case 9: {
					_localctx = new TmpExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(1172);
					classType();
					setState(1173);
					match(COLONCOLON);
					setState(1175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(1174);
							typeArguments();
						}
					}

				setState(1177);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
					case 1: {
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1182);
						((MulExprContext) _localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if (!(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0))) {
							((MulExprContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1183);
						expression(18);
						}
						break;
					case 2: {
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1185);
						((AddExprContext) _localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if (!(_la == ADD || _la == SUB)) {
							((AddExprContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1186);
						expression(17);
						}
						break;
					case 3: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1187);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1195);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 146, _ctx)) {
							case 1: {
								setState(1188);
								match(LT);
								setState(1189);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1190);
							match(GT);
							setState(1191);
							match(GT);
							setState(1192);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1193);
							match(GT);
							setState(1194);
							match(GT);
							}
							break;
						}
						setState(1197);
						expression(16);
						}
						break;
					case 4: {
						_localctx = new CmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1198);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1199);
						((CmpExprContext) _localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if (!(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (GT - 73)) | (1L << (LT - 73)) | (1L << (LE - 73)) | (1L << (GE - 73)))) != 0))) {
							((CmpExprContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1200);
						expression(15);
						}
						break;
					case 5: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1201);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1202);
						((TmpExprContext) _localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if (!(_la == EQUAL || _la == NOTEQUAL)) {
							((TmpExprContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1203);
						expression(13);
						}
						break;
					case 6: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1204);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1205);
						((TmpExprContext) _localctx).bop = match(BITAND);
						setState(1206);
						expression(12);
					}
						break;
					case 7: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1207);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1208);
						((TmpExprContext) _localctx).bop = match(CARET);
						setState(1209);
						expression(11);
					}
						break;
					case 8: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1210);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1211);
						((TmpExprContext) _localctx).bop = match(BITOR);
						setState(1212);
						expression(10);
					}
						break;
					case 9: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1213);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1214);
						((TmpExprContext) _localctx).bop = match(AND);
						setState(1215);
						expression(9);
					}
						break;
					case 10: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1216);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1217);
						((TmpExprContext) _localctx).bop = match(OR);
						setState(1218);
						expression(8);
					}
						break;
					case 11: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1219);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1220);
						((TmpExprContext) _localctx).bop = match(QUESTION);
						setState(1221);
						expression(0);
						setState(1222);
						match(COLON);
						setState(1223);
						expression(6);
					}
						break;
					case 12: {
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1225);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1226);
						((AssignExprContext) _localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if (!(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASSIGN - 72)) | (1L << (ADD_ASSIGN - 72)) | (1L << (SUB_ASSIGN - 72)) | (1L << (MUL_ASSIGN - 72)) | (1L << (DIV_ASSIGN - 72)) | (1L << (AND_ASSIGN - 72)) | (1L << (OR_ASSIGN - 72)) | (1L << (XOR_ASSIGN - 72)) | (1L << (MOD_ASSIGN - 72)) | (1L << (LSHIFT_ASSIGN - 72)) | (1L << (RSHIFT_ASSIGN - 72)) | (1L << (URSHIFT_ASSIGN - 72)))) != 0))) {
							((AssignExprContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1227);
						expression(5);
						}
						break;
					case 13: {
						_localctx = new DotExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1228);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1229);
						((DotExprContext) _localctx).bop = match(DOT);
						setState(1241);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 148, _ctx)) {
							case 1: {
								setState(1230);
								match(IDENTIFIER);
							}
							break;
							case 2: {
							setState(1231);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1232);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1233);
							match(NEW);
							setState(1235);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1234);
								nonWildcardTypeArguments();
								}
							}

							setState(1237);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1238);
							match(SUPER);
							setState(1239);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1240);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14: {
						_localctx = new ArrayExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1243);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1244);
						match(LBRACK);
						setState(1245);
						expression(0);
						setState(1246);
						match(RBRACK);
					}
						break;
					case 15: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1248);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1249);
						((TmpExprContext) _localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if (!(_la == INC || _la == DEC)) {
							((TmpExprContext) _localctx).postfix = (Token) _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
						break;
					case 16: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1250);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1251);
						((TmpExprContext) _localctx).bop = match(INSTANCEOF);
						setState(1252);
						typeType();
					}
						break;
					case 17: {
						_localctx = new TmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1253);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1254);
						match(COLONCOLON);
						setState(1256);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == LT) {
							{
								setState(1255);
							typeArguments();
							}
						}

						setState(1258);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(1263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ArgonParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			lambdaParameters();
			setState(1265);
			match(ARROW);
			setState(1266);
			lambdaBody();
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArgonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArgonParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_lambdaParameters);
		int _la;
		try {
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1268);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1269);
				match(LPAREN);
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1270);
					formalParameterList();
					}
				}

				setState(1273);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1274);
				match(LPAREN);
				setState(1275);
				match(IDENTIFIER);
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1276);
					match(COMMA);
					setState(1277);
					match(IDENTIFIER);
					}
					}
					setState(1282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1283);
				match(RPAREN);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lambdaBody);
		try {
			setState(1288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VAR:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1287);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(ArgonParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(ArgonParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ArgonParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(ArgonParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_primary);
		try {
			setState(1308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				match(LPAREN);
				setState(1291);
				expression(0);
				setState(1292);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1295);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1296);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1297);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1298);
				typeTypeOrVoid();
				setState(1299);
				match(DOT);
				setState(1300);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1302);
				nonWildcardTypeArguments();
				setState(1306);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1303);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1304);
					match(THIS);
					setState(1305);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ArgonParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1310);
				classOrInterfaceType();
				setState(1311);
				match(DOT);
				}
				break;
			}
			setState(1318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1315);
					annotation();
					}
					} 
				}
				setState(1320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			setState(1321);
			match(IDENTIFIER);
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1322);
				typeArguments();
				}
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_creator);
		try {
			setState(1334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				nonWildcardTypeArguments();
				setState(1326);
				createdName();
				setState(1327);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
				createdName();
				setState(1332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1330);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1331);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArgonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArgonParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ArgonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ArgonParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_createdName);
		int _la;
		try {
			setState(1351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1336);
				match(IDENTIFIER);
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1337);
					typeArgumentsOrDiamond();
					}
				}

				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1340);
					match(DOT);
					setState(1341);
					match(IDENTIFIER);
					setState(1343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1342);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1350);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			match(IDENTIFIER);
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1354);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1357);
			classCreatorRest();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(ArgonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ArgonParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ArgonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ArgonParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(LBRACK);
			setState(1387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1360);
				match(RBRACK);
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1361);
					match(LBRACK);
					setState(1362);
					match(RBRACK);
					}
					}
					setState(1367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1368);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VAR:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1369);
				expression(0);
				setState(1370);
				match(RBRACK);
				setState(1377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1371);
						match(LBRACK);
						setState(1372);
						expression(0);
						setState(1373);
						match(RBRACK);
						}
						} 
					}
					setState(1379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				setState(1384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1380);
						match(LBRACK);
						setState(1381);
						match(RBRACK);
						}
						} 
					}
					setState(1386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			arguments();
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1390);
				classBody();
				}
				break;
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			nonWildcardTypeArguments();
			setState(1394);
			explicitGenericInvocationSuffix();
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ArgonParser.LT, 0); }
		public TerminalNode GT() { return getToken(ArgonParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typeArgumentsOrDiamond);
		try {
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				match(LT);
				setState(1397);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ArgonParser.LT, 0); }
		public TerminalNode GT() { return getToken(ArgonParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				match(LT);
				setState(1402);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1403);
				nonWildcardTypeArguments();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ArgonParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ArgonParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(LT);
			setState(1407);
			typeList();
			setState(1408);
			match(GT);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			typeType();
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1411);
				match(COMMA);
				setState(1412);
				typeType();
				}
				}
				setState(1417);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ArgonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ArgonParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ArgonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ArgonParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1418);
					annotation();
					}
					} 
				}
				setState(1423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			setState(1424);
			simpleType();
			setState(1435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1428);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1425);
						annotation();
						}
						}
						setState(1430);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1431);
					match(LBRACK);
					setState(1432);
					match(RBRACK);
					}
					} 
				}
				setState(1437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitSimpleType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_simpleType);
		try {
			setState(1440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1438);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ArgonParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(ArgonParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(ArgonParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(ArgonParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(ArgonParser.INT, 0); }
		public TerminalNode LONG() { return getToken(ArgonParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(ArgonParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ArgonParser.DOUBLE, 0); }
		public TerminalNode VAR() { return getToken(ArgonParser.VAR, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR))) != 0)) ) {
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ArgonParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(ArgonParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ArgonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArgonParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(LT);
			setState(1445);
			typeArgument();
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1446);
				match(COMMA);
				setState(1447);
				typeArgument();
				}
				}
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1453);
			match(GT);
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ArgonParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_superSuffix);
		try {
			setState(1461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				match(DOT);
				setState(1457);
				match(IDENTIFIER);
				setState(1459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1458);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(ArgonParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArgonParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				match(SUPER);
				setState(1464);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				match(IDENTIFIER);
				setState(1466);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ArgonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ArgonParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgonParserListener ) ((ArgonParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(LPAREN);
			setState(1471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LT - 74)) | (1L << (BANG - 74)) | (1L << (TILDE - 74)) | (1L << (INC - 74)) | (1L << (DEC - 74)) | (1L << (ADD - 74)) | (1L << (SUB - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
				{
				setState(1470);
				expressionList();
				}
			}

			setState(1473);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 82:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 13);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u05c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\3"+
		"\2\7\2\u00d7\n\2\f\2\16\2\u00da\13\2\3\2\7\2\u00dd\n\2\f\2\16\2\u00e0"+
		"\13\2\3\2\3\2\3\3\7\3\u00e5\n\3\f\3\16\3\u00e8\13\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\5\4\u00f2\n\4\3\4\3\4\5\4\u00f6\n\4\3\4\3\4\3\5\7\5\u00fb"+
		"\n\5\f\5\16\5\u00fe\13\5\3\5\3\5\3\5\3\5\5\5\u0104\n\5\3\5\5\5\u0107\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0111\n\6\3\7\3\7\3\7\3\7\5\7\u0117"+
		"\n\7\3\b\3\b\5\b\u011b\n\b\3\t\3\t\3\t\5\t\u0120\n\t\3\t\3\t\5\t\u0124"+
		"\n\t\3\t\3\t\5\t\u0128\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0130\n\n\f\n\16"+
		"\n\u0133\13\n\3\n\3\n\3\13\7\13\u0138\n\13\f\13\16\13\u013b\13\13\3\13"+
		"\3\13\3\13\7\13\u0140\n\13\f\13\16\13\u0143\13\13\3\13\5\13\u0146\n\13"+
		"\3\f\3\f\3\f\7\f\u014b\n\f\f\f\16\f\u014e\13\f\3\r\3\r\3\r\3\r\5\r\u0154"+
		"\n\r\3\r\3\r\5\r\u0158\n\r\3\r\5\r\u015b\n\r\3\r\5\r\u015e\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\7\16\u0165\n\16\f\16\16\16\u0168\13\16\3\17\7\17\u016b"+
		"\n\17\f\17\16\17\u016e\13\17\3\17\3\17\5\17\u0172\n\17\3\17\5\17\u0175"+
		"\n\17\3\20\3\20\7\20\u0179\n\20\f\20\16\20\u017c\13\20\3\21\3\21\3\21"+
		"\5\21\u0181\n\21\3\21\3\21\5\21\u0185\n\21\3\21\3\21\3\22\3\22\7\22\u018b"+
		"\n\22\f\22\16\22\u018e\13\22\3\22\3\22\3\23\3\23\7\23\u0194\n\23\f\23"+
		"\16\23\u0197\13\23\3\23\3\23\3\24\3\24\5\24\u019d\n\24\3\24\3\24\5\24"+
		"\u01a1\n\24\3\25\7\25\u01a4\n\25\f\25\16\25\u01a7\13\25\3\25\3\25\7\25"+
		"\u01ab\n\25\f\25\16\25\u01ae\13\25\3\25\3\25\7\25\u01b2\n\25\f\25\16\25"+
		"\u01b5\13\25\3\25\3\25\7\25\u01b9\n\25\f\25\16\25\u01bc\13\25\3\25\3\25"+
		"\7\25\u01c0\n\25\f\25\16\25\u01c3\13\25\3\25\3\25\7\25\u01c7\n\25\f\25"+
		"\16\25\u01ca\13\25\3\25\3\25\7\25\u01ce\n\25\f\25\16\25\u01d1\13\25\3"+
		"\25\3\25\7\25\u01d5\n\25\f\25\16\25\u01d8\13\25\3\25\3\25\7\25\u01dc\n"+
		"\25\f\25\16\25\u01df\13\25\3\25\5\25\u01e2\n\25\3\26\3\26\3\26\3\26\3"+
		"\26\7\26\u01e9\n\26\f\26\16\26\u01ec\13\26\3\26\3\26\5\26\u01f0\n\26\3"+
		"\26\3\26\3\27\3\27\5\27\u01f6\n\27\3\30\3\30\5\30\u01fa\n\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0206\n\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\7\35\u020f\n\35\f\35\16\35\u0212\13\35\3\35\3\35"+
		"\5\35\u0216\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u021f\n\36\3"+
		"\37\3\37\3\37\3\37\7\37\u0225\n\37\f\37\16\37\u0228\13\37\3\37\3\37\3"+
		" \3 \3 \7 \u022f\n \f \16 \u0232\13 \3 \3 \3 \3!\7!\u0238\n!\f!\16!\u023b"+
		"\13!\3!\3!\3!\7!\u0240\n!\f!\16!\u0243\13!\3!\3!\5!\u0247\n!\3!\3!\3!"+
		"\3!\7!\u024d\n!\f!\16!\u0250\13!\3!\3!\5!\u0254\n!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u025e\n\"\3#\3#\3#\3$\3$\3$\7$\u0266\n$\f$\16$\u0269\13"+
		"$\3%\3%\3%\5%\u026e\n%\3&\3&\5&\u0272\n&\3\'\3\'\3\'\3\'\7\'\u0278\n\'"+
		"\f\'\16\'\u027b\13\'\3\'\5\'\u027e\n\'\5\'\u0280\n\'\3\'\3\'\3(\3(\5("+
		"\u0286\n(\3(\3(\3(\5(\u028b\n(\7(\u028d\n(\f(\16(\u0290\13(\3)\3)\7)\u0294"+
		"\n)\f)\16)\u0297\13)\3)\3)\3)\5)\u029c\n)\5)\u029e\n)\3*\3*\3*\7*\u02a3"+
		"\n*\f*\16*\u02a6\13*\3+\3+\5+\u02aa\n+\3+\3+\3,\3,\3,\7,\u02b1\n,\f,\16"+
		",\u02b4\13,\3,\3,\5,\u02b8\n,\3,\5,\u02bb\n,\3-\7-\u02be\n-\f-\16-\u02c1"+
		"\13-\3-\3-\3-\3.\7.\u02c7\n.\f.\16.\u02ca\13.\3.\3.\7.\u02ce\n.\f.\16"+
		".\u02d1\13.\3.\3.\3.\3/\3/\3/\7/\u02d9\n/\f/\16/\u02dc\13/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u02e4\n\60\3\61\3\61\3\62\3\62\3\63\3\63\7\63"+
		"\u02ec\n\63\f\63\16\63\u02ef\13\63\3\63\3\63\3\63\3\64\3\64\3\64\5\64"+
		"\u02f7\n\64\3\64\3\64\3\64\5\64\u02fc\n\64\3\64\5\64\u02ff\n\64\3\65\3"+
		"\65\3\65\7\65\u0304\n\65\f\65\16\65\u0307\13\65\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\5\67\u0310\n\67\38\38\38\38\78\u0316\n8\f8\168\u0319\13"+
		"8\58\u031b\n8\38\58\u031e\n8\38\38\39\39\39\39\39\3:\3:\7:\u0329\n:\f"+
		":\16:\u032c\13:\3:\3:\3;\7;\u0331\n;\f;\16;\u0334\13;\3;\3;\5;\u0338\n"+
		";\3<\3<\3<\3<\3<\3<\5<\u0340\n<\3<\3<\5<\u0344\n<\3<\3<\5<\u0348\n<\3"+
		"<\3<\5<\u034c\n<\5<\u034e\n<\3=\3=\5=\u0352\n=\3>\3>\3>\3>\5>\u0358\n"+
		">\3?\3?\3@\3@\3@\3A\3A\7A\u0361\nA\fA\16A\u0364\13A\3A\3A\3B\3B\3B\3B"+
		"\3B\5B\u036d\nB\3C\7C\u0370\nC\fC\16C\u0373\13C\3C\3C\3C\3D\7D\u0379\n"+
		"D\fD\16D\u037c\13D\3D\3D\5D\u0380\nD\3D\5D\u0383\nD\3E\3E\3E\3E\3E\5E"+
		"\u038a\nE\3E\3E\3E\3E\3E\3E\3E\5E\u0393\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\6E\u03a8\nE\rE\16E\u03a9\3E\5E\u03ad\n"+
		"E\3E\5E\u03b0\nE\3E\3E\3E\3E\7E\u03b6\nE\fE\16E\u03b9\13E\3E\5E\u03bc"+
		"\nE\3E\3E\3E\3E\7E\u03c2\nE\fE\16E\u03c5\13E\3E\7E\u03c8\nE\fE\16E\u03cb"+
		"\13E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u03d5\nE\3E\3E\3E\3E\3E\3E\3E\5E\u03de"+
		"\nE\3E\3E\3E\5E\u03e3\nE\3E\3E\3E\3E\3E\3E\3E\3E\5E\u03ed\nE\3F\3F\3F"+
		"\7F\u03f2\nF\fF\16F\u03f5\13F\3F\3F\3F\3F\3F\3G\3G\3G\7G\u03ff\nG\fG\16"+
		"G\u0402\13G\3H\3H\3H\3I\3I\3I\5I\u040a\nI\3I\3I\3J\3J\3J\7J\u0411\nJ\f"+
		"J\16J\u0414\13J\3K\7K\u0417\nK\fK\16K\u041a\13K\3K\3K\3K\3K\3K\3L\6L\u0422"+
		"\nL\rL\16L\u0423\3L\6L\u0427\nL\rL\16L\u0428\3M\3M\3M\5M\u042e\nM\3M\3"+
		"M\3M\5M\u0433\nM\3N\3N\5N\u0437\nN\3N\3N\5N\u043b\nN\3N\3N\5N\u043f\n"+
		"N\5N\u0441\nN\3O\3O\5O\u0445\nO\3P\7P\u0448\nP\fP\16P\u044b\13P\3P\3P"+
		"\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\7R\u0459\nR\fR\16R\u045c\13R\3S\3S\3S\5"+
		"S\u0461\nS\3S\3S\3S\3S\5S\u0467\nS\3S\3S\3S\3S\5S\u046d\nS\3S\5S\u0470"+
		"\nS\3T\3T\3T\3T\3T\3T\3T\7T\u0479\nT\fT\16T\u047c\13T\3T\3T\3T\7T\u0481"+
		"\nT\fT\16T\u0484\13T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0491\nT\3T\3"+
		"T\5T\u0495\nT\3T\3T\3T\5T\u049a\nT\3T\3T\5T\u049e\nT\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u04ae\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\5T\u04d6\nT\3T\3T\3T\3T\5T\u04dc\nT\3T\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\5T\u04eb\nT\3T\7T\u04ee\nT\fT\16T\u04f1\13T\3U\3U"+
		"\3U\3U\3V\3V\3V\5V\u04fa\nV\3V\3V\3V\3V\3V\7V\u0501\nV\fV\16V\u0504\13"+
		"V\3V\5V\u0507\nV\3W\3W\5W\u050b\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\5X\u051d\nX\5X\u051f\nX\3Y\3Y\3Y\5Y\u0524\nY\3Y\7Y\u0527"+
		"\nY\fY\16Y\u052a\13Y\3Y\3Y\5Y\u052e\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0537\n"+
		"Z\5Z\u0539\nZ\3[\3[\5[\u053d\n[\3[\3[\3[\5[\u0542\n[\7[\u0544\n[\f[\16"+
		"[\u0547\13[\3[\5[\u054a\n[\3\\\3\\\5\\\u054e\n\\\3\\\3\\\3]\3]\3]\3]\7"+
		"]\u0556\n]\f]\16]\u0559\13]\3]\3]\3]\3]\3]\3]\3]\7]\u0562\n]\f]\16]\u0565"+
		"\13]\3]\3]\7]\u0569\n]\f]\16]\u056c\13]\5]\u056e\n]\3^\3^\5^\u0572\n^"+
		"\3_\3_\3_\3`\3`\3`\5`\u057a\n`\3a\3a\3a\5a\u057f\na\3b\3b\3b\3b\3c\3c"+
		"\3c\7c\u0588\nc\fc\16c\u058b\13c\3d\7d\u058e\nd\fd\16d\u0591\13d\3d\3"+
		"d\7d\u0595\nd\fd\16d\u0598\13d\3d\3d\7d\u059c\nd\fd\16d\u059f\13d\3e\3"+
		"e\5e\u05a3\ne\3f\3f\3g\3g\3g\3g\7g\u05ab\ng\fg\16g\u05ae\13g\3g\3g\3h"+
		"\3h\3h\3h\5h\u05b6\nh\5h\u05b8\nh\3i\3i\3i\3i\5i\u05be\ni\3j\3j\5j\u05c2"+
		"\nj\3j\3j\3j\2\3\u00a6k\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\2\16\4\2\24\24++\3\2\67:\3\2;<\3\2WZ\3\2MN\4\2[\\`"+
		"`\3\2YZ\4\2KLRS\4\2QQTT\4\2JJak\3\2WX\13\2\6\6\b\b\13\13\21\21\27\27\36"+
		"\36  ((\63\63\2\u066b\2\u00d4\3\2\2\2\4\u00e6\3\2\2\2\6\u00ed\3\2\2\2"+
		"\b\u0106\3\2\2\2\n\u0110\3\2\2\2\f\u0116\3\2\2\2\16\u011a\3\2\2\2\20\u011c"+
		"\3\2\2\2\22\u012b\3\2\2\2\24\u0139\3\2\2\2\26\u0147\3\2\2\2\30\u014f\3"+
		"\2\2\2\32\u0161\3\2\2\2\34\u016c\3\2\2\2\36\u0176\3\2\2\2 \u017d\3\2\2"+
		"\2\"\u0188\3\2\2\2$\u0191\3\2\2\2&\u01a0\3\2\2\2(\u01e1\3\2\2\2*\u01e3"+
		"\3\2\2\2,\u01f5\3\2\2\2.\u01f9\3\2\2\2\60\u01fb\3\2\2\2\62\u01fe\3\2\2"+
		"\2\64\u0201\3\2\2\2\66\u0209\3\2\2\28\u0215\3\2\2\2:\u021e\3\2\2\2<\u0220"+
		"\3\2\2\2>\u022b\3\2\2\2@\u0239\3\2\2\2B\u025d\3\2\2\2D\u025f\3\2\2\2F"+
		"\u0262\3\2\2\2H\u026a\3\2\2\2J\u0271\3\2\2\2L\u0273\3\2\2\2N\u0283\3\2"+
		"\2\2P\u029d\3\2\2\2R\u029f\3\2\2\2T\u02a7\3\2\2\2V\u02ba\3\2\2\2X\u02bf"+
		"\3\2\2\2Z\u02c8\3\2\2\2\\\u02d5\3\2\2\2^\u02e3\3\2\2\2`\u02e5\3\2\2\2"+
		"b\u02e7\3\2\2\2d\u02ed\3\2\2\2f\u02f6\3\2\2\2h\u0300\3\2\2\2j\u0308\3"+
		"\2\2\2l\u030f\3\2\2\2n\u0311\3\2\2\2p\u0321\3\2\2\2r\u0326\3\2\2\2t\u0337"+
		"\3\2\2\2v\u034d\3\2\2\2x\u0351\3\2\2\2z\u0353\3\2\2\2|\u0359\3\2\2\2~"+
		"\u035b\3\2\2\2\u0080\u035e\3\2\2\2\u0082\u036c\3\2\2\2\u0084\u0371\3\2"+
		"\2\2\u0086\u0382\3\2\2\2\u0088\u03ec\3\2\2\2\u008a\u03ee\3\2\2\2\u008c"+
		"\u03fb\3\2\2\2\u008e\u0403\3\2\2\2\u0090\u0406\3\2\2\2\u0092\u040d\3\2"+
		"\2\2\u0094\u0418\3\2\2\2\u0096\u0421\3\2\2\2\u0098\u0432\3\2\2\2\u009a"+
		"\u0440\3\2\2\2\u009c\u0444\3\2\2\2\u009e\u0449\3\2\2\2\u00a0\u0451\3\2"+
		"\2\2\u00a2\u0455\3\2\2\2\u00a4\u046f\3\2\2\2\u00a6\u049d\3\2\2\2\u00a8"+
		"\u04f2\3\2\2\2\u00aa\u0506\3\2\2\2\u00ac\u050a\3\2\2\2\u00ae\u051e\3\2"+
		"\2\2\u00b0\u0523\3\2\2\2\u00b2\u0538\3\2\2\2\u00b4\u0549\3\2\2\2\u00b6"+
		"\u054b\3\2\2\2\u00b8\u0551\3\2\2\2\u00ba\u056f\3\2\2\2\u00bc\u0573\3\2"+
		"\2\2\u00be\u0579\3\2\2\2\u00c0\u057e\3\2\2\2\u00c2\u0580\3\2\2\2\u00c4"+
		"\u0584\3\2\2\2\u00c6\u058f\3\2\2\2\u00c8\u05a2\3\2\2\2\u00ca\u05a4\3\2"+
		"\2\2\u00cc\u05a6\3\2\2\2\u00ce\u05b7\3\2\2\2\u00d0\u05bd\3\2\2\2\u00d2"+
		"\u05bf\3\2\2\2\u00d4\u00d8\5\4\3\2\u00d5\u00d7\5\6\4\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00de\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\5\b\5\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\2\2\3\u00e2\3\3\2\2\2"+
		"\u00e3\u00e5\5f\64\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7#\2\2\u00ea\u00eb\5\\/\2\u00eb\u00ec\7G\2\2\u00ec\5\3\2\2\2\u00ed"+
		"\u00ee\7\34\2\2\u00ee\u00f1\5\\/\2\u00ef\u00f0\7I\2\2\u00f0\u00f2\7[\2"+
		"\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f4"+
		"\7\5\2\2\u00f4\u00f6\7s\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\7G\2\2\u00f8\7\3\2\2\2\u00f9\u00fb\5\f\7\2"+
		"\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u0103\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0104\5\20\t\2"+
		"\u0100\u0104\5\30\r\2\u0101\u0104\5 \21\2\u0102\u0104\5p9\2\u0103\u00ff"+
		"\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0107\7G\2\2\u0106\u00fc\3\2\2\2\u0106\u0105\3\2"+
		"\2\2\u0107\t\3\2\2\2\u0108\u0111\5\f\7\2\u0109\u0111\7!\2\2\u010a\u0111"+
		"\7)\2\2\u010b\u0111\7-\2\2\u010c\u0111\7\61\2\2\u010d\u0111\7\65\2\2\u010e"+
		"\u0111\7%\2\2\u010f\u0111\7$\2\2\u0110\u0108\3\2\2\2\u0110\u0109\3\2\2"+
		"\2\u0110\u010a\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010d"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\13\3\2\2\2\u0112"+
		"\u0117\5f\64\2\u0113\u0117\7&\2\2\u0114\u0117\7\3\2\2\u0115\u0117\7\25"+
		"\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\r\3\2\2\2\u0118\u011b\7\25\2\2\u0119\u011b\5f\64"+
		"\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\17\3\2\2\2\u011c\u011d"+
		"\7\f\2\2\u011d\u011f\7s\2\2\u011e\u0120\5\22\n\2\u011f\u011e\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122\7\24\2\2\u0122\u0124\5"+
		"\u00c6d\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2"+
		"\u0125\u0126\7\33\2\2\u0126\u0128\5\u00c4c\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\5\"\22\2\u012a\21\3\2\2"+
		"\2\u012b\u012c\7L\2\2\u012c\u0131\5\24\13\2\u012d\u012e\7H\2\2\u012e\u0130"+
		"\5\24\13\2\u012f\u012d\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135"+
		"\7K\2\2\u0135\23\3\2\2\2\u0136\u0138\5f\64\2\u0137\u0136\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013c\u0145\7s\2\2\u013d\u0141\7\24\2\2\u013e"+
		"\u0140\5f\64\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0146\5\26\f\2\u0145\u013d\3\2\2\2\u0145\u0146\3\2\2\2\u0146\25\3\2\2"+
		"\2\u0147\u014c\5\u00c6d\2\u0148\u0149\7]\2\2\u0149\u014b\5\u00c6d\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\27\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7\23\2\2\u0150\u0153"+
		"\7s\2\2\u0151\u0152\7\33\2\2\u0152\u0154\5\u00c4c\2\u0153\u0151\3\2\2"+
		"\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\7C\2\2\u0156\u0158"+
		"\5\32\16\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2"+
		"\u0159\u015b\7H\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d"+
		"\3\2\2\2\u015c\u015e\5\36\20\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2"+
		"\u015e\u015f\3\2\2\2\u015f\u0160\7D\2\2\u0160\31\3\2\2\2\u0161\u0166\5"+
		"\34\17\2\u0162\u0163\7H\2\2\u0163\u0165\5\34\17\2\u0164\u0162\3\2\2\2"+
		"\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\33"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\5f\64\2\u016a\u0169\3\2\2\2\u016b"+
		"\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016f\u0171\7s\2\2\u0170\u0172\5\u00d2j\2\u0171"+
		"\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0175\5\""+
		"\22\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\35\3\2\2\2\u0176\u017a"+
		"\7G\2\2\u0177\u0179\5&\24\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\37\3\2\2\2\u017c\u017a\3\2\2"+
		"\2\u017d\u017e\7\37\2\2\u017e\u0180\7s\2\2\u017f\u0181\5\22\n\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0183\7\24"+
		"\2\2\u0183\u0185\5\u00c4c\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\5$\23\2\u0187!\3\2\2\2\u0188\u018c\7C\2\2\u0189"+
		"\u018b\5&\24\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f"+
		"\u0190\7D\2\2\u0190#\3\2\2\2\u0191\u0195\7C\2\2\u0192\u0194\58\35\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7D\2\2\u0199"+
		"%\3\2\2\2\u019a\u01a1\7G\2\2\u019b\u019d\7)\2\2\u019c\u019b\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a1\5\u0080A\2\u019f\u01a1"+
		"\5(\25\2\u01a0\u019a\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1"+
		"\'\3\2\2\2\u01a2\u01a4\5\n\6\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2"+
		"\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01e2\5*\26\2\u01a9\u01ab\5\n\6\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01e2\5\60\31\2\u01b0\u01b2\5\n\6\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01e2\5\66\34\2\u01b7"+
		"\u01b9\5\n\6\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01e2\5\64\33\2\u01be\u01c0\5\n\6\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3"+
		"\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u01e2\5\62\32\2\u01c5\u01c7\5\n\6\2\u01c6\u01c5\3"+
		"\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01e2\5 \21\2\u01cc\u01ce\5\n"+
		"\6\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01e2\5p"+
		"9\2\u01d3\u01d5\5\n\6\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d9\u01e2\5\20\t\2\u01da\u01dc\5\n\6\2\u01db\u01da\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2"+
		"\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e2\5\30\r\2\u01e1\u01a5\3\2\2\2\u01e1"+
		"\u01ac\3\2\2\2\u01e1\u01b3\3\2\2\2\u01e1\u01ba\3\2\2\2\u01e1\u01c1\3\2"+
		"\2\2\u01e1\u01c8\3\2\2\2\u01e1\u01cf\3\2\2\2\u01e1\u01d6\3\2\2\2\u01e1"+
		"\u01dd\3\2\2\2\u01e2)\3\2\2\2\u01e3\u01e4\5.\30\2\u01e4\u01e5\7s\2\2\u01e5"+
		"\u01ea\5T+\2\u01e6\u01e7\7E\2\2\u01e7\u01e9\7F\2\2\u01e8\u01e6\3\2\2\2"+
		"\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ef"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7\60\2\2\u01ee\u01f0\5R*\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5,"+
		"\27\2\u01f2+\3\2\2\2\u01f3\u01f6\5\u0080A\2\u01f4\u01f6\7G\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6-\3\2\2\2\u01f7\u01fa\5\u00c6d\2\u01f8"+
		"\u01fa\7\64\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa/\3\2\2\2"+
		"\u01fb\u01fc\5\22\n\2\u01fc\u01fd\5*\26\2\u01fd\61\3\2\2\2\u01fe\u01ff"+
		"\5\22\n\2\u01ff\u0200\5\64\33\2\u0200\63\3\2\2\2\u0201\u0202\7s\2\2\u0202"+
		"\u0205\5T+\2\u0203\u0204\7\60\2\2\u0204\u0206\5R*\2\u0205\u0203\3\2\2"+
		"\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\5\u0080A\2\u0208"+
		"\65\3\2\2\2\u0209\u020a\5\u00c6d\2\u020a\u020b\5F$\2\u020b\u020c\7G\2"+
		"\2\u020c\67\3\2\2\2\u020d\u020f\5\n\6\2\u020e\u020d\3\2\2\2\u020f\u0212"+
		"\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0216\5:\36\2\u0214\u0216\7G\2\2\u0215\u0210\3\2"+
		"\2\2\u0215\u0214\3\2\2\2\u02169\3\2\2\2\u0217\u021f\5<\37\2\u0218\u021f"+
		"\5@!\2\u0219\u021f\5D#\2\u021a\u021f\5 \21\2\u021b\u021f\5p9\2\u021c\u021f"+
		"\5\20\t\2\u021d\u021f\5\30\r\2\u021e\u0217\3\2\2\2\u021e\u0218\3\2\2\2"+
		"\u021e\u0219\3\2\2\2\u021e\u021a\3\2\2\2\u021e\u021b\3\2\2\2\u021e\u021c"+
		"\3\2\2\2\u021e\u021d\3\2\2\2\u021f;\3\2\2\2\u0220\u0221\5\u00c6d\2\u0221"+
		"\u0226\5> \2\u0222\u0223\7H\2\2\u0223\u0225\5> \2\u0224\u0222\3\2\2\2"+
		"\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229"+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7G\2\2\u022a=\3\2\2\2\u022b\u0230"+
		"\7s\2\2\u022c\u022d\7E\2\2\u022d\u022f\7F\2\2\u022e\u022c\3\2\2\2\u022f"+
		"\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2"+
		"\2\2\u0232\u0230\3\2\2\2\u0233\u0234\7J\2\2\u0234\u0235\5J&\2\u0235?\3"+
		"\2\2\2\u0236\u0238\5B\"\2\u0237\u0236\3\2\2\2\u0238\u023b\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0246\3\2\2\2\u023b\u0239\3\2"+
		"\2\2\u023c\u0247\5.\30\2\u023d\u0241\5\22\n\2\u023e\u0240\5f\64\2\u023f"+
		"\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2"+
		"\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0245\5.\30\2\u0245"+
		"\u0247\3\2\2\2\u0246\u023c\3\2\2\2\u0246\u023d\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248\u0249\7s\2\2\u0249\u024e\5T+\2\u024a\u024b\7E\2\2\u024b\u024d"+
		"\7F\2\2\u024c\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0253\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\7\60"+
		"\2\2\u0252\u0254\5R*\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0256\5,\27\2\u0256A\3\2\2\2\u0257\u025e\5f\64\2\u0258"+
		"\u025e\7&\2\2\u0259\u025e\7\3\2\2\u025a\u025e\7\17\2\2\u025b\u025e\7)"+
		"\2\2\u025c\u025e\7*\2\2\u025d\u0257\3\2\2\2\u025d\u0258\3\2\2\2\u025d"+
		"\u0259\3\2\2\2\u025d\u025a\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025c\3\2"+
		"\2\2\u025eC\3\2\2\2\u025f\u0260\5\22\n\2\u0260\u0261\5@!\2\u0261E\3\2"+
		"\2\2\u0262\u0267\5H%\2\u0263\u0264\7H\2\2\u0264\u0266\5H%\2\u0265\u0263"+
		"\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"G\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026d\7s\2\2\u026b\u026c\7J\2\2\u026c"+
		"\u026e\5J&\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026eI\3\2\2\2\u026f"+
		"\u0272\5L\'\2\u0270\u0272\5\u00a6T\2\u0271\u026f\3\2\2\2\u0271\u0270\3"+
		"\2\2\2\u0272K\3\2\2\2\u0273\u027f\7C\2\2\u0274\u0279\5J&\2\u0275\u0276"+
		"\7H\2\2\u0276\u0278\5J&\2\u0277\u0275\3\2\2\2\u0278\u027b\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2"+
		"\2\2\u027c\u027e\7H\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u0280\3\2\2\2\u027f\u0274\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0282\7D\2\2\u0282M\3\2\2\2\u0283\u0285\7s\2\2\u0284\u0286"+
		"\5\u00ccg\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028e\3\2\2"+
		"\2\u0287\u0288\7I\2\2\u0288\u028a\7s\2\2\u0289\u028b\5\u00ccg\2\u028a"+
		"\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u0287\3\2"+
		"\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"O\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u029e\5\u00c6d\2\u0292\u0294\5f\64"+
		"\2\u0293\u0292\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296"+
		"\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u029b\7O\2\2\u0299"+
		"\u029a\t\2\2\2\u029a\u029c\5\u00c6d\2\u029b\u0299\3\2\2\2\u029b\u029c"+
		"\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u0291\3\2\2\2\u029d\u0295\3\2\2\2\u029e"+
		"Q\3\2\2\2\u029f\u02a4\5\\/\2\u02a0\u02a1\7H\2\2\u02a1\u02a3\5\\/\2\u02a2"+
		"\u02a0\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2"+
		"\2\2\u02a5S\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a9\7A\2\2\u02a8\u02aa"+
		"\5V,\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ac\7B\2\2\u02acU\3\2\2\2\u02ad\u02b2\5X-\2\u02ae\u02af\7H\2\2\u02af"+
		"\u02b1\5X-\2\u02b0\u02ae\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2"+
		"\2\u02b2\u02b3\3\2\2\2\u02b3\u02b7\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6"+
		"\7H\2\2\u02b6\u02b8\5Z.\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02bb\3\2\2\2\u02b9\u02bb\5Z.\2\u02ba\u02ad\3\2\2\2\u02ba\u02b9\3\2\2"+
		"\2\u02bbW\3\2\2\2\u02bc\u02be\5\16\b\2\u02bd\u02bc\3\2\2\2\u02be\u02c1"+
		"\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1"+
		"\u02bf\3\2\2\2\u02c2\u02c3\5\u00c6d\2\u02c3\u02c4\7s\2\2\u02c4Y\3\2\2"+
		"\2\u02c5\u02c7\5\16\b\2\u02c6\u02c5\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2"+
		"\2\2\u02cb\u02cf\5\u00c6d\2\u02cc\u02ce\5f\64\2\u02cd\u02cc\3\2\2\2\u02ce"+
		"\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2"+
		"\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d3\7o\2\2\u02d3\u02d4\7s\2\2\u02d4["+
		"\3\2\2\2\u02d5\u02da\7s\2\2\u02d6\u02d7\7I\2\2\u02d7\u02d9\7s\2\2\u02d8"+
		"\u02d6\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2"+
		"\2\2\u02db]\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02e4\5`\61\2\u02de\u02e4"+
		"\5b\62\2\u02df\u02e4\7>\2\2\u02e0\u02e4\7?\2\2\u02e1\u02e4\7=\2\2\u02e2"+
		"\u02e4\7@\2\2\u02e3\u02dd\3\2\2\2\u02e3\u02de\3\2\2\2\u02e3\u02df\3\2"+
		"\2\2\u02e3\u02e0\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e2\3\2\2\2\u02e4"+
		"_\3\2\2\2\u02e5\u02e6\t\3\2\2\u02e6a\3\2\2\2\u02e7\u02e8\t\4\2\2\u02e8"+
		"c\3\2\2\2\u02e9\u02ea\7s\2\2\u02ea\u02ec\7I\2\2\u02eb\u02e9\3\2\2\2\u02ec"+
		"\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2"+
		"\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\7n\2\2\u02f1\u02f2\7s\2\2\u02f2e"+
		"\3\2\2\2\u02f3\u02f4\7n\2\2\u02f4\u02f7\5\\/\2\u02f5\u02f7\5d\63\2\u02f6"+
		"\u02f3\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7\u02fe\3\2\2\2\u02f8\u02fb\7A"+
		"\2\2\u02f9\u02fc\5h\65\2\u02fa\u02fc\5l\67\2\u02fb\u02f9\3\2\2\2\u02fb"+
		"\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\7B"+
		"\2\2\u02fe\u02f8\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ffg\3\2\2\2\u0300\u0305"+
		"\5j\66\2\u0301\u0302\7H\2\2\u0302\u0304\5j\66\2\u0303\u0301\3\2\2\2\u0304"+
		"\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306i\3\2\2\2"+
		"\u0307\u0305\3\2\2\2\u0308\u0309\7s\2\2\u0309\u030a\7J\2\2\u030a\u030b"+
		"\5l\67\2\u030bk\3\2\2\2\u030c\u0310\5\u00a6T\2\u030d\u0310\5f\64\2\u030e"+
		"\u0310\5n8\2\u030f\u030c\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u030e\3\2\2"+
		"\2\u0310m\3\2\2\2\u0311\u031a\7C\2\2\u0312\u0317\5l\67\2\u0313\u0314\7"+
		"H\2\2\u0314\u0316\5l\67\2\u0315\u0313\3\2\2\2\u0316\u0319\3\2\2\2\u0317"+
		"\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2"+
		"\2\2\u031a\u0312\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c"+
		"\u031e\7H\2\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2"+
		"\2\2\u031f\u0320\7D\2\2\u0320o\3\2\2\2\u0321\u0322\7n\2\2\u0322\u0323"+
		"\7\37\2\2\u0323\u0324\7s\2\2\u0324\u0325\5r:\2\u0325q\3\2\2\2\u0326\u032a"+
		"\7C\2\2\u0327\u0329\5t;\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a"+
		"\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2"+
		"\2\2\u032d\u032e\7D\2\2\u032es\3\2\2\2\u032f\u0331\5\n\6\2\u0330\u032f"+
		"\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0338\5v<\2\u0336\u0338\7G\2"+
		"\2\u0337\u0332\3\2\2\2\u0337\u0336\3\2\2\2\u0338u\3\2\2\2\u0339\u033a"+
		"\5\u00c6d\2\u033a\u033b\5x=\2\u033b\u033c\7G\2\2\u033c\u034e\3\2\2\2\u033d"+
		"\u033f\5\20\t\2\u033e\u0340\7G\2\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2"+
		"\2\2\u0340\u034e\3\2\2\2\u0341\u0343\5 \21\2\u0342\u0344\7G\2\2\u0343"+
		"\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u034e\3\2\2\2\u0345\u0347\5\30"+
		"\r\2\u0346\u0348\7G\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u034e\3\2\2\2\u0349\u034b\5p9\2\u034a\u034c\7G\2\2\u034b\u034a\3\2\2"+
		"\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u0339\3\2\2\2\u034d\u033d"+
		"\3\2\2\2\u034d\u0341\3\2\2\2\u034d\u0345\3\2\2\2\u034d\u0349\3\2\2\2\u034e"+
		"w\3\2\2\2\u034f\u0352\5z>\2\u0350\u0352\5|?\2\u0351\u034f\3\2\2\2\u0351"+
		"\u0350\3\2\2\2\u0352y\3\2\2\2\u0353\u0354\7s\2\2\u0354\u0355\7A\2\2\u0355"+
		"\u0357\7B\2\2\u0356\u0358\5~@\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2"+
		"\2\u0358{\3\2\2\2\u0359\u035a\5F$\2\u035a}\3\2\2\2\u035b\u035c\7\17\2"+
		"\2\u035c\u035d\5l\67\2\u035d\177\3\2\2\2\u035e\u0362\7C\2\2\u035f\u0361"+
		"\5\u0082B\2\u0360\u035f\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2"+
		"\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u0366"+
		"\7D\2\2\u0366\u0081\3\2\2\2\u0367\u0368\5\u0084C\2\u0368\u0369\7G\2\2"+
		"\u0369\u036d\3\2\2\2\u036a\u036d\5\u0088E\2\u036b\u036d\5\u0086D\2\u036c"+
		"\u0367\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036b\3\2\2\2\u036d\u0083\3\2"+
		"\2\2\u036e\u0370\5\16\b\2\u036f\u036e\3\2\2\2\u0370\u0373\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\3\2\2\2\u0373\u0371\3\2"+
		"\2\2\u0374\u0375\5\u00c6d\2\u0375\u0376\5F$\2\u0376\u0085\3\2\2\2\u0377"+
		"\u0379\5\f\7\2\u0378\u0377\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2"+
		"\2\2\u037a\u037b\3\2\2\2\u037b\u037f\3\2\2\2\u037c\u037a\3\2\2\2\u037d"+
		"\u0380\5\20\t\2\u037e\u0380\5 \21\2\u037f\u037d\3\2\2\2\u037f\u037e\3"+
		"\2\2\2\u0380\u0383\3\2\2\2\u0381\u0383\7G\2\2\u0382\u037a\3\2\2\2\u0382"+
		"\u0381\3\2\2\2\u0383\u0087\3\2\2\2\u0384\u03ed\5\u0080A\2\u0385\u0386"+
		"\7\4\2\2\u0386\u0389\5\u00a6T\2\u0387\u0388\7P\2\2\u0388\u038a\5\u00a6"+
		"T\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038c\7G\2\2\u038c\u03ed\3\2\2\2\u038d\u038e\7\31\2\2\u038e\u038f\5\u00a0"+
		"Q\2\u038f\u0392\5\u0088E\2\u0390\u0391\7\22\2\2\u0391\u0393\5\u0088E\2"+
		"\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u03ed\3\2\2\2\u0394\u0395"+
		"\7\30\2\2\u0395\u0396\7A\2\2\u0396\u0397\5\u009aN\2\u0397\u0398\7B\2\2"+
		"\u0398\u0399\5\u0088E\2\u0399\u03ed\3\2\2\2\u039a\u039b\7\66\2\2\u039b"+
		"\u039c\5\u00a0Q\2\u039c\u039d\5\u0088E\2\u039d\u03ed\3\2\2\2\u039e\u039f"+
		"\7\20\2\2\u039f\u03a0\5\u0088E\2\u03a0\u03a1\7\66\2\2\u03a1\u03a2\5\u00a0"+
		"Q\2\u03a2\u03a3\7G\2\2\u03a3\u03ed\3\2\2\2\u03a4\u03a5\7\62\2\2\u03a5"+
		"\u03af\5\u0080A\2\u03a6\u03a8\5\u008aF\2\u03a7\u03a6\3\2\2\2\u03a8\u03a9"+
		"\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab"+
		"\u03ad\5\u008eH\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03b0"+
		"\3\2\2\2\u03ae\u03b0\5\u008eH\2\u03af\u03a7\3\2\2\2\u03af\u03ae\3\2\2"+
		"\2\u03b0\u03ed\3\2\2\2\u03b1\u03b2\7\62\2\2\u03b2\u03b3\5\u0090I\2\u03b3"+
		"\u03b7\5\u0080A\2\u03b4\u03b6\5\u008aF\2\u03b5\u03b4\3\2\2\2\u03b6\u03b9"+
		"\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9"+
		"\u03b7\3\2\2\2\u03ba\u03bc\5\u008eH\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc"+
		"\3\2\2\2\u03bc\u03ed\3\2\2\2\u03bd\u03be\7,\2\2\u03be\u03bf\5\u00a0Q\2"+
		"\u03bf\u03c3\7C\2\2\u03c0\u03c2\5\u0096L\2\u03c1\u03c0\3\2\2\2\u03c2\u03c5"+
		"\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c9\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c6\u03c8\5\u0098M\2\u03c7\u03c6\3\2\2\2\u03c8\u03cb"+
		"\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb"+
		"\u03c9\3\2\2\2\u03cc\u03cd\7D\2\2\u03cd\u03ed\3\2\2\2\u03ce\u03cf\7-\2"+
		"\2\u03cf\u03d0\5\u00a0Q\2\u03d0\u03d1\5\u0080A\2\u03d1\u03ed\3\2\2\2\u03d2"+
		"\u03d4\7\'\2\2\u03d3\u03d5\5\u00a6T\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5"+
		"\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03ed\7G\2\2\u03d7\u03d8\7/\2\2\u03d8"+
		"\u03d9\5\u00a6T\2\u03d9\u03da\7G\2\2\u03da\u03ed\3\2\2\2\u03db\u03dd\7"+
		"\7\2\2\u03dc\u03de\7s\2\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03ed\7G\2\2\u03e0\u03e2\7\16\2\2\u03e1\u03e3\7s"+
		"\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03ed\7G\2\2\u03e5\u03ed\7G\2\2\u03e6\u03e7\5\u00a6T\2\u03e7\u03e8\7"+
		"G\2\2\u03e8\u03ed\3\2\2\2\u03e9\u03ea\7s\2\2\u03ea\u03eb\7P\2\2\u03eb"+
		"\u03ed\5\u0088E\2\u03ec\u0384\3\2\2\2\u03ec\u0385\3\2\2\2\u03ec\u038d"+
		"\3\2\2\2\u03ec\u0394\3\2\2\2\u03ec\u039a\3\2\2\2\u03ec\u039e\3\2\2\2\u03ec"+
		"\u03a4\3\2\2\2\u03ec\u03b1\3\2\2\2\u03ec\u03bd\3\2\2\2\u03ec\u03ce\3\2"+
		"\2\2\u03ec\u03d2\3\2\2\2\u03ec\u03d7\3\2\2\2\u03ec\u03db\3\2\2\2\u03ec"+
		"\u03e0\3\2\2\2\u03ec\u03e5\3\2\2\2\u03ec\u03e6\3\2\2\2\u03ec\u03e9\3\2"+
		"\2\2\u03ed\u0089\3\2\2\2\u03ee\u03ef\7\n\2\2\u03ef\u03f3\7A\2\2\u03f0"+
		"\u03f2\5\16\b\2\u03f1\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3"+
		"\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6"+
		"\u03f7\5\u008cG\2\u03f7\u03f8\7s\2\2\u03f8\u03f9\7B\2\2\u03f9\u03fa\5"+
		"\u0080A\2\u03fa\u008b\3\2\2\2\u03fb\u0400\5\\/\2\u03fc\u03fd\7^\2\2\u03fd"+
		"\u03ff\5\\/\2\u03fe\u03fc\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2"+
		"\2\2\u0400\u0401\3\2\2\2\u0401\u008d\3\2\2\2\u0402\u0400\3\2\2\2\u0403"+
		"\u0404\7\26\2\2\u0404\u0405\5\u0080A\2\u0405\u008f\3\2\2\2\u0406\u0407"+
		"\7A\2\2\u0407\u0409\5\u0092J\2\u0408\u040a\7G\2\2\u0409\u0408\3\2\2\2"+
		"\u0409\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\7B\2\2\u040c\u0091"+
		"\3\2\2\2\u040d\u0412\5\u0094K\2\u040e\u040f\7G\2\2\u040f\u0411\5\u0094"+
		"K\2\u0410\u040e\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412"+
		"\u0413\3\2\2\2\u0413\u0093\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0417\5\16"+
		"\b\2\u0416\u0415\3\2\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\u041b\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u041c\5N"+
		"(\2\u041c\u041d\7s\2\2\u041d\u041e\7J\2\2\u041e\u041f\5\u00a6T\2\u041f"+
		"\u0095\3\2\2\2\u0420\u0422\5\u0098M\2\u0421\u0420\3\2\2\2\u0422\u0423"+
		"\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425"+
		"\u0427\5\u0082B\2\u0426\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0426"+
		"\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u0097\3\2\2\2\u042a\u042d\7\t\2\2\u042b"+
		"\u042e\5\u00a6T\2\u042c\u042e\7s\2\2\u042d\u042b\3\2\2\2\u042d\u042c\3"+
		"\2\2\2\u042e\u042f\3\2\2\2\u042f\u0433\7P\2\2\u0430\u0431\7\17\2\2\u0431"+
		"\u0433\7P\2\2\u0432\u042a\3\2\2\2\u0432\u0430\3\2\2\2\u0433\u0099\3\2"+
		"\2\2\u0434\u0441\5\u009eP\2\u0435\u0437\5\u009cO\2\u0436\u0435\3\2\2\2"+
		"\u0436\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a\7G\2\2\u0439\u043b"+
		"\5\u00a6T\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\3\2\2"+
		"\2\u043c\u043e\7G\2\2\u043d\u043f\5\u00a2R\2\u043e\u043d\3\2\2\2\u043e"+
		"\u043f\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u0434\3\2\2\2\u0440\u0436\3\2"+
		"\2\2\u0441\u009b\3\2\2\2\u0442\u0445\5\u0084C\2\u0443\u0445\5\u00a2R\2"+
		"\u0444\u0442\3\2\2\2\u0444\u0443\3\2\2\2\u0445\u009d\3\2\2\2\u0446\u0448"+
		"\5\16\b\2\u0447\u0446\3\2\2\2\u0448\u044b\3\2\2\2\u0449\u0447\3\2\2\2"+
		"\u0449\u044a\3\2\2\2\u044a\u044c\3\2\2\2\u044b\u0449\3\2\2\2\u044c\u044d"+
		"\5\u00c6d\2\u044d\u044e\7s\2\2\u044e\u044f\7P\2\2\u044f\u0450\5\u00a6"+
		"T\2\u0450\u009f\3\2\2\2\u0451\u0452\7A\2\2\u0452\u0453\5\u00a6T\2\u0453"+
		"\u0454\7B\2\2\u0454\u00a1\3\2\2\2\u0455\u045a\5\u00a6T\2\u0456\u0457\7"+
		"H\2\2\u0457\u0459\5\u00a6T\2\u0458\u0456\3\2\2\2\u0459\u045c\3\2\2\2\u045a"+
		"\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u00a3\3\2\2\2\u045c\u045a\3\2"+
		"\2\2\u045d\u045e\7s\2\2\u045e\u0460\7A\2\2\u045f\u0461\5\u00a2R\2\u0460"+
		"\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0470\7B"+
		"\2\2\u0463\u0464\7.\2\2\u0464\u0466\7A\2\2\u0465\u0467\5\u00a2R\2\u0466"+
		"\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0470\7B"+
		"\2\2\u0469\u046a\7+\2\2\u046a\u046c\7A\2\2\u046b\u046d\5\u00a2R\2\u046c"+
		"\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0470\7B"+
		"\2\2\u046f\u045d\3\2\2\2\u046f\u0463\3\2\2\2\u046f\u0469\3\2\2\2\u0470"+
		"\u00a5\3\2\2\2\u0471\u0472\bT\1\2\u0472\u049e\5\u00aeX\2\u0473\u049e\5"+
		"\u00a4S\2\u0474\u0475\7\"\2\2\u0475\u049e\5\u00b2Z\2\u0476\u047a\7A\2"+
		"\2\u0477\u0479\5f\64\2\u0478\u0477\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478"+
		"\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047d\3\2\2\2\u047c\u047a\3\2\2\2\u047d"+
		"\u0482\5\u00c6d\2\u047e\u047f\7]\2\2\u047f\u0481\5\u00c6d\2\u0480\u047e"+
		"\3\2\2\2\u0481\u0484\3\2\2\2\u0482\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483"+
		"\u0485\3\2\2\2\u0484\u0482\3\2\2\2\u0485\u0486\7B\2\2\u0486\u0487\5\u00a6"+
		"T\27\u0487\u049e\3\2\2\2\u0488\u0489\t\5\2\2\u0489\u049e\5\u00a6T\25\u048a"+
		"\u048b\t\6\2\2\u048b\u049e\5\u00a6T\24\u048c\u049e\5\u00a8U\2\u048d\u048e"+
		"\5\u00c6d\2\u048e\u0494\7m\2\2\u048f\u0491\5\u00ccg\2\u0490\u048f\3\2"+
		"\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0495\7s\2\2\u0493"+
		"\u0495\7\"\2\2\u0494\u0490\3\2\2\2\u0494\u0493\3\2\2\2\u0495\u049e\3\2"+
		"\2\2\u0496\u0497\5\u00b0Y\2\u0497\u0499\7m\2\2\u0498\u049a\5\u00ccg\2"+
		"\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c"+
		"\7\"\2\2\u049c\u049e\3\2\2\2\u049d\u0471\3\2\2\2\u049d\u0473\3\2\2\2\u049d"+
		"\u0474\3\2\2\2\u049d\u0476\3\2\2\2\u049d\u0488\3\2\2\2\u049d\u048a\3\2"+
		"\2\2\u049d\u048c\3\2\2\2\u049d\u048d\3\2\2\2\u049d\u0496\3\2\2\2\u049e"+
		"\u04ef\3\2\2\2\u049f\u04a0\f\23\2\2\u04a0\u04a1\t\7\2\2\u04a1\u04ee\5"+
		"\u00a6T\24\u04a2\u04a3\f\22\2\2\u04a3\u04a4\t\b\2\2\u04a4\u04ee\5\u00a6"+
		"T\23\u04a5\u04ad\f\21\2\2\u04a6\u04a7\7L\2\2\u04a7\u04ae\7L\2\2\u04a8"+
		"\u04a9\7K\2\2\u04a9\u04aa\7K\2\2\u04aa\u04ae\7K\2\2\u04ab\u04ac\7K\2\2"+
		"\u04ac\u04ae\7K\2\2\u04ad\u04a6\3\2\2\2\u04ad\u04a8\3\2\2\2\u04ad\u04ab"+
		"\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04ee\5\u00a6T\22\u04b0\u04b1\f\20"+
		"\2\2\u04b1\u04b2\t\t\2\2\u04b2\u04ee\5\u00a6T\21\u04b3\u04b4\f\16\2\2"+
		"\u04b4\u04b5\t\n\2\2\u04b5\u04ee\5\u00a6T\17\u04b6\u04b7\f\r\2\2\u04b7"+
		"\u04b8\7]\2\2\u04b8\u04ee\5\u00a6T\16\u04b9\u04ba\f\f\2\2\u04ba\u04bb"+
		"\7_\2\2\u04bb\u04ee\5\u00a6T\r\u04bc\u04bd\f\13\2\2\u04bd\u04be\7^\2\2"+
		"\u04be\u04ee\5\u00a6T\f\u04bf\u04c0\f\n\2\2\u04c0\u04c1\7U\2\2\u04c1\u04ee"+
		"\5\u00a6T\13\u04c2\u04c3\f\t\2\2\u04c3\u04c4\7V\2\2\u04c4\u04ee\5\u00a6"+
		"T\n\u04c5\u04c6\f\b\2\2\u04c6\u04c7\7O\2\2\u04c7\u04c8\5\u00a6T\2\u04c8"+
		"\u04c9\7P\2\2\u04c9\u04ca\5\u00a6T\b\u04ca\u04ee\3\2\2\2\u04cb\u04cc\f"+
		"\7\2\2\u04cc\u04cd\t\13\2\2\u04cd\u04ee\5\u00a6T\7\u04ce\u04cf\f\33\2"+
		"\2\u04cf\u04db\7I\2\2\u04d0\u04dc\7s\2\2\u04d1\u04dc\5\u00a4S\2\u04d2"+
		"\u04dc\7.\2\2\u04d3\u04d5\7\"\2\2\u04d4\u04d6\5\u00c2b\2\u04d5\u04d4\3"+
		"\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04dc\5\u00b6\\\2"+
		"\u04d8\u04d9\7+\2\2\u04d9\u04dc\5\u00ceh\2\u04da\u04dc\5\u00bc_\2\u04db"+
		"\u04d0\3\2\2\2\u04db\u04d1\3\2\2\2\u04db\u04d2\3\2\2\2\u04db\u04d3\3\2"+
		"\2\2\u04db\u04d8\3\2\2\2\u04db\u04da\3\2\2\2\u04dc\u04ee\3\2\2\2\u04dd"+
		"\u04de\f\32\2\2\u04de\u04df\7E\2\2\u04df\u04e0\5\u00a6T\2\u04e0\u04e1"+
		"\7F\2\2\u04e1\u04ee\3\2\2\2\u04e2\u04e3\f\26\2\2\u04e3\u04ee\t\f\2\2\u04e4"+
		"\u04e5\f\17\2\2\u04e5\u04e6\7\35\2\2\u04e6\u04ee\5\u00c6d\2\u04e7\u04e8"+
		"\f\5\2\2\u04e8\u04ea\7m\2\2\u04e9\u04eb\5\u00ccg\2\u04ea\u04e9\3\2\2\2"+
		"\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ee\7s\2\2\u04ed\u049f"+
		"\3\2\2\2\u04ed\u04a2\3\2\2\2\u04ed\u04a5\3\2\2\2\u04ed\u04b0\3\2\2\2\u04ed"+
		"\u04b3\3\2\2\2\u04ed\u04b6\3\2\2\2\u04ed\u04b9\3\2\2\2\u04ed\u04bc\3\2"+
		"\2\2\u04ed\u04bf\3\2\2\2\u04ed\u04c2\3\2\2\2\u04ed\u04c5\3\2\2\2\u04ed"+
		"\u04cb\3\2\2\2\u04ed\u04ce\3\2\2\2\u04ed\u04dd\3\2\2\2\u04ed\u04e2\3\2"+
		"\2\2\u04ed\u04e4\3\2\2\2\u04ed\u04e7\3\2\2\2\u04ee\u04f1\3\2\2\2\u04ef"+
		"\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u00a7\3\2\2\2\u04f1\u04ef\3\2"+
		"\2\2\u04f2\u04f3\5\u00aaV\2\u04f3\u04f4\7l\2\2\u04f4\u04f5\5\u00acW\2"+
		"\u04f5\u00a9\3\2\2\2\u04f6\u0507\7s\2\2\u04f7\u04f9\7A\2\2\u04f8\u04fa"+
		"\5V,\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb"+
		"\u0507\7B\2\2\u04fc\u04fd\7A\2\2\u04fd\u0502\7s\2\2\u04fe\u04ff\7H\2\2"+
		"\u04ff\u0501\7s\2\2\u0500\u04fe\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500"+
		"\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\3\2\2\2\u0504\u0502\3\2\2\2\u0505"+
		"\u0507\7B\2\2\u0506\u04f6\3\2\2\2\u0506\u04f7\3\2\2\2\u0506\u04fc\3\2"+
		"\2\2\u0507\u00ab\3\2\2\2\u0508\u050b\5\u00a6T\2\u0509\u050b\5\u0080A\2"+
		"\u050a\u0508\3\2\2\2\u050a\u0509\3\2\2\2\u050b\u00ad\3\2\2\2\u050c\u050d"+
		"\7A\2\2\u050d\u050e\5\u00a6T\2\u050e\u050f\7B\2\2\u050f\u051f\3\2\2\2"+
		"\u0510\u051f\7.\2\2\u0511\u051f\7+\2\2\u0512\u051f\5^\60\2\u0513\u051f"+
		"\7s\2\2\u0514\u0515\5.\30\2\u0515\u0516\7I\2\2\u0516\u0517\7\f\2\2\u0517"+
		"\u051f\3\2\2\2\u0518\u051c\5\u00c2b\2\u0519\u051d\5\u00d0i\2\u051a\u051b"+
		"\7.\2\2\u051b\u051d\5\u00d2j\2\u051c\u0519\3\2\2\2\u051c\u051a\3\2\2\2"+
		"\u051d\u051f\3\2\2\2\u051e\u050c\3\2\2\2\u051e\u0510\3\2\2\2\u051e\u0511"+
		"\3\2\2\2\u051e\u0512\3\2\2\2\u051e\u0513\3\2\2\2\u051e\u0514\3\2\2\2\u051e"+
		"\u0518\3\2\2\2\u051f\u00af\3\2\2\2\u0520\u0521\5N(\2\u0521\u0522\7I\2"+
		"\2\u0522\u0524\3\2\2\2\u0523\u0520\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0528"+
		"\3\2\2\2\u0525\u0527\5f\64\2\u0526\u0525\3\2\2\2\u0527\u052a\3\2\2\2\u0528"+
		"\u0526\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b\3\2\2\2\u052a\u0528\3\2"+
		"\2\2\u052b\u052d\7s\2\2\u052c\u052e\5\u00ccg\2\u052d\u052c\3\2\2\2\u052d"+
		"\u052e\3\2\2\2\u052e\u00b1\3\2\2\2\u052f\u0530\5\u00c2b\2\u0530\u0531"+
		"\5\u00b4[\2\u0531\u0532\5\u00ba^\2\u0532\u0539\3\2\2\2\u0533\u0536\5\u00b4"+
		"[\2\u0534\u0537\5\u00b8]\2\u0535\u0537\5\u00ba^\2\u0536\u0534\3\2\2\2"+
		"\u0536\u0535\3\2\2\2\u0537\u0539\3\2\2\2\u0538\u052f\3\2\2\2\u0538\u0533"+
		"\3\2\2\2\u0539\u00b3\3\2\2\2\u053a\u053c\7s\2\2\u053b\u053d\5\u00be`\2"+
		"\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u0545\3\2\2\2\u053e\u053f"+
		"\7I\2\2\u053f\u0541\7s\2\2\u0540\u0542\5\u00be`\2\u0541\u0540\3\2\2\2"+
		"\u0541\u0542\3\2\2\2\u0542\u0544\3\2\2\2\u0543\u053e\3\2\2\2\u0544\u0547"+
		"\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u054a\3\2\2\2\u0547"+
		"\u0545\3\2\2\2\u0548\u054a\5\u00caf\2\u0549\u053a\3\2\2\2\u0549\u0548"+
		"\3\2\2\2\u054a\u00b5\3\2\2\2\u054b\u054d\7s\2\2\u054c\u054e\5\u00c0a\2"+
		"\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550"+
		"\5\u00ba^\2\u0550\u00b7\3\2\2\2\u0551\u056d\7E\2\2\u0552\u0557\7F\2\2"+
		"\u0553\u0554\7E\2\2\u0554\u0556\7F\2\2\u0555\u0553\3\2\2\2\u0556\u0559"+
		"\3\2\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\3\2\2\2\u0559"+
		"\u0557\3\2\2\2\u055a\u056e\5L\'\2\u055b\u055c\5\u00a6T\2\u055c\u0563\7"+
		"F\2\2\u055d\u055e\7E\2\2\u055e\u055f\5\u00a6T\2\u055f\u0560\7F\2\2\u0560"+
		"\u0562\3\2\2\2\u0561\u055d\3\2\2\2\u0562\u0565\3\2\2\2\u0563\u0561\3\2"+
		"\2\2\u0563\u0564\3\2\2\2\u0564\u056a\3\2\2\2\u0565\u0563\3\2\2\2\u0566"+
		"\u0567\7E\2\2\u0567\u0569\7F\2\2\u0568\u0566\3\2\2\2\u0569\u056c\3\2\2"+
		"\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056e\3\2\2\2\u056c\u056a"+
		"\3\2\2\2\u056d\u0552\3\2\2\2\u056d\u055b\3\2\2\2\u056e\u00b9\3\2\2\2\u056f"+
		"\u0571\5\u00d2j\2\u0570\u0572\5\"\22\2\u0571\u0570\3\2\2\2\u0571\u0572"+
		"\3\2\2\2\u0572\u00bb\3\2\2\2\u0573\u0574\5\u00c2b\2\u0574\u0575\5\u00d0"+
		"i\2\u0575\u00bd\3\2\2\2\u0576\u0577\7L\2\2\u0577\u057a\7K\2\2\u0578\u057a"+
		"\5\u00ccg\2\u0579\u0576\3\2\2\2\u0579\u0578\3\2\2\2\u057a\u00bf\3\2\2"+
		"\2\u057b\u057c\7L\2\2\u057c\u057f\7K\2\2\u057d\u057f\5\u00c2b\2\u057e"+
		"\u057b\3\2\2\2\u057e\u057d\3\2\2\2\u057f\u00c1\3\2\2\2\u0580\u0581\7L"+
		"\2\2\u0581\u0582\5\u00c4c\2\u0582\u0583\7K\2\2\u0583\u00c3\3\2\2\2\u0584"+
		"\u0589\5\u00c6d\2\u0585\u0586\7H\2\2\u0586\u0588\5\u00c6d\2\u0587\u0585"+
		"\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u0587\3\2\2\2\u0589\u058a\3\2\2\2\u058a"+
		"\u00c5\3\2\2\2\u058b\u0589\3\2\2\2\u058c\u058e\5f\64\2\u058d\u058c\3\2"+
		"\2\2\u058e\u0591\3\2\2\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590"+
		"\u0592\3\2\2\2\u0591\u058f\3\2\2\2\u0592\u059d\5\u00c8e\2\u0593\u0595"+
		"\5f\64\2\u0594\u0593\3\2\2\2\u0595\u0598\3\2\2\2\u0596\u0594\3\2\2\2\u0596"+
		"\u0597\3\2\2\2\u0597\u0599\3\2\2\2\u0598\u0596\3\2\2\2\u0599\u059a\7E"+
		"\2\2\u059a\u059c\7F\2\2\u059b\u0596\3\2\2\2\u059c\u059f\3\2\2\2\u059d"+
		"\u059b\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u00c7\3\2\2\2\u059f\u059d\3\2"+
		"\2\2\u05a0\u05a3\5N(\2\u05a1\u05a3\5\u00caf\2\u05a2\u05a0\3\2\2\2\u05a2"+
		"\u05a1\3\2\2\2\u05a3\u00c9\3\2\2\2\u05a4\u05a5\t\r\2\2\u05a5\u00cb\3\2"+
		"\2\2\u05a6\u05a7\7L\2\2\u05a7\u05ac\5P)\2\u05a8\u05a9\7H\2\2\u05a9\u05ab"+
		"\5P)\2\u05aa\u05a8\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac"+
		"\u05ad\3\2\2\2\u05ad\u05af\3\2\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b0\7K"+
		"\2\2\u05b0\u00cd\3\2\2\2\u05b1\u05b8\5\u00d2j\2\u05b2\u05b3\7I\2\2\u05b3"+
		"\u05b5\7s\2\2\u05b4\u05b6\5\u00d2j\2\u05b5\u05b4\3\2\2\2\u05b5\u05b6\3"+
		"\2\2\2\u05b6\u05b8\3\2\2\2\u05b7\u05b1\3\2\2\2\u05b7\u05b2\3\2\2\2\u05b8"+
		"\u00cf\3\2\2\2\u05b9\u05ba\7+\2\2\u05ba\u05be\5\u00ceh\2\u05bb\u05bc\7"+
		"s\2\2\u05bc\u05be\5\u00d2j\2\u05bd\u05b9\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be"+
		"\u00d1\3\2\2\2\u05bf\u05c1\7A\2\2\u05c0\u05c2\5\u00a2R\2\u05c1\u05c0\3"+
		"\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\7B\2\2\u05c4"+
		"\u00d3\3\2\2\2\u00bb\u00d8\u00de\u00e6\u00f1\u00f5\u00fc\u0103\u0106\u0110"+
		"\u0116\u011a\u011f\u0123\u0127\u0131\u0139\u0141\u0145\u014c\u0153\u0157"+
		"\u015a\u015d\u0166\u016c\u0171\u0174\u017a\u0180\u0184\u018c\u0195\u019c"+
		"\u01a0\u01a5\u01ac\u01b3\u01ba\u01c1\u01c8\u01cf\u01d6\u01dd\u01e1\u01ea"+
		"\u01ef\u01f5\u01f9\u0205\u0210\u0215\u021e\u0226\u0230\u0239\u0241\u0246"+
		"\u024e\u0253\u025d\u0267\u026d\u0271\u0279\u027d\u027f\u0285\u028a\u028e"+
		"\u0295\u029b\u029d\u02a4\u02a9\u02b2\u02b7\u02ba\u02bf\u02c8\u02cf\u02da"+
		"\u02e3\u02ed\u02f6\u02fb\u02fe\u0305\u030f\u0317\u031a\u031d\u032a\u0332"+
		"\u0337\u033f\u0343\u0347\u034b\u034d\u0351\u0357\u0362\u036c\u0371\u037a"+
		"\u037f\u0382\u0389\u0392\u03a9\u03ac\u03af\u03b7\u03bb\u03c3\u03c9\u03d4"+
		"\u03dd\u03e2\u03ec\u03f3\u0400\u0409\u0412\u0418\u0423\u0428\u042d\u0432"+
		"\u0436\u043a\u043e\u0440\u0444\u0449\u045a\u0460\u0466\u046c\u046f\u047a"+
		"\u0482\u0490\u0494\u0499\u049d\u04ad\u04d5\u04db\u04ea\u04ed\u04ef\u04f9"+
		"\u0502\u0506\u050a\u051c\u051e\u0523\u0528\u052d\u0536\u0538\u053c\u0541"+
		"\u0545\u0549\u054d\u0557\u0563\u056a\u056d\u0571\u0579\u057e\u0589\u058f"+
		"\u0596\u059d\u05a2\u05ac\u05b5\u05b7\u05bd\u05c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}