package sdet;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        String s = "Welcome";
        // String str = new String("Welcome");
        System.out.println(s);
        // length() -> returns length of a string (number of characters)
        int length = s.length();
        System.out.println(length);
        System.out.println("welcome to java".length());

        // concat - join strings
        String str1 = "Welcome";
        String str2 = " To the hell";
        String str3 = " from mother earth";
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));
        System.out.println(str1+str2+str3);
        System.out.println(str1.concat(str2).concat(str3));
        System.out.println(str1.concat(str2+str3));
        System.out.println("Welcome"+"to java");
        System.out.println("Welcome".concat("to java"));
        System.out.println("Welcome".concat("to java").concat("from mother earth"));

        // trim() - remove spaces from left and right side
        s = "       welcome        ";
        System.out.println("Before trimming:");
        System.out.println(s+" "+s.length());
        System.out.println(s.trim());
        System.out.println("After trimming:");
        System.out.println(s.trim()+" "+s.trim().length());

        // charAt() - returns a character from a string based on index
        // index starts from 0
        s = "welcome";
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(0));

        // contains() - returns true/false
        System.out.println(s.contains("wel"));
        System.out.println(s.contains("welc"));
        System.out.println(s.contains("come"));
        System.out.println(s.contains("WEL"));
        System.out.println(s.contains("COME"));
        System.out.println(s.contains("welme"));

        /*
        equals() equalsIgnoreCase()   -> compare strings
        */
       String s1 = "welcome";
       String s2 = "welcome";
       System.out.println(s1==s2);
       System.out.println(s1.equals(s2));
       System.out.println(s1.equals("welcome"));
       System.out.println(s1.equalsIgnoreCase("Welcome"));

       // replace() -replace single/multiple(sequence) of characters in a string
       s = "Welcome to Selenium Java Selenium C# Selenium Python";
        System.out.println(s.replace('e','X'));
        System.out.println(s.replace("Selenium","Playwright"));

        // substring() - extract substring from the main string
        // starting index - 0
        // ending index - 1
        s = "Selenium";
        System.out.println(s.substring(1,5));
        System.out.println(s.substring(0,3));

        // toUpperCase() - convert string to uppercase
        // toLowerCase() - convert string to lowercase
        System.out.println(s.toUpperCase());

        // split() - split a string based on a delimiter and return an array of strings
        s = "abcdefghijk@gmail.com";
        String a[] = s.split("@");
        System.out.println(s.substring(0,3));
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(Arrays.toString(a));

        // example 1
        String amount = "$15, 20, 55";
        System.out.println(amount.replace("$"," "));
        System.out.println(amount.replace("$","").replace(",",""));

        // example 2
        s = "abc,123@xyz";
        String [] arr1 = s.split(",");
        System.out.println(Arrays.toString(arr1));
        // String arr2 = str[1].split("@");
        String [] arr2 = arr1[1].split("@");
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[0]);

        System.out.println(arr1[0] + " " + arr2[0] + " " + arr2[1]);

        // example 3
        s = "abc 123";
        String [] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

        // *  ^  %  &  (   ) - you can not use as delimiters
        // example 4
        String name = "John Kenedy";
        System.out.println(name.contains("john"));
        System.out.println(name.replace("J", "j").contains("john"));
        System.out.println(name.toLowerCase().contains("john"));
    }

}
