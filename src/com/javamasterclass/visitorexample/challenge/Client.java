package com.javamasterclass.visitorexample.challenge;

import java.util.ArrayList;

public class Client {
    private static final ArrayList<Visitable> items = new ArrayList<>();

    public static double calculatePostage(Visitor visitor) {
        items.forEach(i -> i.accept(visitor));
        return visitor.getTotalPostageForCart();
    }

    public static void main(String[] args) {
        var myBook = new Book(8.52, 1.05);
        var myCD = new CD(18.52, 3.05);
        var myDVD = new DVD(6.53, 4.02);

        items.add(myBook);
        items.add(myCD);
        items.add(myDVD);

        Visitor visitor = new USPostageVisitor();
        var myPostage = calculatePostage(visitor);
        System.out.printf("The total postage for my items shipped to the US is: %.2f%n", myPostage);

        visitor = new SouthAmericaPostageVisitor();
        myPostage = calculatePostage(visitor);
        System.out.printf("The total postage for my items shipped to South America is: %.2f%n", myPostage);
    }
}
