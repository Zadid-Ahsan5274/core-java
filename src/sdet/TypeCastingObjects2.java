package sdet;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}

public class TypeCastingObjects2 {
    public static void main(String[] args){
        // Rule 1: Conversion is valid or not
        // The type of d and c must have some relationship (either parent-child or child-parent)
        Animal an = new Dog();
        Cat ct = (Cat) an; // valid as per rule 1
        Dog dg = new Dog();
       // Cat ct1 = (Cat) dg; // invalid as per rule 1

        // Rule 2: Assignment is valid or not
        // 'C' must be either same or child of 'A'

        Animal a = new Dog();
        Cat ctt = (Cat) a; // valid as per rule 2

        Animal ann = new Dog();
        // Cat cttt = (Dog) ann; // invalid as per rule 2

        // Rule 3: The underlying object type 'd' must be either same or child of 'C'
        Animal annn = new Dog();
        Cat ctttn = (Cat) annn; // invalid as per rule 3

        // Rule 1, Rule 2, Rule 3
        Animal animal = new Dog();
        Dog dog = (Dog) animal; // Rule1 - yes    Rule2 - yes    Rule3 - yes


    }
}