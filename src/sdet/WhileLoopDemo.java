package sdet;

public class WhileLoopDemo {

    public static void main(String[] args) {

        /* Example 1: Print numbers from 1 to 10
        int i = 1; // initialization
        while(i <= 10) // condition
        {
            System.out.print(i+" ");
            i++;  // increment
        }
        System.out.println(); // print a new line   

        // Example 2: Print "Hello" message 10 times
        int j = 0;
        while(j <= 10){
            System.out.print("Hello ");
            j++;
        }
        System.out.println(); // print a new line 
        
        // Example 3: Print even numbers from 1 to 10 : Approach 1
        int k = 2;
        while(k <= 10)
        {
            if(k%2==0) {
                System.out.print(k + " ");
                k += 2;  // increment
            }
        }
        System.out.println(); // print a new line

        // Example 3: Print even numbers from 1 to 10 : Approach 2
        int l = 1;
        while(l<=10)
        {
            if(l%2==0)
            {
                System.out.print(l + " ");
            }
            l++;  // increment
        }
        System.out.println(); // print a new line
        */

         // Example 4: 1.....10
        /*int i = 0;
        while(i<=10){
            if(i%2==0)
            {
                System.out.println(i+" is even");
            }
            else{
                System.out.println(i+" is odd");
            }
            i++;
        }*/

        // Example 5: Print 10.....1
        int k = 10;
        while(k >= 0){
            System.out.print(k + " ");
            k--;
        }
        System.out.println();
    } 
}
