package com.javamasterclass.observerexample.challenge;

// Implemented by Cricket data to communicate w/ observers
public interface Subject {
    void registerObserver(Observer o);

    void unregisterObserver(Observer o);

    void notifyObservers();
}
