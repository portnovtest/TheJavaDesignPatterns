package com.javamasterclass.chainofresponsibilityexample;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency curr);
}
