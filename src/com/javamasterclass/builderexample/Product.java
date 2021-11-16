package com.javamasterclass.builderexample;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }


    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("Product completed as below");
        parts.forEach(System.out::println);
    }
}
