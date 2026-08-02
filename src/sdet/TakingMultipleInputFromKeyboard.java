package sdet;

import java.util.Scanner;

public class TakingMultipleInputFromKeyboard {

    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in);
        /*System.out.print("Enter first number: ");
        int first_number = user_input.nextInt();
        System.out.print("Enter second number: ");
        int second_number = user_input.nextInt();
        System.out.println("The sum of two numbers is: " + (first_number + second_number));*/

        System.out.print("Enter your name: ");
        String name = user_input.nextLine();
        System.out.println("Your name is: "+name);

        System.out.print("Enter your age: ");
        int age = user_input.nextInt();
        System.out.println("Your age is: "+age);

        System.out.print("Enter unknown value: ");
        Object unknown = user_input.next();
        System.out.println("Unknown value is: "+unknown);



    }
}
