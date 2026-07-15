package sdet;

class Test
{
    final int x = 100;
}

public class FinalKeyword {

    public static void main(String[] args) {
        Test t = new Test();
        // t.x = 350; -> incorrect because x is the final variable
        
        System.out.println(t.x);
    }  
}
