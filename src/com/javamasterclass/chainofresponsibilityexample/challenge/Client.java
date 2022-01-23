package com.javamasterclass.chainofresponsibilityexample.challenge;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Chain of Responsibility Pattern Demo***\n");
        // Make the chain first: Fax -> Email
        // Set end of the chain
        var emailHandler = new EmailErrorHandler();

        // Fax handler is before email
        var faxHandler = new FaxErrorHandler();
        faxHandler.setNextChain(emailHandler);

        // starting point: raiser will raise issues and set the first handler
        var raiser = new IssueRaiser(faxHandler);

        var m1 = new Message("Fax is reaching late to the destination", MessagePriority.NORMAL);
        var m2 = new Message("Email is not being sent", MessagePriority.HIGH);
        var m3 = new Message("In Email, BBC field is disabled", MessagePriority.NORMAL);
        var m4 = new Message("Fax is not reaching destination", MessagePriority.HIGH);
        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
