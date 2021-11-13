package com.javamasterclass.singletoneagerinitializationexample;

public class Singleton {
    // create an instance of singleton in a static initializer, code is guaranteed to be thread safe
    private static Singleton uniqueInstance = new Singleton();

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */
    private Singleton() {
    }

    // by adding the synchronized keyword to getInstance(),
    // we force every thread to wait its turn before it can enter the method
    public static Singleton getInstance() {
        // we already got an instance, so just return it
        return uniqueInstance;
    }
    // add a set data here

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}
