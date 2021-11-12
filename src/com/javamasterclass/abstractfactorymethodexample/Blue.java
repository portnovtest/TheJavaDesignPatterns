package com.javamasterclass.abstractfactorymethodexample;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.printf("Inside %s::fill() method%n", getClass().getSimpleName());
    }
}
