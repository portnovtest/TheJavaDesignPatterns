package com.javamasterclass.templatemethodexample.challenge;

public class Client {
    public static void main(String[] args) {
        var netOrder = new NetOrder();
        netOrder.processOrder(true);
        System.out.println("-------Changed template to store order--------");
        var storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
