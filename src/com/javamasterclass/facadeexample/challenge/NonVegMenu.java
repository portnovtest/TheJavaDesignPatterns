package com.javamasterclass.facadeexample.challenge;

public class NonVegMenu implements Menus {
    public NonVegMenu() {
        System.out.println("Creating a non veg menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in non veg menu");
    }
}
