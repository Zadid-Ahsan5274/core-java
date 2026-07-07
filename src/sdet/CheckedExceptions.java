package sdet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("Program started");
        System.out.println("Program in progress...");

        Thread.sleep(5000);
        Thread.sleep(5000);
        Thread.sleep(5000);
        
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"src\\sdet\\Text.txt");  

        /* 
        try{
            Thread.sleep(5000);
        } catch(InterruptedException ex){

        }
        */
        System.out.println("Program completed");
        System.out.println("Program ended");
        
    }
}
