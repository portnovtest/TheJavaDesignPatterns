package com.javamasterclass.bridgeexample.challenge;

public class RedColor implements ColorInterface {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with " + border + " inch border");
    }
}
