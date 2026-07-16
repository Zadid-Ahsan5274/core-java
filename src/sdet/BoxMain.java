package sdet;

public class BoxMain {
    public static void main(String[]args)
    {
        //Box box = new Box(); // 1
        Box box1 = new Box(10.5,15.5,5.0); // 2
        System.out.println("Volume of the box is: "+box1.volume());
    }
}
