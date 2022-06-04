package com.javamasterclass.mediatorexample;

public class Client {
    public static void main(String[] args) {
        var mediator = new ChatMediatorImpl();
        var user1 = new UserImpl(mediator, "Phil");
        var user2 = new UserImpl(mediator, "John");
        var user3 = new UserImpl(mediator, "Josh");
        var user4 = new UserImpl(mediator, "Doker");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
