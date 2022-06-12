package com.javamasterclass.stateexample;

public class Off extends RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am off. Going to be on now");
        context.setState(new On());
    }
}
