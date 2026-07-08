package sdet;

public class DataConversionMethods {
    public static void main(String[] args){

        // String to int
        // Can not convert to int
        /* String s = "Welcome";
        int stringInt = Integer.parseInt(s); */

        String s = "12345";
        int stringInt = Integer.parseInt(s);
        System.out.println("String to int: " + stringInt);

        String s1 = "10";
        String s2 = "20";
        System.out.println(s1+s2);
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

        // String ---> double
        String s3 = "10.5";
        String s4 = "20.5";
        System.out.println(s3+s4);
        System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));

        String sb1 = "true";  // Other than "true" if any string is passed - will return false
        System.out.println(Boolean.parseBoolean(sb1));

        // int double bool char ---> String
        int a = 10;
        double b = 10.5;
        boolean c = true;
        char d = 'A';

        System.out.println(String.valueOf(a)+" "+String.valueOf(b)+" "+String.valueOf(c)+" "+String.valueOf(d));

        // String to char ---> not possible

        /*
            Wrapper Classes:
                int ---> Integer
                char ---> Character
                bool ---> Boolean
                double ---> Double
                float ---> Float
         */




    }
}