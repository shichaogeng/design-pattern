package com.gengsc.builder.com.gengsc.builder.real;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void remove(String part) {
        parts.remove(part);
    }

    public void show() {
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
