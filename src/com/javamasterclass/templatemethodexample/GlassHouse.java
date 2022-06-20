package com.javamasterclass.templatemethodexample;

public class GlassHouse extends HouseTemplate {

    @Override
    void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    void buildPillars() {
        System.out.println("Building Pillars with Glass coating");
    }
}
