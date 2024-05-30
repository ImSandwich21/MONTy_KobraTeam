package expression;

public class Relational extends Expression
{
    public Expression left;
    public Expression right;
    public String operator;

    public Relational(Expression left, Expression right, String operator)
    {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString()
    {
        return left.toString() + " " + operator + " " + right.toString();
    }
}
