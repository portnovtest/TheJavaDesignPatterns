package com.javamasterclass.visitorexample;

public class Book implements ItemElement {
    private final int price;
    private final String isbnNumber;

    public Book(int cost, String isbn) {
        price = cost;
        isbnNumber = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
