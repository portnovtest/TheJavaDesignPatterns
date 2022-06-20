package com.javamasterclass.templatemethodexample;

public class WoodenHouse extends HouseTemplate {
    @Override
    void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
}
