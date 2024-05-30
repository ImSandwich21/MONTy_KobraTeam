package expression;

public class ListIndex extends Expression
{
    public String id;
    public int index;

    public ListIndex(String id, int index)
    {
        this.id = id;
        this.index = index;
    }

    @Override
    public String toString() 
    {
        return  id + "[" + index + "])";
    }
}
