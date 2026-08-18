package sdet;

public class MultipleStatements {
    static void main(String[] args) {
        if(false)
        {
            System.out.println(1);
        }
        else {
            System.out.println(2);
        }

        if(1==2)
        {
            System.out.println(1);
        }
        else {
            System.out.println(2);
        }

        if(true)
        {
            if(true)
            {
                System.out.println("abc");
            }
            else {
                System.out.println("xyz");
            }
        }
        else {
            System.out.println(123);
        }
    }
}
