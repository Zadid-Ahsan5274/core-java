package sdet;

public class TwoDimensionalArray {
    static void main(String[] args) {
        // declaring array - approach 1
        int a[][] = new int[3][2];

        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;

        // declaring array - approach 2
        int b[][] = {
                {100,200},
                {300,400},
                {500,600},
                {700,800},
                {900,1000}
        };

        // find size of an array
        System.out.println("Length of rows: "+a.length+" "+ b.length);
        System.out.println("Length of columns: "+a[0].length+" "+b[0].length);

        // read single value from an array
        System.out.println(a[2][1]);

        // normal for loop
        for(int r = 0; r <= 2; r++)
        {
            for(int c = 0; c <= 1; c++)
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
        // normal for loop
        for(int r = 0; r < b.length; r++){
            for(int c = 0; c < b[r].length;c++){
                System.out.print(b[r][c]+" ");;
            }
            System.out.println();
        }
        System.out.println("------------------Enhenaced for loop----------------------");
        for(int arr[]:a){
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        for(int arr[]:b){
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
