package com.javamasterclass.abstractfactorymethodexample.challenge;

public class ComedyMovieFactory implements MovieFactoryInterface {

    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
