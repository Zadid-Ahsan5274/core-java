package sdet;

public class PositiveOrNegativeNumber {
    static void main(String[] args) {
        int num = 15;
        if(num > 0)
        {
            System.out.println(num + " is a positive number");
        }
        else if(num < 0)
        {
            System.out.println(num + " is a negative number");
        }
        else {
            System.out.println(num + " is Zero");
        }
    }
}
