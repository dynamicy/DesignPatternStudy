package io.csie.chris.builder;

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