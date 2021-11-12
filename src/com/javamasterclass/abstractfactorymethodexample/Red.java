package com.javamasterclass.abstractfactorymethodexample;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.printf("Inside %s::fill() method%n", getClass().getSimpleName());
    }
}
