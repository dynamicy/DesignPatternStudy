package io.csie.chris.builder;

public class Director {

    public void Construct(Builder builder) {

        builder.BuildPartA();

        builder.BuildPartB();
    }
}