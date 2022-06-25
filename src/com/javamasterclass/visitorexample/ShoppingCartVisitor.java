package com.javamasterclass.visitorexample;

public interface ShoppingCartVisitor {
    int visit(Book book);

    int visit(Fruit fruit);
}
