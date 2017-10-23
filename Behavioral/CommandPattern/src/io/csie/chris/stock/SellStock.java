package io.csie.chris.stock;

import io.csie.chris.stock.common.IStock;
import io.csie.chris.stock.common.Order;

public class SellStock implements Order {

    private IStock ibmStock;

    public SellStock(IStock ibmStock) {
        this.ibmStock = ibmStock;
    }

    @Override
    public void execute() {
        ibmStock.sell();
    }
}
