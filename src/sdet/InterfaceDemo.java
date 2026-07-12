package sdet;

interface Shape{
    int length = 10; // final and static
    int width = 20;  // final and static

    void circle(); // abstract method

    default void square(){
        System.out.println("This is a square...");
    }

    static void rectangle(){
        System.out.println("This is a rectangle...");
    }
}

public class InterfaceDemo implements Shape{

    public void circle(){
        System.out.println("This is circle - abstract method");
    }

    public static void main(String[] args) {
        // Scenario 1
        // InterfaceDemo obj = new InterfaceDemo();
        // obj.circle(); // abstract
        // obj.square(); // default
        // Shape.rectangle(); // static method can be directly accessed from interface

        // Scenario 2
        Shape shape = new InterfaceDemo();
        shape.circle(); // abstract
        shape.square(); // default
        Shape.rectangle(); // static method can be directly accessed from interface

        
    }
}
