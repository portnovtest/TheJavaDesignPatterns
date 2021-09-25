package com.javamasterclass.dependencyinjectionexample;

public class Client {
    private Service myService;

    // injects via constructor

    public Client(Service service) {
        this.myService = service;
    }

    public void doSomething() {
        myService.write("This is a message");
    }

    public static void main(String[] args) {
        Service service = new ServiceA(); // the injector
        Client client = new Client(service); // injects via the constructor
        client.doSomething();
    }
}
