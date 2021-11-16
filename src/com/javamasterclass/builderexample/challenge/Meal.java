package com.javamasterclass.builderexample.challenge;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public Meal() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        return items.stream().mapToDouble(Item::price).sum();
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packaging: " + item.packaging().pack());
            System.out.println(", Price: " + item.price());
        }
    }
}
