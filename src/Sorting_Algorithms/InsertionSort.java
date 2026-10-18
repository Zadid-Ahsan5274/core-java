package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void sort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    void main(){
        int demo[] = {64, 25, 12, -22, 11, 90, 25, 0};
        System.out.println("Main array before sorting: "+ Arrays.toString(demo));
        // int[] data = new Random(42).ints(2000, -5000, 5000).toArray();
        sort(demo);
        System.out.println("After insertion sort: "+Arrays.toString(demo));
    }
}
