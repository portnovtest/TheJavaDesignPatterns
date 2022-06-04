package com.javamasterclass.mediatorexample.challenge;

public class AuctionBuyer extends Buyer {
    // implementation of the bidding process. There is an option to bid and option to
    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;
    }

    @Override
    public void cancelTheBid() {
        this.price = -1;
        System.out.println(this.name + " has cancelled his bid!");
    }

    @Override
    public void auctionHasEnded() {
        System.out.println(this.name + " received message that the auction is over");
    }
}
