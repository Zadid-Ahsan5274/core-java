package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * বাকেট সর্ট (Bucket Sort)
 * মানের পরিসরকে কয়েকটি বাকেটে ভাগ করে, প্রতিটি উপাদান নির্দিষ্ট বাকেটে রাখে,
 * প্রতি বাকেট আলাদাভাবে sort করে (এখানে insertion sort) এবং সব জুড়ে দেয়।
 * সময় জটিলতা: Average O(n + k), Worst O(n²) | স্পেস: O(n + k) | Stable: হ্যাঁ
 */
public class BucketSort {
    public static void sort(int[] arr) {
        if (arr.length < 2) return;
        int min = arr[0], max = arr[0];
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        int bucketCount = (int) Math.sqrt(arr.length) + 1;
        double range = (double) (max - min + 1) / bucketCount;

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) buckets.add(new ArrayList<>());

        for (int v : arr) {
            int idx = (int) ((v - min) / range);
            if (idx >= bucketCount) idx = bucketCount - 1;
            buckets.get(idx).add(v);
        }

        int k = 0;
        for (List<Integer> bucket : buckets) {
            insertionSort(bucket);
            for (int v : bucket) arr[k++] = v;
        }
    }

    private static void insertionSort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    void main(){
        int demo[] = {64, 25, 12, -22, 11, 90, 25, 0};
        System.out.println("Main array before sorting: "+ Arrays.toString(demo));
        // int[] data = new Random(42).ints(2000, -5000, 5000).toArray();
        sort(demo);
        System.out.println("After Bucket sort: "+Arrays.toString(demo));
    }
}
