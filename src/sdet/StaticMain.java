package sdet;

public class StaticMain {
    void main()
    {
        // static methods can access static stuff directly (without object)
        System.out.println(StaticDemo.a);
        StaticDemo.method1();

        // System.out.println(b); ---> can not access because non-static variable
        // method2(); ---> can not access because non-static method

        StaticDemo sd = new StaticDemo();
        System.out.println(sd.b);
        sd.method2();
        sd.method();
    }
}
