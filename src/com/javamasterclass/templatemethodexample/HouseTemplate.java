package com.javamasterclass.templatemethodexample;

public abstract class HouseTemplate {
    // template method, final so that subclasses can't override it
    final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    // default implementation, hook method
    private void buildWindows() {
        System.out.println("Build Glass Windows");
    }

    abstract void buildWalls();

    abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods ands sand");
    }
}
