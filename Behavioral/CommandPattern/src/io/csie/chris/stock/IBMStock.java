package io.csie.chris.stock;

import io.csie.chris.stock.common.IStock;

public class IBMStock implements IStock {

    private String name;
    private int quantity;

    IBMStock() {
        this.name = "IBM";
        this.quantity = 100;
    }

    @Override
    public void buy() {
        System.out.println("[Buy] Stock name: " + name + " quantity: " + quantity);
    }

    @Override
    public void sell() {
        System.out.println("[Sell] Stock name: " + name + " quantity: " + quantity);
    }
}
