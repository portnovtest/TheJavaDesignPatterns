package com.javamasterclass.adapterobjectcompositionexample;

public class Client {
    public static void main(String[] args) {
        var duck = new MallardDuck();
        var turkey = new WildTurkey();
        var turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The turkey says ....");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says ...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says....");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
