public class IBMStockFactory implements IStockFactory
{
    @Override
    public Stock createStock()
    {
        return new IBMStock();
    }
}
