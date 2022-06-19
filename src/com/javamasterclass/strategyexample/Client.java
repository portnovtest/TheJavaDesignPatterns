package com.javamasterclass.strategyexample;

public class Client {
    public static void main(String[] args) {
        var cart = new ShoppingCart(); // the context
        var item1 = new Item("1234", 10);
        var item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by PayPal
        cart.pay(new PaypalStrategy("phil@nonya.net", "password"));

        // pay by credit card
        cart.pay(new CreditCardStrategy("phil", "123456789101112", "123", "12/23"));

    }
}
