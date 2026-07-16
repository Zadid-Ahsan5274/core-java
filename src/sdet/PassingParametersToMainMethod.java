package sdet;

public class PassingParametersToMainMethod {
    static void main(String[] args) {
        System.out.println(args.length);
        // System.out.println("testing...");
        for(String values:args)
        {
            System.out.println(values);
        }
    }
}
