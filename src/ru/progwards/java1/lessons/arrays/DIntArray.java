package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {

    private int a[];
    int lenght;

    DIntArray (){
        lenght = 0;
        a = new int[0];
    }



    public void add(int num){


        int[] b = Arrays.copyOf(a, a.length + 1);
        b[b.length -1] = num;
        lenght++;
        a = b;



    }
    public void atInsert(int pos, int num){

        int[] b = new int[lenght + 1];
        b[pos] = num;
        for (int i = 0; i < pos; i++) {
            b[i] = a[i];
        }
        for (int i = pos; i < a.length; i++){
                b[i + 1] = a[i];
        }
        lenght++;
        a = b;

    }
    public void atDelete(int pos){
        int[] b = new int[lenght - 1];
        for (int i = 0; i < pos; i++) {
            b[i] = a[i];
        }
        for (int i = pos + 1; i < a.length; i++){
            b[i - 1] = a[i];
        }
        lenght--;
        a = b;
    }
    public int at(int pos){
        return a[pos];
    }

    public static void main(String[] args) {
       DIntArray a = new DIntArray();
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(8);
        a.atDelete(2);
        a.atInsert(2,10);
        System.out.println(a.at(2));

    }
}


