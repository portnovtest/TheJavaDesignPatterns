package com.javamasterclass.decoratorexample;

public class ConcreteDecoratorEx2 extends AbstractDecorator {
    public void doJob() {

        System.out.println();
        System.out.println("***START Ex 2***");
        super.doJob();
        // add additional responsibilities
        System.out.println("I am explicitly from example 2");
        System.out.println("***END Ex 2***");
    }
}
