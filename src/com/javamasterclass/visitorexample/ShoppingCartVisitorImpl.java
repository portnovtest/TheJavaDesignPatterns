package com.javamasterclass.visitorexample;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        var cost = book.getPrice() > 50 ? book.getPrice() - 5 : book.getPrice();
        System.out.println("Book ISBN: " + book.getIsbnNumber() + " cost = " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        var cost = fruit.pricePerKg() * fruit.weight();
        System.out.println(fruit.name() + " cost = " + cost);
        return cost;
    }
}
