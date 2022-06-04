package com.javamasterclass.mediatorexample.challenge;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
    // this class implements mediator interface and holds all buyers in an arraylist.
    // We can add byers and find the highest bidder
    private final List<Buyer> buyers;

    public AuctionMediator() {
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;
        for (Buyer b : buyers) {
            if (b.price > maxBid) {
                maxBid = b.price;
                winner = b;
            }
        }
        assert winner != null;
        System.out.println("The auction winner is " + winner.name + ". He paid $" + winner.price + " for the item.");
        buyers.forEach(Buyer::auctionHasEnded);
    }
}
