package com.javamasterclass.facadeexample.challenge;

public class HotelKeeper {
    public VegMenu getVegMenu() {
        return (VegMenu) new VegRestaurant().getMenus();
    }

    public NonVegMenu getNonVegMenu() {
        return (NonVegMenu) new NonVegRestaurant().getMenus();
    }

    public Both getBothMenu() {
        return (Both) new BothRestaurant().getMenus();
    }
}
