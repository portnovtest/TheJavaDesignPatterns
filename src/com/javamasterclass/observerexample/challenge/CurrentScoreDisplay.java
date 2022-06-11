package com.javamasterclass.observerexample.challenge;

public class CurrentScoreDisplay implements Observer {
    private int runs, wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    private void display() {
        System.out.printf("""
                Current Score Display:
                Runs: %d
                Wickets: %d
                Overs: %f
                                
                """, runs, wickets, overs);
    }
}
