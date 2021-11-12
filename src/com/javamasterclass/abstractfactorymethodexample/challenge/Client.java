package com.javamasterclass.abstractfactorymethodexample.challenge;

public class Client {
    public static void main(String[] args) {
        var actionMovies = FactoryProducer.getFactory("Action");
        var hAction = actionMovies.getHollywoodMovie();
        var bAction = actionMovies.getBollywoodMovie();
        System.out.println("Action movies are: ");
        System.out.println(hAction.getMovieName());
        System.out.println(bAction.getMovieName());

        var comedyMovies = FactoryProducer.getFactory("Comedy");
        var hComedy = comedyMovies.getHollywoodMovie();
        var bComedy = comedyMovies.getBollywoodMovie();
        System.out.println("Hollywood movies are: ");
        System.out.println(hComedy.getMovieName());
        System.out.println(bComedy.getMovieName());
    }
}
