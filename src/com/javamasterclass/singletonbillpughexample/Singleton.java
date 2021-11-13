package com.javamasterclass.singletonbillpughexample;


public class Singleton {
    // an instance attribute
    private int data = 0;

    /**
     * The Singleton constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */
    private Singleton() {
    }

    private static class SingletonHelper {
        // Nested class is referenced after getInstance is called
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    // add a set data here
    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}
