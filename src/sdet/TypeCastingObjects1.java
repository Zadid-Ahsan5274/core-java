package sdet;

class Parent
{
    String name = "John";

    void method1(){
        System.out.println("This is method1 from class Parent...");
    }
}

class Child extends Parent
{
    int id = 101;

    void method2(){
        System.out.println("This is method2 from class Child...");
    }
}

public class TypeCastingObjects1 {
    static void main(String[] args) {
        /* Child child = new Child();
        System.out.println(child.name); // Parent
        child.method1(); // Parent
        System.out.println(child.id); // Child
        child.method2(); */

        /*
        Parent parent = new Child();  // upcasting
        System.out.println(parent.name); // Parent
        parent.method1(); // Parent
        System.out.println(parent.id); // we can not access
        parent.method2(); // we can not access
         */

        Parent p = new Parent();
        Child c = (Child) p;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method1();
        c.method2();
    }
}
