package com.javamasterclass.strategyexample.challenge;

public class Client {
    public static void main(String[] args) {
        var context = new Context();
        System.out.println("10 + 5 = " + context.executeStrategy(new OperationAdd(), 10, 5));
        System.out.println("10 - 5 = " + context.executeStrategy(new OperationSubtract(), 10, 5));
        System.out.println("10 * 5 = " + context.executeStrategy(new OperationMultiply(), 10, 5));
    }
}
