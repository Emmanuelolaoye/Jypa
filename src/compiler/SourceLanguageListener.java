// Generated from M:/CE305/The Small Compiler/src/compiler\SourceLanguage.g4 by ANTLR 4.12.0
package compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SourceLanguageParser}.
 */
public interface SourceLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SourceLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SourceLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SourceLanguageParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SourceLanguageParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SourceLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SourceLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(SourceLanguageParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(SourceLanguageParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SourceLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SourceLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperators}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperators(SourceLanguageParser.AssignmentOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperators}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperators(SourceLanguageParser.AssignmentOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentIncDec}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentIncDec(SourceLanguageParser.AssignmentIncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentIncDec}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentIncDec(SourceLanguageParser.AssignmentIncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#if_Statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_Statement(SourceLanguageParser.If_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#if_Statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_Statement(SourceLanguageParser.If_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#def_method}.
	 * @param ctx the parse tree
	 */
	void enterDef_method(SourceLanguageParser.Def_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#def_method}.
	 * @param ctx the parse tree
	 */
	void exitDef_method(SourceLanguageParser.Def_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#set_parameter}.
	 * @param ctx the parse tree
	 */
	void enterSet_parameter(SourceLanguageParser.Set_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#set_parameter}.
	 * @param ctx the parse tree
	 */
	void exitSet_parameter(SourceLanguageParser.Set_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#set_function_Parameter}.
	 * @param ctx the parse tree
	 */
	void enterSet_function_Parameter(SourceLanguageParser.Set_function_ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#set_function_Parameter}.
	 * @param ctx the parse tree
	 */
	void exitSet_function_Parameter(SourceLanguageParser.Set_function_ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(SourceLanguageParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(SourceLanguageParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#while_Statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_Statement(SourceLanguageParser.While_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#while_Statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_Statement(SourceLanguageParser.While_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#for_Statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_Statement(SourceLanguageParser.For_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#for_Statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_Statement(SourceLanguageParser.For_StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(SourceLanguageParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(SourceLanguageParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SourceLanguageParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SourceLanguageParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(SourceLanguageParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(SourceLanguageParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(SourceLanguageParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(SourceLanguageParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketsExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketsExpression(SourceLanguageParser.BracketsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketsExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketsExpression(SourceLanguageParser.BracketsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(SourceLanguageParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(SourceLanguageParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegateExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegateExpression(SourceLanguageParser.NegateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegateExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegateExpression(SourceLanguageParser.NegateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(SourceLanguageParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(SourceLanguageParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(SourceLanguageParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(SourceLanguageParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(SourceLanguageParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(SourceLanguageParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(SourceLanguageParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(SourceLanguageParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus_Minus}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus_Minus(SourceLanguageParser.Plus_MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus_Minus}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus_Minus(SourceLanguageParser.Plus_MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpression(SourceLanguageParser.DivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpression(SourceLanguageParser.DivisionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOrExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndOrExpression(SourceLanguageParser.AndOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOrExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndOrExpression(SourceLanguageParser.AndOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SourceLanguageParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SourceLanguageParser.NameContext ctx);
}