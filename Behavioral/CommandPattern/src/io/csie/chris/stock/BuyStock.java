package io.csie.chris.stock;

import io.csie.chris.stock.common.IStock;
import io.csie.chris.stock.common.Order;

public class BuyStock implements Order {

    private IStock ibmStock;

    public BuyStock(IStock ibmStock) {
        this.ibmStock = ibmStock;
    }

    public void execute() {
        ibmStock.buy();
    }
}
