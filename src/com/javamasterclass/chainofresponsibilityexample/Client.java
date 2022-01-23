package com.javamasterclass.chainofresponsibilityexample;

import java.util.Scanner;

public class Client {
    private DispenseChain c1;

    public Client() {
        // init the chain
        this.c1 = new DollarFiftyDispenser();
        var c2 = new DollarTwentyDispenser();
        var c3 = new DollarTenDispenser();

        // set the chain responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        var atmDispenser = new Client();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            var input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiples of 10's");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}
