package com.javamasterclass.bridgeexample.challenge;

public class GreenColor implements ColorInterface {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with " + border + " inch border");
    }
}
