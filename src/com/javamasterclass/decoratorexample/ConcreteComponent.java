package com.javamasterclass.decoratorexample;

public class ConcreteComponent extends Component {
    @Override
    void doJob() {
        System.out.println("I am from a concrete component - I am closed for modification");
    }
}
