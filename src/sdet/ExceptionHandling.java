package sdet;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        
        /*  
        System.out.println("Program started");
        Scanner sc = new Scanner(System.in);

        // Example 1
        /* System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(100/num);     // ArithmeticException
        */

        // Example 2
        /*
        int a[] = new int[5];
        System.out.print("Enter the position from 0 - 4: ");
        int pos = sc.nextInt();

        System.out.print("Enter a value: ");
        int value = sc.nextInt();

        a[pos] = value;     
        System.out.println(a[pos]);  // ArrayIndexOutOfBoundsException
        */

        // Example 3
        /* String s = "Welcome";
        int num = Integer.parseInt(s);
        System.out.println(num);  // NumberFormatException
        */

        // Example 4
        /* 
        String s = null;
        System.out.println(s.length()); // NullPointerException

        System.out.println("Program completed");
        System.out.println("Program ended"); 

        */

        System.out.println("Program started");
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        try{
            System.out.println(100/num); 
        } catch(ArithmeticException e){
            System.out.println("Invalid input provided...");
        }


        System.out.println("Program completed");
        System.out.println("Program ended");

        // Multiple catch blocks
        System.out.println("Program started");
        String s = null;

        try{
            System.out.println(s.length()); 
        } catch(ArithmeticException e){
            System.out.println("Handled ArithmeticException");
            System.out.println(e.getMessage());
        } catch(NullPointerException e){
            System.out.println("Handled NullPointerException");
            System.out.println(e.getMessage());
        } catch(NumberFormatException e){
            System.out.println("Handled NumberFormatException");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Handled Exception");
            System.out.println(e.getMessage());
        }
        
        System.out.println("Program completed");
        System.out.println("Program ended");
        */

        // Finally block
        String s = null;

        try{
            System.out.println(s.length());
        } catch(NullPointerException e){
            System.out.println("Catch block - Handled Exception");
            System.out.println(e.getMessage());
        } finally{
            System.out.println("You entered in a finally block");
        }

        System.out.println("Program completed");
        System.out.println("Program ended");

    }
}
