package sdet;

public class C1 extends C2 implements I1, I2{

    @Override
    public void method1(){
        System.out.println("method1 from I1: "+x);
    }

    @Override
    public void method2() {
       System.out.println("method2 from I2: "+y);
    }

    public static void main(String[] args) {
        C1 class1Object = new C1();
        class1Object.method1();
        class1Object.method2();
        class1Object.method3();
    }  
}
