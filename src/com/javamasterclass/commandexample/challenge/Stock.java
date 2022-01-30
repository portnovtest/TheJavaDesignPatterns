package com.javamasterclass.commandexample.challenge;

public class Stock {
    private String name = "Google";
    private int quantity = 1000;

    public void buy() {
        System.out.printf("Stock [ Name: %s , Quantity: %d ] bought%n", name, quantity);
    }

    public void sell() {
        System.out.printf("Stock [ Name: %s , Quantity: %d ] sold%n", name, quantity);
    }
}
