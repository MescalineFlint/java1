package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare(Double r) {
        return (4 * 3.14 * (r * r));
    }

    public static Double earthSquare() {
        double e = sphereSquare(6371.2);
        return e;
    }

    public static Double mercurySquare() {
        double m = sphereSquare(2439.7);
        return m;
    }

    public static Double jupiterSquare() {
        double j = sphereSquare(71492.0);
        return j;
    }

    public static Double earthVsMercury() {
        double e = sphereSquare(6371.2);
        double m = sphereSquare(2439.7);
        return (e / m);
    }

    public static Double earthVsJupiter() {
        double e = sphereSquare(6371.2);
        double j = sphereSquare(71492.0);
        return (e / j);
    }
}
