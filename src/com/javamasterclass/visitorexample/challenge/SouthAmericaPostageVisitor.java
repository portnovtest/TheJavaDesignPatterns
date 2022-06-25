package com.javamasterclass.visitorexample.challenge;

public class SouthAmericaPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if (book.price() < 30.0) {
            totalPostageForCart += (book.weight() * 2) * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.price() < 30.0) {
            totalPostageForCart += (cd.weight() * 2.5) * 2;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.price() < 30.0) {
            totalPostageForCart += (dvd.weight() * 3) * 2;
        }
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }
}
