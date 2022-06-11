package com.javamasterclass.observerexample;

public interface Subject {
    // methods to register and unregister observers
    void register(Observer obj);

    void unregister(Observer obj);

    // method to notify observers of changes
    void notifyObservers();

    // method to get updates from subject, not required, but added so observers can query the subject to see if an
    // update has occurred
    Object getUpdate(Observer obj);
}
