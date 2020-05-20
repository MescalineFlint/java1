package ru.progwards.java1.lessons.test;

public class SumMassiv {
    public static int sumArrayItems(int[] a) {
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ += a[i];
        }
        return summ;
    }

    public static void main(String[] args) {
        int[] massiv = {2, 4, 6, 8, 10};
        sumArrayItems(massiv);

    }
}
