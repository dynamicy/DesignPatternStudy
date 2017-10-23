package io.csie.chris.shape;

public class Circle implements IShape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Color: " + color);
    }
}
