package io.csie.chris;

import io.csie.chris.builder.*;

public class Main {

    public static void main(String args[]) {

        // Create director and builders
        Director tDirector = new Director();

        Builder tBuilder1 = new ConcreteBuilder1();
        Builder tBuilder2 = new ConcreteBuilder2();

        // Construct two products
        tDirector.Construct(tBuilder1);
        Product tProduct1 = tBuilder1.GetResult();
        tProduct1.Show();

        tDirector.Construct(tBuilder2);
        Product tProduct2 = tBuilder2.GetResult();
        tProduct2.Show();
    }
}
