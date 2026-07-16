package sdet;

class A
{
    int a = 100;

    void display()
    {
        System.out.println(a);
    }
}

class B extends A
{
    int b = 200;

    void show()
    {
        System.out.println(b);
    }
}

class C extends B
{
    // int c = 350;

    int c;

    void print()
    {
        System.out.println(c);
    }
}

public class InheritenceTypes {
    static void main(String[] args) {
        /* B bobj = new B();
        System.out.println(bobj.a);

        bobj.display();
        bobj.show(); */

        C cobj = new C();
        cobj.a = 150;
        cobj.b = 250;
        cobj.c = 450;

        cobj.display();
        cobj.print();
        cobj.show();
    }
}
