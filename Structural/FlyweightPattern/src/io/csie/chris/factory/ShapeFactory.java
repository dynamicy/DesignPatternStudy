package io.csie.chris.factory;

import io.csie.chris.shape.Circle;
import io.csie.chris.shape.IShape;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, IShape> circleMap = new HashMap();

    public static IShape getCircle(String color) {

        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
