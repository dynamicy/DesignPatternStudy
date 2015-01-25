public class SellStock implements Order
{
    private Stock ibmStock;

    public SellStock(Stock ibmStock)
    {
        this.ibmStock = ibmStock;
    }

    @Override
    public void execute()
    {
        ibmStock.sell();
    }
}
