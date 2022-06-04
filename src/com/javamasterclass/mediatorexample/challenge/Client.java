package com.javamasterclass.mediatorexample.challenge;

public class Client {
    public static void main(String[] args) {
        var mediator = new AuctionMediator();
        var b1 = new AuctionBuyer(mediator, "Phil");
        var b2 = new AuctionBuyer(mediator, "Josh");
        var b3 = new AuctionBuyer(mediator, "Doker");

        // Create and add buyers
        mediator.addBuyer(b1);
        mediator.addBuyer(b2);
        mediator.addBuyer(b3);

        System.out.println("Welcome to the auction. Tonight we are selling a vacation to Vegas");
        System.out.println("-----------------------------------------------");

        System.out.println("Waiting for the buyer's offers...");
        // making bids
        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);

        System.out.println("-----------------------------------------------");
        mediator.findHighestBidder();

        b2.cancelTheBid();
        mediator.findHighestBidder();

    }
}
