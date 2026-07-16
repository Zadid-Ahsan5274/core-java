package sdet;

public class Adder {
    int a = 10, b = 20;

    void sum()
    {
        System.out.println(a+b);
    }

    void sum(int x, int y)
    {
        System.out.println(x+y);  // 2
    }

    void sum(int x, double y)
    {
        System.out.println(x+y);  // 3
    }

    void sum(double x, int y)
    {
        System.out.println(x+y);  // 4
    }

    void sum(int a, int b, int c)
    {
        System.out.println(a+b+c); // 5
    }
}
