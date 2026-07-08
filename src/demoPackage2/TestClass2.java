package demoPackage2;

import demoPackage.TestClass1;

/* public class TestClass2 extends TestClass1{
    static void main(String[] args) {
        TestClass2 testClass2 = new TestClass2();
        System.out.println(testClass2.x);
        testClass2.method1();


            TestClass1 testClass1 = new TestClass1();
            System.out.println(testClass1.x);
            testClass1.method1();

    }
}
*/
public class TestClass2 {
    static void main(String[] args) {
        TestClass1 testClass1 = new TestClass1();
        System.out.println(testClass1.x);
        testClass1.method1();
    }
}