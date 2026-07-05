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
        int intValue1 = longValue1;




    }
}
