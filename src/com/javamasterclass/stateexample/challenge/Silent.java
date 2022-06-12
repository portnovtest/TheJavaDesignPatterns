package com.javamasterclass.stateexample.challenge;

public class Silent implements MobileAlertSate {

    @Override
    public void alert() {
        System.out.println("silent...");
    }
}
