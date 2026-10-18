package Sorting_Algorithms;

import java.util.Arrays;

/**
 * মার্জ সর্ট (Merge Sort) - Divide and Conquer
 * অ্যারেকে মাঝখান থেকে দুই ভাগ করে, প্রতিটি আলাদা sort করে, তারপর merge করে।
 * সময় জটিলতা: সব ক্ষেত্রে O(n log n) | স্পেস: O(n) | Stable: হ্যাঁ
 */
public class MergeSort {
    public static void sort(int[] arr) {
        if (arr.length < 2) return;
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] L = java.util.Arrays.copyOfRange(arr, left, mid + 1);
        int[] R = java.util.Arrays.copyOfRange(arr, mid + 1, right + 1);
        int i = 0, j = 0, k = left;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) arr[k++] = L[i++]; // <= দেওয়ায় stable
            else arr[k++] = R[j++];
        }
        while (i < L.length) arr[k++] = L[i++];
        while (j < R.length) arr[k++] = R[j++];
    }

    void main(){
        int demo[] = {64, 25, 12, -22, 11, 90, 25, 0};
        System.out.println("Main array before sorting: "+ Arrays.toString(demo));
        // int[] data = new Random(42).ints(2000, -5000, 5000).toArray();
        sort(demo);
        System.out.println("After Merge sort: "+Arrays.toString(demo));
    }
}
