package com.javamasterclass.strategyexample.challenge;

public class Context {
    public int executeStrategy(Strategy strategy, int num1, int num2) {
        return strategy.performOperation(num1, num2);
    }
}
