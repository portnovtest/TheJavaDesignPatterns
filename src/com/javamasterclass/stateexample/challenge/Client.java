package com.javamasterclass.stateexample.challenge;

public class Client {
    public static void main(String[] args) {
        var stateContext = new AlertStateContext();

        stateContext.alert();
        stateContext.alert();

        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
}
