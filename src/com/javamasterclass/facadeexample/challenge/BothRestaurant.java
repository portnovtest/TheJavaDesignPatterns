package com.javamasterclass.facadeexample.challenge;

public class BothRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new Both();
    }
}
