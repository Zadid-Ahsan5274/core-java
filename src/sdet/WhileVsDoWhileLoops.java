package sdet;

public class WhileVsDoWhileLoops {
    static void main(String[] args) {
        int i = 1;
        while(i <= 5){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        int j = 10;
        do{
            System.out.print(j + " ");
            j++;
        }while(j <= 5);
        System.out.println();

    }
}
