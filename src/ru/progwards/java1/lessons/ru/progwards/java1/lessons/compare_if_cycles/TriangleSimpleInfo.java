package ru.progwards.java1.lessons.ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;

    }
}
