package sdet;

import java.util.ArrayList;
import java.util.Iterator;
// import java.util.List;

public class ArrayListDemo {
    static void main(String[] args) {

        // Declaration
        // ArrayList<Integer> myList = new ArrayList<Integer>();
        ArrayList myList = new ArrayList();
        // List myList = new ArrayList();
        // ArrayList<String> myList = new ArrayList<String>();

        // Adding data into arraylist
        myList.add(100);
        myList.add(10.5);
        myList.add("welcome");
        myList.add('A');
        myList.add(true);
        myList.add(100);
        myList.add(null);
        myList.add(null);

        // Size of the array list
        System.out.println("Size of the list: "+myList.size());

        // Printing the arraylist
        System.out.println("Printing the arraylist: "+myList);

        // Remove element from the arraylist
        myList.remove(5);  // here 5 is index number

        // Printing the arraylist
        System.out.println("After removing index 5: Printing the arraylist: "+myList);

        // Insert element in the arraylist
        myList.add(2,"Java");

        // Printing the arraylist
        System.out.println("After adding in index 2: Printing the arraylist: "+myList);

        // modify element in the arraylist(modify/replace/change)
        myList.set(2,"C#");

        // Printing the arraylist
        System.out.println("After modifying in index 2: Printing the arraylist: "+myList);

        // Access specific element from arraylist
        System.out.println("Element at index 3: "+myList.get(3));

        // Reading all the elements from the arraylist

        // 1. using normal for-loop
        /*for(int i = 0; i <= myList.size()-1; i++){
            System.out.print(myList.get(i) + " ");
        }*/

        // 2. using for...each loop
        /* for(Object x : myList){
            System.out.print(x + " ");
        } */

        // 3. using Iterator
        Iterator<Object> it = myList.iterator();

        /* while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }*/
        // System.out.println(it.next());

        // Checking arraylist is empty or not
        System.out.println("Is myList empty:"+myList.isEmpty());

        // Remove all the elements from the arrayList
       // myList.clear();
        ArrayList myArrayList = new ArrayList<>();
        myArrayList.add(100);
        myArrayList.add("welcome");
        //System.out.println("After clearing: printing the arraylist: "+myList);
        myList.removeAll(myArrayList);
        System.out.println("After removing multiple elements: "+myList);

        // Remove all the elements/clear
        myList.clear();
        System.out.println("Is myList empty:"+myList.isEmpty());

    }
}
