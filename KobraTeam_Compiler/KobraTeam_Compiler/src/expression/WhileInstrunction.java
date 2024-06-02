package expression;

public class WhileInstrunction extends Expression
{
    public Expression left;
    public Expression right;
    public String op;

    public WhileInstrunction(Expression left, Expression right, String op)
    {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    @Override
    public String toString()
    {
        return "while " + left.toString() + op + right.toString() + ":";
    }

    
}
