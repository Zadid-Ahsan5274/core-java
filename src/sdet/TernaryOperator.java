package sdet;

public class TernaryOperator {
    static void main(String[] args) {
        int a = 100, b = 200;
        int x = a > b ? a : b;
        System.out.println(x);

        int y = (1==2)?150:250;
        System.out.println(y);

        int person_age = 30;
        String eligilble_for_vote = (person_age >= 18)?"Eligible":"Not Eligible";
        System.out.println(eligilble_for_vote);

        // Assignment: Swapping two numbers
        System.out.println("Before swapping: "+a+" and "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: "+a+" and "+b);
    }
}
