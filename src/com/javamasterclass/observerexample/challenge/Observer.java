package com.javamasterclass.observerexample.challenge;

// implemented by all those classes that update when CricketData updates
public interface Observer {
    void update(int runs, int wickets, float overs);
}
