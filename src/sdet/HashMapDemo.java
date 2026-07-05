package sdet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {
    static void main(String[] args) {
        // Declaration
        // HashMap hm = new HashMap();
        // Map hm = new HashMap();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        // Adding Pairs
        hashMap.put(101, "John");
        hashMap.put(102, "Scott");
        hashMap.put(103, "Marry");
        hashMap.put(104, "Scott");
        hashMap.put(102, "David");

        System.out.println(hashMap);
        System.out.println("Size of the hashmap: "+hashMap.size());

        hashMap.remove(103); // 103 is the key of the pair
        System.out.println("After removing the pair: "+hashMap);
        System.out.println(hashMap.get(102));

        // Get all the keys from the HashMap
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());

        // Reading data from hashmap
        // 1. using for...each loop
        /* for(int k : hashMap.keySet()){
            System.out.println(k+"  "+hashMap.get(k));
        } */

        // 2. using Iterator
        Iterator<Entry<Integer,String>> it = hashMap.entrySet().iterator();
        while(it.hasNext()){
            Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }
        hashMap.clear();
        System.out.println("Is the hashMap empty: "+hashMap.isEmpty());
    }
}
