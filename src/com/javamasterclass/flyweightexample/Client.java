package com.javamasterclass.flyweightexample;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class Client {
    public static void main(String[] args) throws IllegalArgumentException {
        var myFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");

        AtomicReference<RobotInterface> shape = new AtomicReference<>(myFactory.getRobotFromFactory("King"));
        // Here we are trying to get the object 2 more times. Note that from now on we don't need to create additional
        // small robots as we have already created this category
        IntStream.range(0, 3).forEach(i -> {
            shape.set(myFactory.getRobotFromFactory("King"));
            shape.get().setColor(getRandomColor());
            shape.get().print();
        });
        int numberOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created 'till now = " + numberOfDistinctRobots);

        // Here we are trying to get the objects 5 times. Note that second time onward we don't need to create additional
        // large robots
        IntStream.range(0, 3).forEach(i -> {
            shape.set(myFactory.getRobotFromFactory("Queen"));
            shape.get().setColor(getRandomColor());
            shape.get().print();
        });
        numberOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\nFinally number of Distinct Robot objects created: " + numberOfDistinctRobots);
    }

    private static String getRandomColor() {
        int random = new Random().nextInt(20);
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
