package sdet;

public class IncrementOperator {
    static void main(String[] args) {
        int a = 10;
        System.out.println("Before increment: "+a);
        a++; // a = a + 1
        System.out.println("After increment: "+a);

        int b = 20;
        int res = b++;
        System.out.println(b);
        System.out.println(res);

        int m = 33;
        System.out.println("Before decrement: "+m);
        m--;
        System.out.println("After decrement: "+m);

        int k = 100;
        int res_res = k--;
        System.out.println(k + " "+res_res);
    }
}
