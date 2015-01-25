public class Stock
{
    private String name = "IBM";
    private int quantity = 100;

    public void buy()
    {
        System.out.println("[Buy] Stock name: " + name + "quantity: " + quantity);
    }

    public void sell()
    {
        System.out.println("[Sell] Stock name: " + name + "quantity: " + quantity);
    }
}
