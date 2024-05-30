package expression;

public class WhileInstrunction extends Expression
{
    public Expression condicao;

    public WhileInstrunction(Expression condicao)
    {
        this.condicao = condicao;
    }

    @Override
    public String toString()
    {
        return "while " + condicao + ":";
    }

    
}
