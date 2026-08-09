package sdet;

public class WhileLoopDemo {

    public static void main(String[] args) {

        // Example 1: Print numbers from 1 to 10
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
        
        // Example 3: Print even numbers from 1 to 10
        int k = 0;
        while(k <= 10)
        {
            if(k%2==0)
            {
               System.out.print(k+" ");
               k++;  // increment 
            }
            System.out.println(); // print a new line 
        }
    } 
}
