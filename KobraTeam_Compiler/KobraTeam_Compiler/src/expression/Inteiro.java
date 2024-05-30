package expression;

public class Inteiro extends Expression
{
    public int value;

    public Inteiro(int value)
    {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
