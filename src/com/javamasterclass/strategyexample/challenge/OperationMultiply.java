package com.javamasterclass.strategyexample.challenge;

public class OperationMultiply implements Strategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}
