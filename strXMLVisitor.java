public class strXMLVisitor extends strBaseVisitor<String> {


  @Override
  public String visitExprString(strParser.ExprStringContext ctx) 
  {
	return ctx.STRING().getText() + super.visit(ctx.expr());
  }

  @Override
  public String visitExprParenthesis(strParser.ExprParenthesisContext ctx) {
    return "(" + super.visit(ctx.expr(0)) + ")" + super.visit(ctx.expr(1));
  }

  @Override
  public String visitExprRule(strParser.ExprRuleContext ctx) {
    String value = ctx.LR_STRING_BRACKET().getText().substring(1);
    return "<" + value + ">" + super.visit(ctx.expr(0)) + "</" + value + ">" + super.visit(ctx.expr(1));
  }

  @Override
  public String visitExprEnd(strParser.ExprEndContext ctx) {
    return "";
  }
  
  @Override
  public String visitExprEOF(strParser.ExprEOFContext ctx) {
    return "";
  }
  
  @Override
  public String visitExprEpsilon(strParser.ExprEpsilonContext ctx) {
    return "";
  }
  
}