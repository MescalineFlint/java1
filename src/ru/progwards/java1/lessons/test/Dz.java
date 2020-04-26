package ru.progwards.java1.lessons.test;

public class Dz {
    static long factorial(long n) {
        long f = 1;
        for (int s = 1; s <= n; s ++) {
            if (n == 0)
                f = 1;
            else
                f = s * f;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(factorial(19));
    }
}
