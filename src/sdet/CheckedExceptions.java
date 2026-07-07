package sdet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("Program started");
        System.out.println("Program in progress...");

        Thread.sleep(5000);
        // Thread.sleep(5000);
       // Thread.sleep(5000);
        
        File file = new File(System.getProperty("user.dir")+File.separator+"Text.txt");
        if(file.exists()){
            System.out.println("File exists at location: "+file.getAbsolutePath());
            FileInputStream fis = new FileInputStream(file);
        }
        else {
            System.out.println("File not found!");
        }

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
