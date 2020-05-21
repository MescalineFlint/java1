package ru.progwards.java1.lessons.arrays;

public class ArraySort {
    public static void sort(int[] a){

        for (int i = 0; i <= a.length - 1; i++){
            for (int j = 1; j <= a.length - 1; j++) {

                if (a[i] > a[j]){

                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;

                }
            }
        }
    }
}
