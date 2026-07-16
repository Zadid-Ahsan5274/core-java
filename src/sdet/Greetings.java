package sdet;

public class Greetings
{
    // No parameters
    // No return value
    // 1.
    void m1()
    {
        System.out.println("Method m1 with no parameters and no return value...");
    }

    // No parameters
    // Return value: String
    // 2.
    String m2()
    {
        return "Hello how are you?";
    }

    // Takes parameters
    // No return value
    // 3.
    void m3(String name)
    {
        System.out.println("Hello there "+name);
    }

    // Takes parameters
    // Returns value: String
    // 4.
    String m4(String name)
    {
        return("Hello "+name+" from the method 'm4'");
    }

}
