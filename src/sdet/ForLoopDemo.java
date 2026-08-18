package sdet;

public class ForLoopDemo {

    public static void main(String[] args) {
        // print 1...10 numbers
        for(int i = 1; i <= 10; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        // print 1...10 even numbers
        for(int i = 2; i <= 10; i++){
            if(i % 2 == 0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        // print 1...10 even and odd numbers
        for(int i = 2; i <= 10; i++){
            if(i % 2 == 0)
            {
                System.out.println(i+" is even number");
            }
            else {
                System.out.println(i+" is odd number");
            }
        }

        // print 10...1 descending
        for(int i = 10; i >= 1; i--){
            System.out.print(i+" ");
        }
        System.out.println();



    }
}