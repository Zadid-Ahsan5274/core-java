package sdet;

public class OperatorsDemo {
    static void main(String[] args) {
        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println(a + " + "+b+" = "+(a+b));
        System.out.println(a + " - "+b+" = "+(a-b));
        System.out.println(a + " * "+b+" = "+(a*b));
        System.out.println(a + " / "+b+" = "+(a/b));
        System.out.println(a + " % "+b+" = "+(a%b));

        // Relational Operators
        System.out.println(a + " < "+b+" = "+(a<b));
        System.out.println(a + " <= "+b+" = "+(a<=b));
        System.out.println(a + " > "+b+" = "+(a>b));
        System.out.println(a + " >= "+b+" = "+(a>=b));

        b = 20;
        System.out.println(a + " <= "+b+" = "+(a<=b));
        System.out.println(a + " >= "+b+" = "+(a>=b));
        System.out.println(a + " == "+b+" = "+(a==b));
        System.out.println(a + " != "+b+" = "+(a!=b));
        boolean res = a>b;
        System.out.println(res);

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!x +" "+!y);

        System.out.println(10>20);
        System.out.println(20>10);
        System.out.println((10>20)&&(20>10));
        System.out.println((10>20)||(20>10));
    }
}
