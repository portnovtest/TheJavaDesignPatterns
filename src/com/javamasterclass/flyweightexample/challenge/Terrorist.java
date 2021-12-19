package com.javamasterclass.flyweightexample.challenge;

public class Terrorist implements Player {
    // intrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    public Terrorist() {
        TASK = "Plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " : Task is " + TASK);
    }
}
