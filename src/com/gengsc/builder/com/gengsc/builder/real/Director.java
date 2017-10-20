package com.gengsc.builder.com.gengsc.builder.real;

public class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
