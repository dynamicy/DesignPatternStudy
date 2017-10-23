package io.csie.chris.menu;

public class Item implements IMenu {

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Item: " + this.name + ", " + this.price);
    }
}
