package com.javamasterclass.flyweightexample;

public interface RobotInterface {
    void print();

    // extrinsic data is passed as args
    void setColor(String colorOfRobot);
}
