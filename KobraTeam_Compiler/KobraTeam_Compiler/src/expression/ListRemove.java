package expression;

public class ListRemove extends Expression
{
    public String id;
    public Integer position;

    public ListRemove(String id, Integer position)
    {
        this.id = id;
        this.position = position;
    }

    @Override
    public String toString() 
    {
        return "remove(" + id + ", " + position + ")";
    }

    
}
