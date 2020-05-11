package ru.progwards.java1.lessons.test;

public class Calculator {
    int result;
    public Calculator(){
        result = 0;
    }
    public int set(int num){
        result = num;
        return result;
    }
    public int add(int num){
        result += num;
        return result;
    }
    public int sub(int num){
        result -= num;
        return result;
    }
    public int getResult(){
        return result;
    }

    public static void main(String[] args) {

    }
}
