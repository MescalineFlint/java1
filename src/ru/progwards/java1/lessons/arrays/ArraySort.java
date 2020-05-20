package ru.progwards.java1.lessons.arrays;

public class ArraySort {
    public static void sort(int[] a){

        for (int i = 0; i <a.length; i++){

            if (a[i] > a[i+1]){

                int z = a[i];
                a[i] = a[i + 1];
                a[i + 1] = z;

            }

            for (int j = 1; j <a.length; j++) {

                if (a[j] > a[j + 1]) {

                    int q = a[j];
                    a[j] = a[j + 1];
                    a[i] = q;

                }
            }
        }
    }
}
