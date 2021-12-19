package com.javamasterclass.flyweightexample;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public RobotInterface getRobotFromFactory(String robotType) throws IllegalArgumentException {
        RobotInterface myRobot;
        if (shapes.containsKey(robotType)) {
            myRobot = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "King" -> {
                    System.out.println("We don't have a King Robot. So we are creating a King Robot now");
                    myRobot = new Robot("King");
                    shapes.put("King", myRobot);
                }
                case "Queen" -> {
                    System.out.println("We don't have a Queen Robot. So we are creating a Queen Robot now");
                    myRobot = new Robot("Queen");
                    shapes.put("Queen", myRobot);
                }
                default -> throw new IllegalArgumentException("Robot factory can only create King or Queen robots");
            }
        }
        return myRobot;
    }
}
