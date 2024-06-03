package expression;

public class UnaryOp extends Expression
{
    public Expression left;
    public Expression right;
    public String operator;
    public String completeExpression;

    public UnaryOp(Expression left, Expression right, String operator, String completeExpression)
    {
        this.left = left;
        this.right = right;
        this.operator = operator;
        this.completeExpression = completeExpression;
    }

    @Override
    public String toString()
    {
        return left.toString() + " " + operator + " " + right.toString();
    }
}
