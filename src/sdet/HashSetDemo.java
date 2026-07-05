package sdet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    static void main(String[] args) {
        // Declaration
        HashSet myHashSet = new HashSet();
        // Set mySet = new HashSet();
        // HashSet<String> myHashSet = new HashSet<String>();

        // Adding elements into the hashset
        myHashSet.add(100);
        myHashSet.add(10.5);
        myHashSet.add("welcome");
        myHashSet.add(true);
        myHashSet.add('A');
        myHashSet.add(100);
        myHashSet.add(null);
        myHashSet.add(null);

        // Printing hashset
        System.out.println(myHashSet);

        // Size of the hashset
        System.out.println("Size of the hashset: "+myHashSet.size());

        // Removing element
        myHashSet.remove(10.5);   // 10.5 is an element of the hashset, not index
        System.out.println("After removing: "+myHashSet);

        // Inserting element - not possible
        // Access specific element - not possible

        // Convert HashSet -> ArrayList
        ArrayList myArrayList = new ArrayList(myHashSet);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(2));

        // Read all elements using for...each loop
        /* for(Object x : myArrayList){
            System.out.print(x + " ");
        }*/

        // Using iterator
        Iterator<Object> it = myHashSet.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Clearing all elements in hashset
        myHashSet.clear();
        System.out.println("After clearing: "+myHashSet);
        System.out.println("Is myHashSet empty: "+myHashSet.isEmpty());
    }
}
