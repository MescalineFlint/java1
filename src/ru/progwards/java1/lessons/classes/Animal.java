package ru.progwards.java1.lessons.classes;

public class Animal {
    String type1, type2;
    double weight;
    enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK,
    }
    enum FoodKind{
        UNKNOWN,
        HAY,
        CORN,
    }
    public Animal(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public double getFoodCoeff(){
        return 0.02;
    }
    public double calculateFoodWeight(){
        return weight * getFoodCoeff();
    }
    public AnimalKind getKind(){
        AnimalKind type1 = AnimalKind.ANIMAL;
            return type1;
    }
    public FoodKind getFoodKind(){
        FoodKind type2 = FoodKind.UNKNOWN;
        return type2;
    }
    public String toStringFull(){
        return ("I am " + getKind() + ", eat " + getFoodKind() + calculateFoodWeight());
    }
    public String toString(){
        return ("I am " + getKind() + ", eat " + getFoodKind());
    }
}
class Cow extends Animal{
    public Cow (double weight) {
        super(weight);
    }
    @Override
    public double getFoodCoeff(){
        return 0.05;
    }
    @Override
    public AnimalKind getKind(){
        AnimalKind type1 = AnimalKind.COW;
        return type1;
    }
    @Override
    public FoodKind getFoodKind(){
        FoodKind type2 = FoodKind.HAY;
        return type2;
    }
}
class Hamster extends Animal{
    public Hamster (double weight) {
        super(weight);
    }
    @Override
    public double getFoodCoeff(){
        return 0.03;
    }
    @Override
    public AnimalKind getKind(){
        AnimalKind type1 = AnimalKind.HAMSTER;
        return type1;
    }
    @Override
    public FoodKind getFoodKind(){
        FoodKind type2 = FoodKind.CORN;
        return type2;
    }
}
class Duck extends Animal{
    public Duck (double weight) {
        super(weight);
    }
    @Override
    public double getFoodCoeff(){
        return 0.04;
    }
    @Override
    public AnimalKind getKind(){
        AnimalKind type1 = AnimalKind.DUCK;
        return type1;
    }
    @Override
    public FoodKind getFoodKind(){
        FoodKind type2 = FoodKind.CORN;
        return type2;
    }

    public static void main(String[] args) {

    }
}

