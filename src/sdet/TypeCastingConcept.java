package sdet;

public class TypeCastingConcept {

    static void main(String[] args) {

        // upcasting automatic ---> smaller to larger
        int intValue = 100;
        long longValue = intValue;
        System.out.println(longValue);

        float floatValue = 10.5F;
        double doubleValue = floatValue;


        // downcasting manually ---> smaller to larger
        long longValue1 = 10000;
        int intValue1 = (int)longValue1;
        System.out.println(intValue1);

        double doubleValue1 = 125.55;
        float floatValue1 = (float) doubleValue1;

        // Example 1
        int i = 100;
        double d = i; // upcasting
        System.out.println(d);

        // Example 2
        double d1 = 10.5;
        int i1 = (int) d1;   // downcasting
        System.out.println(d1 + " "+i1);

    }
}
