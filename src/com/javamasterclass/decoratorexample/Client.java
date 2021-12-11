package com.javamasterclass.decoratorexample;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Decorator Pattern Demo***");
        var cc = new ConcreteComponent();
        var cd1 = new ConcreteDecoratorEx1();
        // Decorating ConcreteComponent Object cc w/ ConcreteDecoratorEx1
        cd1.setTheComponent(cc);
        cd1.doJob();

        var cd2 = new ConcreteDecoratorEx2();
        // Decorating ConcreteComponent Object cc w/ ConcreteDecoratorEx1 & ConcreteDecoratorEx2
        cd2.setTheComponent(cd1); // Adding the results of cd1
        cd2.doJob();

    }
}
