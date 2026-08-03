package sdet;

public class SingleDimensionalArray {
    void main()
    {
        // declaring array - approach 1
        int a[] = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;

        // declaring array - approach 2
        int ar[] = {100,200,300,400,500,600,700};

        // find length of an array
        System.out.println("array length: "+a.length+" and "+ar.length);

        // read single value from an array
        System.out.println("3rd element: "+a[2]);  // here 2 is index

        // reading all values from the array
        // Normal for loop
        /* for(int i =0; i < ar.length; i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        for(int i =0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(); */

        // Enhanced for loop/for...each loop
        for(int x : a)
        {
            System.out.println(x);
        }
        for(int x : ar)
        {
            System.out.println(x);
        }
    }
}
