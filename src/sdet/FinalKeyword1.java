package sdet;

class Test1
{
    final void m()
    {
        System.out.println("This is 'm' method from Test1 class");
    }
}

class Test2 extends Test1
{
    /* 
    void m() // incorrect because method m() is declared as 'final'
    {
        System.out.println("This is 'm' method from Test2 class - impossible to do");
    }
    */
}

public class FinalKeyword1 {
    
}
