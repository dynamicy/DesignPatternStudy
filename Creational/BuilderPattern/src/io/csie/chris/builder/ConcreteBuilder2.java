package io.csie.chris.builder;

import io.csie.chris.builder.common.Builder;
import io.csie.chris.builder.common.Product;

public class ConcreteBuilder2 extends Builder {

    private Product mProduct = new Product();

    public void BuildPartA() {
        mProduct.Add("Part X");
    }

    public void BuildPartB() {
        mProduct.Add("Part Y");
    }

    public Product GetResult() {
        return mProduct;
    }
}