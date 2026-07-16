package sdet;

public class AdderMain {
    public static void main(String[] args)
    {
        Adder adderObject = new Adder();
        adderObject.sum(); //1
        adderObject.sum(100,200); //2
        adderObject.sum(10.5,20); //4
        adderObject.sum(10,15.5); //3
        adderObject.sum(10,20,30); //5
        // adderObject.sum(10.5,20.5,30.5); ---> throws error as not defined method with these parameters
    }
}
