package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        boolean tre = a >= (b + c) || b >= (a + c) || c >= (a + b);
        return tre;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        boolean pif = a * a + b * b == c * c;
        return pif;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        boolean rav = a == b || a == c || c == b;
        return rav;
    }
}
