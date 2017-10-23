package io.csie.chris.stock;

import io.csie.chris.stock.common.IStock;

public class IBMStockFactory implements IStockFactory {

    @Override
    public IStock createStock() {
        return new IBMStock();
    }
}
