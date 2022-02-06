package com.javamasterclass.iteratorexample;

public class NotificationIterator implements Iterator {
    Notification[] notificationList;

    // maintains current pos of iterator over the array
    int pos = 0;
    // Constructor takes the array of notificationList

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        return pos < notificationList.length && notificationList[pos] != null;

    }

    @Override
    public Object next() {
        // return next element in the array and increment pos
        var notification = notificationList[pos];
        pos++;
        return notification;
    }
}
