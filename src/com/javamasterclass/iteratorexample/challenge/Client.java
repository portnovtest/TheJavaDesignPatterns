package com.javamasterclass.iteratorexample.challenge;

public class Client {
    public static void Print(IteratorInterface iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        var sc_subject = new Science();
        var ar_subject = new Arts();
        var sc_iterator = sc_subject.createIterator();
        var ar_iterator = ar_subject.createIterator();

        System.out.println("\nScience subjects :");
        Print(sc_iterator);
        System.out.println("\nArts subjects :");
        Print(ar_iterator);
    }
}
