package Sorting_Algorithms;

import java.util.Arrays;

/**
 * কুইক সর্ট (Quick Sort) - Divide and Conquer
 * একটি pivot বেছে নেয়; pivot-এর চেয়ে ছোটগুলো বামে, বড়গুলো ডানে রাখে (partition)।
 * তারপর দুই পাশে একই কাজ recursively করে।
 * সময় জটিলতা: Best/Average O(n log n), Worst O(n²) | স্পেস: O(log n) | Stable: না
 */
public class QuickSort {
    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // মাঝের উপাদানকে pivot ধরা হয়েছে (sorted ইনপুটে worst case এড়াতে)
        int mid = low + (high - low) / 2;
        swap(arr, mid, high);
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int a, int b) {
        int t = arr[a]; arr[a] = arr[b]; arr[b] = t;
    }

    void main(){
        int demo[] = {64, 25, 12, -22, 11, 90, 25, 0};
        System.out.println("Main array before sorting: "+ Arrays.toString(demo));
        // int[] data = new Random(42).ints(2000, -5000, 5000).toArray();
        sort(demo);
        System.out.println("After Quick sort: "+Arrays.toString(demo));
    }
}
