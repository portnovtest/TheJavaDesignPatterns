package com.javamasterclass.abstractfactorymethodexample.challenge;

public class FactoryProducer {
    public static MovieFactoryInterface getFactory(String choice) {
        if (choice.equalsIgnoreCase("comedy")) {
            return new ComedyMovieFactory();
        } else if (choice.equalsIgnoreCase("action")) {
            return new ActionMovieFactory();
        } else {
            throw new IllegalArgumentException("movie type not supported");
        }
    }
}
