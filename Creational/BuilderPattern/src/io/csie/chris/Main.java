package io.csie.chris;

import io.csie.chris.builder.*;
import io.csie.chris.builder.common.Builder;
import io.csie.chris.builder.common.Director;
import io.csie.chris.builder.common.Product;

public class Main {

    public static void main(String args[]) {

        // Create director and builders
        Director director = new Director();

        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        // Construct two products
        director.Construct(builder1);
        Product product1 = builder1.GetResult();
        product1.Show();

        director.Construct(builder2);
        Product product2 = builder2.GetResult();
        product2.Show();
    }
}
