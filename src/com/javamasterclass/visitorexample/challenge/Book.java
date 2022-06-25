package com.javamasterclass.visitorexample.challenge;

public record Book(double price, double weight) implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
