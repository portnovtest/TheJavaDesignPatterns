package com.javamasterclass.visitorexample.challenge;

public class USPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    // collect data about the book
    public void visit(Book book) {
        if (book.price() < 20.0) {
            totalPostageForCart += book.weight() * 2;
        }
    }

    public void visit(CD cd) {
        if (cd.price() < 20.0) {
            totalPostageForCart += cd.weight() * 2.5;
        }
    }

    public void visit(DVD dvd) {
        if (dvd.price() < 20.0) {
            totalPostageForCart += dvd.weight() * 3;
        }
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }
}
