package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int n1 = number / 100;
        int n2 = number % 100 / 10;
        int n3 = number % 10;
        int n4 = n2 * 10 + n3 *100 + n1;
        return n4;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
    }
}
