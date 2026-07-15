package sdet;

class ABC 
{
    void method1(int a)
    {
        System.out.println("Message from 'method1': "+a);
    }
    void method2(int b)
    {
        System.out.println("Message from 'method2': "+b);
    }
}

class XYZ extends ABC 
{
    // overriding method1
    void method1(int a)
    {
        System.out.println("'method1' method overriden: "+(a*a));
    }

    // overloading method2
    void method2(int a, int b)
    {
        System.out.println("'method2' method overloaded: "+(a+b));
    }
}

public class OverloadingVsOverriding {

    public static void main(String[] args) {
        XYZ xyzObj = new XYZ();
        xyzObj.method1(10);
        xyzObj.method2(20);
        xyzObj.method2(100,200);
    }  
}
