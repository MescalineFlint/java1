package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {

    private int a[];


    public void add(int num){

        int[] b = Arrays.copyOf(a, a.length + 1);
        b[a.length -1] = num;



    }
    public void atInsert(int pos, int num){

        int[] b1 = Arrays.copyOf(a, a.length + 1);
        b1[pos] = num;

    }
    public void atDelete(int pos){
        int x = a.length - 1;
        a[a.length - 1] = a[pos];
        a[pos] = x;
        int[] b2 = Arrays.copyOf(a, a.length - 1);
    }
    public int at(int pos){
        return a[pos];
    }

    public static void main(String[] args) {

        int a[] = {2,4,6,7,9,23};


    }
}


