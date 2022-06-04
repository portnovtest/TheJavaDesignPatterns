package com.javamasterclass.mediatorexample.challenge;

public abstract class Buyer {
    // this class holds the buyer
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);

    public abstract void cancelTheBid();

    public abstract void auctionHasEnded();
}
