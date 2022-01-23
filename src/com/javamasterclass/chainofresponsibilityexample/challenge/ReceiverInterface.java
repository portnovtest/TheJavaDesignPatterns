package com.javamasterclass.chainofresponsibilityexample.challenge;

public interface ReceiverInterface {
    boolean processMessage(Message msg);

    void setNextChain(ReceiverInterface nextChain);
}
