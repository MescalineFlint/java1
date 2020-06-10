package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){

        int sum = value & 1;
        



        for (int y = 1; y < 8 ; y ++) {
            int x = value << y;

            int z = value & x;

            sum += z;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumBits((byte) 1001000));
    }
}
