package expression;

public class Pow extends Expression
{
    public Expression left;
    public Expression rigth;

    public Pow(Expression left, Expression right)
    {
        this.left = left;
        this.rigth = right;
    }

    @Override
    public String toString() {
        return left + " ** " + rigth;
    }
}
