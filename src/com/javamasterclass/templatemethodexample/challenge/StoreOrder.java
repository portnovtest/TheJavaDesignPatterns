package com.javamasterclass.templatemethodexample.challenge;

public class StoreOrder extends OrderProcessTemplate {

    @Override
    void doSelect() {
        System.out.println("Customer chooses the item from shelf");
    }

    @Override
    void doPayment() {
        System.out.println("Pays at the counter through cash/POS");
    }

    @Override
    void doDelivery() {
        System.out.println("Item delivered to in delivery counter");
    }
}
