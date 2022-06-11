package com.javamasterclass.observerexample.challenge;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {
    private int runs;
    private int wickets;
    private float overs;
    private final List<Observer> observerList;

    public CricketData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(i -> i.update(runs, wickets, overs));
    }

    private int getLatestRuns() {
        return 90;
    }

    private int getWickets() {
        return 2;
    }

    private float getOvers() {
        return (float) 10.2;
    }

    public void dataChanged() {
        // get latest data
        runs = getLatestRuns();
        wickets = getWickets();
        overs = getOvers();
        notifyObservers();
    }
}
