package sdet;

class Animal1 
{
    String color = "White"; 
    
    void eat()
    {
        System.out.println("eating...");
    }
}

class Dog1 extends Animal1
{
    String color = "Black";

    void displayColor()
    {
        System.out.println(color);
    }
}
