package com.javamasterclass.facadeexample.challenge;

public class VegMenu implements Menus {
    public VegMenu() {
        System.out.println("Creating a veg menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in veg menu");
    }
}
