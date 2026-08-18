package sdet;

public class DataTypesDemo {
    static void main(String[] args) {
        int a = 100, b = 200;
        System.out.println("The value of a is "+a+" and the value of b is "+b);
        System.out.println(a+b);

        byte b1 = 125;
        System.out.println(b1);
        short sh = 3535;
        System.out.println(sh);
        long l = 1234567899L;
        System.out.println(l);

        // Decimal numbers - float, double
        float item_price = 15.5F;
        double dbl = 1234.4343412;
        System.out.println(item_price+" "+dbl);
        char grade = 'A';
        System.out.println(grade);
        String name = "John";
        System.out.println(name);
        // char ch = 'ABC'; //invalid
       // String ch = 'ABC'; //invalid
       // String ch = 'A'; //invalid
        String ch = "A"; // valid

        boolean bl = false;
        System.out.println(bl);

        // boolean b1 = "true";  // not valid
        // boolean b2 = "false";  // not valid

        String bll = "true";
    }
}
