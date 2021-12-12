package com.javamasterclass.facadeexample.challenge;

public class VegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new VegMenu();
    }
}
