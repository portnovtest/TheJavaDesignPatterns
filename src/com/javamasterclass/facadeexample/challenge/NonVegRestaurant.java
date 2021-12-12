package com.javamasterclass.facadeexample.challenge;

public class NonVegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
