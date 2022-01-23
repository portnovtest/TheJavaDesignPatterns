package com.javamasterclass.chainofresponsibilityexample.challenge;

public class FaxErrorHandler implements ReceiverInterface {
    private ReceiverInterface nextReceiver;


    public void setNextChain(ReceiverInterface nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean processMessage(Message msg) {
        if (msg.text.contains("Fax")) {
            System.out.printf("FaxErrorHandler processed %s priority issue: %s%n", msg.priority, msg.text);
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(msg);
            }
        }
        return false;
    }
}
