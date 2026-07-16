package sdet;

class Test
{
    final int x = 100;
}

public class FinalKeyword {

    public static void main(String[] args) {
        Test3 t = new Test3();
        // t.x = 350; -> incorrect because x is the final variable
        
        //System.out.println(t.y);
    }  
}
