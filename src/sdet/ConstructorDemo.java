package sdet;

public class ConstructorDemo {
    int x,y;

    // default constructor
    ConstructorDemo()
    {
        x = 100;
        y = 200;
    }

    // parameterized constructor
    ConstructorDemo(int a, int b)
    {
        x = a;
        y = b;
    }

    void sum()
    {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo(); // default constructor
        ConstructorDemo cd1 = new ConstructorDemo(10,20); // parameterized constructor
        cd.sum();
        cd1.sum();
    }
}
