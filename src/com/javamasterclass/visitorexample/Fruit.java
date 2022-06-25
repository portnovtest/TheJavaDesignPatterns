package com.javamasterclass.visitorexample;

public record Fruit(int pricePerKg, int weight, String name) implements ItemElement {

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
