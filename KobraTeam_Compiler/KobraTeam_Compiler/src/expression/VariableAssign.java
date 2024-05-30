package expression;

public class VariableAssign extends Expression
{
    public String id;
    public Expression value;

    public VariableAssign(String id, Expression value)
    {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() 
    {
        return id + " = " + value.toString();
    }

    
}
