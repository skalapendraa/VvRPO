package com.velichko.itd21;

/**
 * Результаты сессии студента.
 */
public class SessionResult {
    private double averageScore;
    private boolean passedOnTime;

    public SessionResult(double averageScore, boolean passedOnTime) {
        this.averageScore = averageScore;
        this.passedOnTime = passedOnTime;
    }
    
    public double getAverageScore() { return averageScore; }
    public boolean isPassedOnTime() { return passedOnTime; }
}