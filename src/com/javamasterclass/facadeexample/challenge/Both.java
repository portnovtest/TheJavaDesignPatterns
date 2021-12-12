package com.javamasterclass.facadeexample.challenge;

public class Both implements Menus {
    public Both() {
        System.out.println("Creating both a veg and non veg menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in both a veg and non veg menu");
    }
}
