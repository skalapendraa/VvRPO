package com.velichko.itd21;

/**
 * Студент бюджетной формы обучения.
 */
public class BudgetStudent extends Student {
    public BudgetStudent(String name, SessionResult sessionResult) {
        super(name, sessionResult);
    }

    @Override
    public double calculateScholarship(double base) {
        if (!sessionResult.isPassedOnTime() || sessionResult.getAverageScore() < 5.0) return 0;
        if (sessionResult.getAverageScore() < 7.0) return base;
        if (sessionResult.getAverageScore() < 8.0) return base * 1.25; 
        return base * 1.5;
    }

    @Override
    public boolean isPaid() { return false; }
}