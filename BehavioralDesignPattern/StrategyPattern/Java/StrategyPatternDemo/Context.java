public class Context
{
    private IStrategy strategy;

    public Context(IStrategy strategy)
    {
        this.strategy = strategy;
    }

    public int doStrategy(int number1, int number2)
    {
        return strategy.doOperation(number1, number2);
    }
}
