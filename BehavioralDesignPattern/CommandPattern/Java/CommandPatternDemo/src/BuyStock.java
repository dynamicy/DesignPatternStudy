public class BuyStock implements Order
{
    private Stock ibmStock;

    public BuyStock(Stock ibmStock)
    {
        this.ibmStock = ibmStock;
    }

    public void execute()
    {
        ibmStock.buy();
    }
}
