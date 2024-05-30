package expression;

public class ListSize extends Expression
{
    public String id;

    public ListSize(String id)
    {
        this.id = id;
    }

    @Override
    public String toString() 
    {
        return "size (" + id + ")";
    }
}
