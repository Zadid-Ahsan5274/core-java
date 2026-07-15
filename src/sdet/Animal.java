package sdet;

class Animal 
{
    String color = "White"; 
    
    void eat()
    {
        System.out.println("eating...");
    }
}

class Dog extends Animal
{
    String color = "Black";

    void displayColor()
    {
        System.out.println(color);
    }
}
