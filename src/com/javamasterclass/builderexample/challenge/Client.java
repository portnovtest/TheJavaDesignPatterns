package com.javamasterclass.builderexample.challenge;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Meal Pattern Demo***");
        var director = new Director();
        var vegMealBuilder = new VegMealBuilder();
        var nonVegMealBuilder = new NonVegMealBuilder();

        // making veg meal
        director.construct(vegMealBuilder);
        var vegMeal = vegMealBuilder.getMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        // making non-veg meal
        director.construct(nonVegMealBuilder);
        var nonVegMeal = nonVegMealBuilder.getMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
