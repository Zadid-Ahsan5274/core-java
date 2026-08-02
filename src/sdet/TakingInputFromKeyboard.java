package sdet;

import java.util.Scanner;

public class TakingInputFromKeyboard {
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in);
        /*System.out.print("Enter a number: ");
        int number = user_input.nextInt();
        System.out.println("You entered: " + number);

        double d = user_input.nextDouble();
        System.out.println("You entered: " + d);*/

        System.out.print("Enter your City: ");
        String city = user_input.nextLine();
        System.out.println("Your city name is: "+city);
        user_input.close();

    }
}
