package com.javamasterclass.iteratorexample;

public class Client {
    public static void main(String[] args) {
        var nc = new NotificationCollection();
        var nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}
