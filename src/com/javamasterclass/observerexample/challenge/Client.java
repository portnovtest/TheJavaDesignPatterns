package com.javamasterclass.observerexample.challenge;

public class Client {
    public static void main(String[] args) {
        // create objects for testing
        var averageScoreDisplay = new AverageScoreDisplay();
        var currentScoreDisplay = new CurrentScoreDisplay();

        // pass the displays to cricket data
        var cricketData = new CricketData();

        // register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);

        // in real app u would have some logic tpo call this function when data changes
        cricketData.dataChanged();

        // remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);

        // now only currentScoreDisplay gets the notification
        cricketData.dataChanged();

    }
}
