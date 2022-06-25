package com.javamasterclass.visitorexample;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
