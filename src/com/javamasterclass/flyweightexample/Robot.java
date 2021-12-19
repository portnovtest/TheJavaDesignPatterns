package com.javamasterclass.flyweightexample;

public class Robot implements RobotInterface {
    public String robotType;
    public String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }

    @Override
    public void print() {
        System.out.printf("This is a %s type robot with %s color. \n", robotType, colorOfRobot);
    }
}
