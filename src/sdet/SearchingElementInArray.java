package sdet;

public class SearchingElementInArray {

    public static void main(String[] args) {
        
        int [] a = {10,20,30,40,50};
        int searchElement = 30;
        boolean status = false;
        /* for(int i = 0; i < a.length; i++)
        {
            if(a[i] == searchElement)
            {
                System.out.println("Element found at index: " + i);
                status = true;
                break;
            }
        } */

        for(int element : a)
        {
            if(element == searchElement)
            {
                System.out.println("Element found in the array.");
                status = true;
                break;
            }
        }
        if(status == false)
        {
            System.out.println("Element not found in the array.");
        }  
    }
}
