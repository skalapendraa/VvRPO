package com.velichko.itd21;

/**
 * Студент платной формы обучения.
 */
public class PaidStudent extends Student {
    public PaidStudent(String name, SessionResult sessionResult) {
        super(name, sessionResult);
    }

    @Override
    public double calculateScholarship(double base) {
        return 0; // платники не получают стипендию
    }

    @Override
    public boolean isPaid() { return true; }
}