package com.javamasterclass.prototypeexample.challenge;

import java.util.HashMap;
import java.util.Map;

public class BasicCarCache {
    private static final Map<String, BasicCar> basicCarMap = new HashMap<>();

    public static BasicCar getCar(String carName) {
        var cachedBasicCar = basicCarMap.get(carName);
        return cachedBasicCar.clone();
    }

    public static void loadCarCache() {
        var nano = new Nano("Green Nano");
        nano.price = 100000;
        basicCarMap.put("Green Nano", nano);

        var ford = new Ford("Ford Yellow");
        ford.price = 150000;
        basicCarMap.put("Ford Yellow", ford);
    }
}
