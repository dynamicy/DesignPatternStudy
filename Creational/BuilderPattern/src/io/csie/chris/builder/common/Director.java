package io.csie.chris.builder.common;

public class Director {

    public void Construct(Builder builder) {

        builder.BuildPartA();

        builder.BuildPartB();
    }
}