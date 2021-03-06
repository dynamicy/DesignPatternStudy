package io.csie.chris.builder;

import io.csie.chris.builder.common.Builder;
import io.csie.chris.builder.common.Product;

public class ConcreteBuilder1 extends Builder {

    private Product mProduct = new Product();

    public void BuildPartA() {
        mProduct.Add("Part A");
    }

    public void BuildPartB() {
        mProduct.Add("Part B");
    }

    public Product GetResult() {
        return mProduct;
    }
}
