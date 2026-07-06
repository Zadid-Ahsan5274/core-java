package sdet;

public class TypeCastingObjects3 {

    public static void main(String[] args) {

        // Example 1
        Object object = new String("Welcome");
        StringBuffer sb = (StringBuffer) object; // Rule1 - yes    Rule2 - yes    Rule3 - no

        // Example 2
        String str = new String("Welcome");
        StringBuffer sb1 = (StringBuffer) str; // Rule1 - Failed

        // Example 3
        Object object1 = new String("Welcome");
        StringBuffer sb2 = (StringBuffer) object1; // Rule1 - yes    Rule2 - yes    Rule3 - Failed

        // Example 4
        Object object2 = new String("Welcome");
        StringBuffer sb3 = (String) object2; // Rule1 - Passed    Rule2 - Failed

        // Example 5
        String s = new String("Welcome");
        StringBuffer sb4 = (String) s; // Rule1 - Passed    Rule2 - Failed

        // Example 6
        Object obj = new String("Welcome");
        StringBuffer sb5 = (StringBuffer) obj; // Rule1 - Passed    Rule2 - Passed    Rule3 - Failed

        // Example 7
        Object obj1 = new String("Welcome");
        String strr = (String) obj1; // Rule1 - Passed    Rule2 - Passed    Rule3 - Passed

        System.out.println(strr);
    }
}