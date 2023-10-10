// Generated from M:/CE305/The Small Compiler/src/compiler\SourceLanguage.g4 by ANTLR 4.12.0
package compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SourceLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SourceLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SourceLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SourceLanguageParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SourceLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(SourceLanguageParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SourceLanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentOperators}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperators(SourceLanguageParser.AssignmentOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentIncDec}
	 * labeled alternative in {@link SourceLanguageParser#set_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentIncDec(SourceLanguageParser.AssignmentIncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#if_Statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_Statement(SourceLanguageParser.If_StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#def_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_method(SourceLanguageParser.Def_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#set_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_parameter(SourceLanguageParser.Set_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#set_function_Parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_function_Parameter(SourceLanguageParser.Set_function_ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(SourceLanguageParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#while_Statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_Statement(SourceLanguageParser.While_StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#for_Statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_Statement(SourceLanguageParser.For_StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(SourceLanguageParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SourceLanguageParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(SourceLanguageParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(SourceLanguageParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketsExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsExpression(SourceLanguageParser.BracketsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(SourceLanguageParser.NullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegateExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpression(SourceLanguageParser.NegateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(SourceLanguageParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(SourceLanguageParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(SourceLanguageParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(SourceLanguageParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus_Minus}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_Minus(SourceLanguageParser.Plus_MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(SourceLanguageParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOrExpression}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrExpression(SourceLanguageParser.AndOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SourceLanguageParser.NameContext ctx);
}