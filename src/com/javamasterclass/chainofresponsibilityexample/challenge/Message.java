package com.javamasterclass.chainofresponsibilityexample.challenge;

public class Message {
    public String text;
    public MessagePriority priority;

    public Message(String msg, MessagePriority p) {
        this.text = msg;
        this.priority = p;
    }
}
