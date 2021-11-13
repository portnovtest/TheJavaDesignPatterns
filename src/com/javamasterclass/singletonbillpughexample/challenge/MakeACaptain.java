package com.javamasterclass.singletonbillpughexample.challenge;

public class MakeACaptain {
    private MakeACaptain() {
    }

    private static class SingletonHelper {
        // nested class is referenced after getCaptain() is called
        private static final MakeACaptain captain = new MakeACaptain();
    }

    public static MakeACaptain getInstance() {
        return SingletonHelper.captain;
    }

    public static void main(String[] args) {
        System.out.print("""
                ***Singleton Pattern Demo***
                Trying to make a captain for our team
                """);
        var c1 = MakeACaptain.getInstance();
        System.out.println("Trying to make another captain for our team");
        var c2 = MakeACaptain.getInstance();

        if (c1 == c2) {
            System.out.println("c1 and c2 are the same instance");
        }
    }
}
