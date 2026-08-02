package sdet;

import java.util.Arrays;

public class ReverseAnyArray {
    public static void main(String[] args) {
        
        int a[] = {100,200,300,400,500};
        System.out.println("Array before reversing: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Array after reversing: ");
        for(int i = a.length-1; i >= 0; i--)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}
