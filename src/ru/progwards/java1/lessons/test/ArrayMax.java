package ru.progwards.java1.lessons.test;

import java.util.Arrays;

public class ArrayMax {
    public int arrayMax(int[] a) {
        Arrays.sort(a);
        if (a.length == 0)
            return 0;
        return a[a.length - 1];
    }
}
