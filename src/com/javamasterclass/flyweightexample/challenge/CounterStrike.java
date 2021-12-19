package com.javamasterclass.flyweightexample.challenge;

import java.util.Random;
import java.util.stream.IntStream;

public class CounterStrike {
    // All player types and weapons (used by getRandomPlayerType() and getWeapon())
    private static final String[] PLAYER_TYPE = {"Terrorist", "CounterTerrorist"};
    private static final String[] WEAPONS = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {
        // Assume that we have a total of 10 players in the game
        IntStream.range(0, 10).forEach(i -> {
            var p = PlayerFactory.getPlayer(getRandPlayerType());
            p.assignWeapon(getRandWeapon());
            p.mission();
        });
    }

    private static String getRandWeapon() {
        return WEAPONS[new Random().nextInt(WEAPONS.length)];
    }

    private static String getRandPlayerType() {
        return PLAYER_TYPE[new Random().nextInt(PLAYER_TYPE.length)];
    }
}
