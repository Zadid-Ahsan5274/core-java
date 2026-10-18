package Sorting_Algorithms;

import java.util.Arrays;

public class CocktailshakerSort {
    public static void sort(int[] arr) {
        int start = 0, end = arr.length - 1;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) { swap(arr, i, i + 1); swapped = true; }
            }
            if (!swapped) break;
            end--;
            swapped = false;
            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) { swap(arr, i, i + 1); swapped = true; }
            }
            start++;
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int t = arr[a]; arr[a] = arr[b]; arr[b] = t;
    }

    void main(){
        int demo[] = {64, 25, 12, -22, 11, 90, 25, 0};
        System.out.println("Main array before sorting: "+ Arrays.toString(demo));
        // int[] data = new Random(42).ints(2000, -5000, 5000).toArray();
        sort(demo);
        System.out.println("After Cocktail Shaker sort: "+Arrays.toString(demo));
    }
}
