package com.javamasterclass.singletonsynchronizedapproachexample;

public class TestSingleton {
    public static void main(String[] args) {
        var s = Singleton.getInstance();
        // set the data value
        s.setData(55);

        System.out.printf("""
                First reference: %s
                Singleton data value is: %d
                %n""", s, s.getData());

        // Get another reference to the Singleton.
        // Is it the same object?

        s = null;
        s = Singleton.getInstance();

        System.out.printf("""
                Second reference: %s
                Singleton data value is: %d
                """, s, s.getData());

    }
}
