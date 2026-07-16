package sdet;

public class StaticDemo {
    static int a = 10; // static variable
    int b = 20; // non static variable

    // static method
    static void method1()
    {
        System.out.println("This is static method 'method1'");
    }

    // non-static method
    void method2()
    {
        System.out.println("This is non-static method 'method2'");
    }

    // non-static method
    void method()
    {
        System.out.println(a);
        System.out.println(b);
        method1();
        method2();
    }

    /* static void main(String[] args) {
        // static methods can access static stuff directly (without object)
        System.out.println(a);
        method1();

        // System.out.println(b); ---> can not access because non-static variable
        // method2(); ---> can not access because non-static method

        StaticDemo sd = new StaticDemo();
        System.out.println(sd.b);
        sd.method2();
    } */
}
