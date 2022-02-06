package com.javamasterclass.iteratorexample;

// contains collection of notifications as objects of NotificationCollection
public class NotificationBar {
    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    public void printNotifications() {
        var iterator = notifications.createIterator();
        System.out.println("-------NOTIFICATION BAR-------");
        while (iterator.hasNext()) {
            var n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
