package sdet;
import java.util.Scanner;
public class Assignments1 {

    public static void main(String[] args) {

        // sorting elements using for loop
       int a[] = {50,20,40,10,100};
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i+1; j < a.length; j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Printing values for array");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // find missing number in array
        // number should be in range and should not have duplicates
        int a1[] = {1,4,5,3};
        int sum = 0;
        for(int i = 0; i < a1.length; i++)
        {
            sum = sum + a1[i];
        }
        int n = a1.length + 1;
        int expectedSum = n * (n + 1) / 2;
        System.out.println("Missing number is " + (expectedSum - sum));
        

    }
    
}
