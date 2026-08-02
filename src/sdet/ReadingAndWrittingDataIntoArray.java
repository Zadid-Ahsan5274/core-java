package sdet;

import java.util.Scanner;

public class ReadingAndWrittingDataIntoArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter values for array");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print("Enter value for index " + i + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Printing values for array");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
