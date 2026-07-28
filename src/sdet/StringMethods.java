package sdet;

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
        
    }

}
