public class Main {
    public static void main(String[] args) {
        IStockFactory ibmStockFactory = new IBMStockFactory();
        Stock IBMStock = ibmStockFactory.createStock();

        BuyStock buyStockOrder = new BuyStock(IBMStock);
        SellStock sellStockOrder = new SellStock(IBMStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
