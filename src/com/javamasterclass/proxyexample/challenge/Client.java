package com.javamasterclass.proxyexample.challenge;

public class Client {
    public static void main(String[] args) {
        var internet = new ProxyInternet();
        try {
            internet.connectTo("phil.org");
            internet.connectTo("whatever.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
