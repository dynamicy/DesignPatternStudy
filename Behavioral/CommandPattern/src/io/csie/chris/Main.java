package io.csie.chris;

import io.csie.chris.stock.*;
import io.csie.chris.stock.broker.Broker;
import io.csie.chris.stock.common.IStock;

public class Main {

    public static void main(String[] args) {

        IStockFactory ibmStockFactory = new IBMStockFactory();
        IStock IBMStock = ibmStockFactory.createStock();

        BuyStock buyStockOrder = new BuyStock(IBMStock);
        SellStock sellStockOrder = new SellStock(IBMStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
