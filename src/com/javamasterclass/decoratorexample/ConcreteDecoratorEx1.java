package com.javamasterclass.decoratorexample;

public class ConcreteDecoratorEx1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();
        // add additional responsibilities
        System.out.println("I am explicitly from example 1");
    }
}
