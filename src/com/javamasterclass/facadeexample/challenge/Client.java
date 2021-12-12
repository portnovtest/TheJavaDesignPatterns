package com.javamasterclass.facadeexample.challenge;

public class Client {
    public static void main(String[] args) {
        var keeper = new HotelKeeper();
        var v = keeper.getVegMenu();
        var nv = keeper.getNonVegMenu();
        var b = keeper.getBothMenu();
    }
}
