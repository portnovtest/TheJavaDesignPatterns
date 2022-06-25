package com.javamasterclass.visitorexample;

import java.util.Arrays;

public class Client {
    private static int calculatePrice(ItemElement[] items) {
        var visitor = new ShoppingCartVisitorImpl();
        return Arrays.stream(items).mapToInt(i -> i.accept(visitor)).sum();
    }

    public static void main(String[] args) {
        var items = new ItemElement[]{new Book(20, "1234"), new Book(100, "5678"),
                new Fruit(10, 2, "Bananas"), new Fruit(5, 5, "Apples")};
        var total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }
}
