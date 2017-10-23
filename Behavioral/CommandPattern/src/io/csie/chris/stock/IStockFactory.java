package io.csie.chris.stock;

import io.csie.chris.stock.common.IStock;

public interface IStockFactory {
    IStock createStock();
}
