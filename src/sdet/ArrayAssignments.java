package sdet;
import java.util.Scanner;
public class ArrayAssignments {
    static void main(String[] args) {
        // Find sum of elements of an array
        int a[] = {1,2,3,4,5,6};
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of array elements: "+sum);

        // Find number of even and odd numbers in array
        int arr[] = {1,2,3,4,5,6,27};
        int counter_odd = 0;
        int counter_even = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) counter_even++;
            else counter_odd++;
        }
        System.out.println("Number of even numbers: "+counter_even+" and odd numbers: "+counter_odd);
        
        // Check prime number or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

}
