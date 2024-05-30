package expression;

public class GroupExp extends Expression
{
    public Expression expression;
    public Boolean negado;

    public GroupExp(Expression expression, Boolean negado)
    {
        this.expression = expression;
        this.negado = negado;
    }

    @Override
    public String toString() {
        return (negado ? "not " : "") + "(" + expression.toString() + ")";
    }
}
