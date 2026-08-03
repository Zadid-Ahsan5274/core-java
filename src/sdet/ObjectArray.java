package sdet;

public class ObjectArray {
    static void main(String[] args) {
        Object a[] = {100,10.5, 'A',"Welcome",true};
        for(Object x : a)
        {
            System.out.print(x+" ");
        }
        System.out.println();

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
