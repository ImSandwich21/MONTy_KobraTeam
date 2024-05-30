package expression;

public class Flutuante extends Expression 
{
    public float value;

    public Flutuante(float value)
    {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
