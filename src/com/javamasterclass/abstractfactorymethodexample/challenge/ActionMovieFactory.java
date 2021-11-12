package com.javamasterclass.abstractfactorymethodexample.challenge;

public class ActionMovieFactory implements MovieFactoryInterface {
    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
