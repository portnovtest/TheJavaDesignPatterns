package com.javamasterclass.flyweightexample.challenge;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static final Map<String, Player> HM = new HashMap<>();

    public static Player getPlayer(String type) {
        Player p = null;
        if (HM.containsKey(type)) {
            p = HM.get(type);
        } else {
            switch (type) {
                case "Terrorist" -> {
                    System.out.println("Terrorist created");
                    p = new Terrorist();
                }
                case "CounterTerrorist" -> {
                    System.out.println("CounterTerrorist created");
                    p = new CounterTerrorist();
                }
                default -> System.out.println("Unreachable code!");
            }
            HM.put(type, p);
        }
        return p;
    }
}
