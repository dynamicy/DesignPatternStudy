public class Context
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public int doStrategy(int number1, int number2)
    {
        return strategy.doOperation(number1, number2);
    }
}
