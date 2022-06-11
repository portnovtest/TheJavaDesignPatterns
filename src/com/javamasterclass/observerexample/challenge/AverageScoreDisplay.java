package com.javamasterclass.observerexample.challenge;

public class AverageScoreDisplay implements Observer {
    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs / overs;
        this.predictedScore = (int) this.runRate * 50;
        display();
    }

    private void display() {
        System.out.printf("""
                Average Score Display:
                Run Rate: %f
                Predicted Score: %d
                                
                """, runRate, predictedScore);
    }
}
