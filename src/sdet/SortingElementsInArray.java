package sdet;

import java.util.Arrays;

public class SortingElementsInArray {
    public static void main(String[] args) {
        
        int a[] = {100,600,300,400,200};
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(a));
        /* for(int value:a)
        {
            System.out.print(value + " ");
        }*/
        Arrays.sort(a); // sort elements in array
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(a));

    } 
}
