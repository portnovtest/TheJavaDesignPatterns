package com.javamasterclass.templatemethodexample.challenge;

public abstract class OrderProcessTemplate {
    boolean isGift;

    abstract void doSelect();

    abstract void doPayment();

    final void giftWrap() {
        System.out.println("Gift Wrap Successful");
    }

    abstract void doDelivery();

    // the actual template method
    final void processOrder(boolean isGift) {
        doSelect();
        doPayment();
        if (isGift) {
            giftWrap();
        }
        doDelivery();
    }
}
