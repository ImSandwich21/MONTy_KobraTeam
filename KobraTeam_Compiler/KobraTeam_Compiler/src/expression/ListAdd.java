package expression;

public class ListAdd extends Expression
{
    public String id;
    public Expression position;
    public Expression value;

    public ListAdd(String id, Expression position, Expression value)
    {
        this.id = id;
        this.position = position;
        this.value = value;
    }

    @Override
    public String toString() 
    {
        return "add (" + id + ", " + position.toString() + ", " + value.toString() + ")";
    }

    
}
