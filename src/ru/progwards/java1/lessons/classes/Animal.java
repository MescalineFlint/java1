package ru.progwards.java1.lessons.classes;

public class Animal {
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
    public double Animal(double weight){
        double w = weight;
        return w;
    }
    public AnimalKind getKind(){
        AnimalKind type1 = AnimalKind.ANIMAL;
            return type1;
    }
    public FoodKind getFoodKind(){
        FoodKind type2 = FoodKind.UNKNOWN;
        return type2;
    }
    public String toString(){
        System.out.println("I am" + getKind() + ", eat " + getFoodKind());
        return toString();
    }
}
class Cow extends Animal{
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

