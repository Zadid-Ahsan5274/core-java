package sdet;

public class DoWhileLoop {
    static void main(String[] args) {
        // Print 1.....10 numbers
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <=10);

        // Print 10.....1 numbers
        int k = 10;
        do{
            System.out.println(k);
            k--;
        }while(k>=0);
    }
}
