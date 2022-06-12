package com.javamasterclass.stateexample;

public class Client {
    public static void main(String[] args) {
        System.out.println("***State Pattern Demo***\n");

        // Initially TV is Off
        var initialState = new Off();
        var tv = new TV(initialState);

        // First time press
        tv.pressButton();
        // Second time press
        tv.pressButton();
    }
}
