package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a, b, z;
    public ComplexNum(int a, int b){
        ;
    }
    public String toString(){

        return (a + b +"i");
    }
    public ComplexNum add(ComplexNum num){

        return new ComplexNum(this.a + num.a, this.b + num.b);

    }
    public ComplexNum sub(ComplexNum num){

        return new ComplexNum(this.a - num.a, this.b - num.b);
    }
    public ComplexNum mul(ComplexNum num) {

        return new ComplexNum(this.a * num.a, this.b * num.b);
    }
    public ComplexNum div(ComplexNum num){

        return new ComplexNum((this.a * num.a) + (this.b * num.b) / (num.a * num.a + num.b * num.b), ((this.b * num.a) - (this.a * num.b)) / (num.a * num.a + num.b * num.b));
    }
}
