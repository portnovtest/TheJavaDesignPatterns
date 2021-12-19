package com.javamasterclass.flyweightexample.challenge;

public class CounterTerrorist implements Player {
    // intrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    public CounterTerrorist() {
        TASK = "Diffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("CounterTerrorist with weapon " + weapon + " : Task is " + TASK);
    }
}
