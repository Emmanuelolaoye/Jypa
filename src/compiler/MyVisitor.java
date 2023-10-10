package compiler;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor extends SourceLanguageBaseVisitor<String> {
    public static HashSet<SourceLanguageParser.ExpressionContext> stringsToWrap = new HashSet();
    StringBuilder python_Code = new StringBuilder();
    String eq = " = ";
    String ws = " ";
    String none = "none";
    int Indent = 0;
    int ifCounter = 0;

    public MyVisitor() {
    }

    public String visitProgram(SourceLanguageParser.ProgramContext ctx) {
        visit(ctx.stat());
        return this.python_Code.toString();
    }

    public String visitStatement(SourceLanguageParser.StatementContext ctx) {
        return visit(ctx.getChild(0));
    }

    public String visitStat(SourceLanguageParser.StatContext ctx) {
        if (ctx.children == null) {
            return "";
        } else {
            Iterator var2 = ctx.children.iterator();

            while(var2.hasNext()) {
                ParseTree child = (ParseTree)var2.next();
                if (child instanceof SourceLanguageParser.StatementContext) {
                    this.Indents(this.Indent);
                    this.python_Code.append((String)this.visit(child));
                    this.python_Code.append("\n");
                } else {
                    TerminalNode terminal = (TerminalNode)child;
                    if (terminal.getSymbol().getType() == MyMain.languageParser.getTokenType("NEWL")) {
                        if (this.python_Code.toString().endsWith("\n")) {
                            this.python_Code.deleteCharAt(this.python_Code.length() - 1);
                        }

                        this.python_Code.append(child.getText().replace(" ", ""));
                    }
                }
            }

            return "";
        }
    }

    private void blankStat(SourceLanguageParser.StatContext ctx) {
        if (ctx.getText().isBlank()) {
            this.Indents(this.Indent);
            this.python_Code.append("None");
        }

    }

    public String visitWhile_Statement(SourceLanguageParser.While_StatementContext ctx) {
        ++this.Indent;
        this.python_Code.append("while ");
        this.python_Code.append((String)this.visit(ctx.expression()));
        this.python_Code.append(":\n");
        this.blankStat(ctx.stat());
        this.visit(ctx.stat());
        --this.Indent;
        return "";
    }

    public String visitFor_Statement(SourceLanguageParser.For_StatementContext ctx) {
        this.python_Code.append("\n");
        this.Indents(this.Indent);
        this.python_Code.append("while ");
        this.python_Code.append(visit(ctx.cond));
        this.python_Code.append(":\n");
        ++this.Indent;
        this.visit(ctx.stat());
        this.Indents(this.Indent);
        this.python_Code.append(visit(ctx.step));
        --this.Indent;
        return "";
    }

    public String visitIf_Statement(SourceLanguageParser.If_StatementContext ctx) {
        ++this.Indent;
        this.python_Code.append("if ").append((String)this.visit(ctx.expression(0))).append(":\n");
        this.blankStat(ctx.stat(0));
        this.visit(ctx.stat(0));

        for(int i = 1; i < ctx.expression().size(); ++i) {
            this.Indents(this.Indent - 1);
            this.python_Code.append("elif ").append((String)this.visit(ctx.expression(i))).append(":\n");
            this.blankStat(ctx.stat(i));
            this.visit(ctx.stat(i));
        }

        if (ctx.elseBlock != null) {
            this.Indents(this.Indent - 1);
            this.python_Code.append("else:\n");
            this.blankStat(ctx.elseBlock);
            this.visit(ctx.elseBlock);
        }

        this.python_Code.deleteCharAt(this.python_Code.length() - 1);
        --this.Indent;
        return "";
    }

    public String getExpression(SourceLanguageParser.ExpressionContext ctx) {
        ParseTree l_expr = ctx.getChild(0);
        ParseTree operator = ctx.getChild(1);
        ParseTree r_expr = ctx.getChild(2);
        String left = visit(l_expr);
        String right = visit(r_expr);
        return left + this.ws + operator + this.ws + right;
    }

    public static String getRepeatedString(String repeatedString, int number) {
        return (new String(new char[number])).replace("\u0000", repeatedString);
    }

    private void Indents(int indent) {
        this.python_Code.append(getRepeatedString("\t", indent));
    }

    public String visitAssignment(SourceLanguageParser.AssignmentContext ctx) {
        String varName = ctx.identifier.getText();
        String val = visit(ctx.expr);
        return varName + this.eq + val;
    }

    public String visitAssignmentOperators(SourceLanguageParser.AssignmentOperatorsContext ctx) {
        String varName = ctx.identifier.getText();
        String value = visit(ctx.expr);
        String result = this.putAddEq(ctx);
        return result != null ? varName + result : varName + this.ws + ctx.op.getText() + this.ws + value;
    }

    public String visitAssignmentIncDec(SourceLanguageParser.AssignmentIncDecContext ctx) {
        String varName = ctx.identifier.getText();
        return varName + this.eq + varName + this.ws + ctx.op.getText().charAt(0) + " 1";
    }

    public String visitNegateExpression(SourceLanguageParser.NegateExpressionContext ctx) {
        Object var10000 = this.visit(ctx.expression());
        return "not " + (String)var10000;
    }

    public String visitBracketsExpression(SourceLanguageParser.BracketsExpressionContext ctx) {
        Object var10000 = this.visit(ctx.expression());
        return "(" + (String)var10000 + ")";
    }

    public String visitDef_method(SourceLanguageParser.Def_methodContext ctx) {
        this.python_Code.append("def ").append(ctx.identifier.getText()).append("(");
        Iterator var2 = ctx.set_parameter().set_function_Parameter().iterator();

        while(var2.hasNext()) {
            SourceLanguageParser.Set_function_ParameterContext parameter = (SourceLanguageParser.Set_function_ParameterContext)var2.next();
            this.python_Code.append((String)this.visit(parameter)).append(" , ");
        }

        if (this.python_Code.charAt(this.python_Code.length() - 2) == ',') {
            this.python_Code.delete(this.python_Code.length() - 3, this.python_Code.length());
        }

        ++this.Indent;
        this.python_Code.append("):\n");
        if (ctx.returnValue == null) {
            this.blankStat(ctx.stat());
        }

        this.visit(ctx.stat());
        if (ctx.returnValue != null) {
            this.Indents(this.Indent);
            this.python_Code.append("return ").append((String)this.visit(ctx.returnValue));
        }

        --this.Indent;
        return "";
    }

    public String visitSet_function_Parameter(SourceLanguageParser.Set_function_ParameterContext ctx) {
        return ctx.identifier.getText();
    }

    public String visitFunctionCallExpression(SourceLanguageParser.FunctionCallExpressionContext ctx) {
        return visit(ctx.method());
    }

    public String visitMethod(SourceLanguageParser.MethodContext ctx) {
        StringBuffer functionCall = new StringBuffer(ctx.identifier.getText() + "(");
        String delim = "";

        for(Iterator var4 = ctx.expression().iterator(); var4.hasNext(); delim = ",") {
            SourceLanguageParser.ExpressionContext argument = (SourceLanguageParser.ExpressionContext)var4.next();
            functionCall.append(delim);
            functionCall.append((String)this.visit(argument));
        }

        return "" + functionCall + ")";
    }

    public String visitNullExpression(SourceLanguageParser.NullExpressionContext ctx) {
        return "None";
    }

    public String visitBooleanExpression(SourceLanguageParser.BooleanExpressionContext ctx) {
        String var10000 = ctx.getText().substring(0, 1).toUpperCase();
        return var10000 + ctx.getText().substring(1);
    }

    public String visitStringExpression(SourceLanguageParser.StringExpressionContext ctx) {
        return ctx.getText();
    }

    public String visitNumberExpression(SourceLanguageParser.NumberExpressionContext ctx) {
        return ctx.getText();
    }

    public String visitAndOrExpression(SourceLanguageParser.AndOrExpressionContext ctx) {
        String left = visit(ctx.getChild(0));
        String right = visit(ctx.getChild(2));
        String and_or = "";
        switch (ctx.op.getText()) {
            case "Or":
                and_or = "or";
                break;
            case "And":
                and_or = "and";
        }

        return left + this.ws + and_or + this.ws + right;
    }

    public String visitPlus_Minus(SourceLanguageParser.Plus_MinusContext ctx) {
        String result = this.putAdd(ctx);
        return result != null ? result : this.getExpression(ctx);
    }

    public String visitComparisonExpression(SourceLanguageParser.ComparisonExpressionContext ctx) {
        return this.getExpression(ctx);
    }

    public String visitMultiplyExpression(SourceLanguageParser.MultiplyExpressionContext ctx) {
        return this.getExpression(ctx);
    }

    public String visitDivisionExpression(SourceLanguageParser.DivisionExpressionContext ctx) {
        return this.getExpression(ctx);
    }

    public String visitUnaryExpression(SourceLanguageParser.UnaryExpressionContext ctx) {
        return (String)super.visitUnaryExpression(ctx);
    }

    private String putAdd(SourceLanguageParser.Plus_MinusContext ctx) {
        StringBuilder result = new StringBuilder();
        if (ctx.op.getText().equals("+")) {
            Iterator var3 = stringsToWrap.iterator();

            while(var3.hasNext()) {
                SourceLanguageParser.ExpressionContext expression = (SourceLanguageParser.ExpressionContext)var3.next();
                if (this.searchExpressions(expression, ctx.r_expr)) {
                    result.append((String)this.visit(ctx.l_expr)).append(" + str(").append((String)this.visit(ctx.r_expr)).append(")");
                    return result.toString();
                }

                if (this.searchExpressions(expression, ctx.l_expr)) {
                    result.append("str(").append((String)this.visit(ctx.l_expr)).append(") + ").append((String)this.visit(ctx.r_expr));
                    return result.toString();
                }
            }
        }

        return null;
    }

    private String putAddEq(SourceLanguageParser.AssignmentOperatorsContext ctx) {
        StringBuilder result = new StringBuilder();
        if (ctx.op.getText().contains("+")) {
            Iterator var3 = stringsToWrap.iterator();

            while(var3.hasNext()) {
                SourceLanguageParser.ExpressionContext expression = (SourceLanguageParser.ExpressionContext)var3.next();
                if (this.searchExpressions(expression, ctx.expr)) {
                    result.append("=+ str(").append((String)this.visit(ctx.expr)).append(")");
                    return result.toString();
                }
            }
        }

        return null;
    }

    public String visitIdExpression(SourceLanguageParser.IdExpressionContext ctx) {
        return ctx.getText();
    }

    private boolean searchExpressions(SourceLanguageParser.ExpressionContext i, SourceLanguageParser.ExpressionContext ctx) {
        return ctx.start.getStartIndex() == i.start.getStartIndex() && ctx.stop.getStartIndex() == i.stop.getStartIndex() && Objects.equals(ctx.getText(), i.getText()) && i.children.size() == ctx.children.size() && i.invokingState == ctx.invokingState && Objects.equals(i.parent.getText(), ctx.parent.getText()) && i.getRuleIndex() == ctx.getRuleIndex();
    }

    public String visitVarDeclaration(SourceLanguageParser.VarDeclarationContext ctx) {
        String variableName = ctx.identifier.getText();
        String value;
        if (ctx.expr != null) {
            value = visit(ctx.expr);
        } else {
            value = "None";
        }

        return variableName + " = " + value;
    }
}