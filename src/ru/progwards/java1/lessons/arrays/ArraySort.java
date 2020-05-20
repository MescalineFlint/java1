package ru.progwards.java1.lessons.arrays;

public class ArraySort {
    public static void sort(int[] a){

        for (int i = 0; i <a.length; i++){

            for (int j = 1; j <a.length; j++) {

                if (a[i] > a[j]) {

                    int z = a[i];
                    a[i] = a[j];
                    a[j] = z;
                }
            }
        }
    }
}
