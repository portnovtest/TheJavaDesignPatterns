package com.javamasterclass.stateexample.challenge;

public class Vibration implements MobileAlertSate {
    @Override
    public void alert() {
        System.out.println("vibration...");
    }
}
