package com.velichko.itd21;

/**
 * Абстрактный базовый класс студента.
 */
public abstract class Student {
    protected String name;
    protected SessionResult sessionResult; 

    public Student(String name, SessionResult sessionResult) {
        this.name = name;
        this.sessionResult = sessionResult;
    }

    public abstract double calculateScholarship(double base);
    public abstract boolean isPaid();
    
    public String getName() { return name; }
    public SessionResult getSessionResult() { return sessionResult; }
}