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

    default void triangle(){
        System.out.println("This is a triangle...");
    }
}

public class InterfaceDemo implements Shape{

     int x = 100, y = 200;

    public void circle(){
        System.out.println("This is circle - abstract method");
    }

   

    public static void main(String[] args) {
        // Scenario 1
        InterfaceDemo obj = new InterfaceDemo();
        obj.circle(); // abstract
        obj.square(); // default
        Shape.rectangle(); // static method can be directly accessed from interface
        obj.triangle();

        // Scenario 2
        Shape shape = new InterfaceDemo();
        shape.circle(); // abstract
        shape.square(); // default
        Shape.rectangle(); // static method can be directly accessed from interface
        // shape.triangle(); // we can not access
        System.out.println(Shape.length + " "+Shape.width); // accessing static variables directly with class name
        System.out.println(obj.x+" "+obj.y);
        
    }


}
