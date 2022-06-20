package com.javamasterclass.templatemethodexample.challenge;

public class NetOrder extends OrderProcessTemplate {
    @Override
    void doSelect() {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preference");
        System.out.println("Get delivery address");
    }

    @Override
    void doPayment() {
        System.out.println("Online Payment through Net banking , card or PayPal");
    }

    @Override
    void doDelivery() {
        System.out.println("Ship the item through post office to delivery address");
    }
}
