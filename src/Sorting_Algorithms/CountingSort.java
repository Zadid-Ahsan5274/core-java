package Sorting_Algorithms;

/**
 * কাউন্টিং সর্ট (Counting Sort) - Non-comparison sort
 * প্রতিটি মান কতবার এসেছে তা গুনে রাখে, তারপর সেই গণনা থেকে sorted অ্যারে বানায়।
 * ঋণাত্মক সংখ্যার জন্য min দিয়ে offset করা হয়েছে।
 * সময় জটিলতা: O(n + k) (k = মানের পরিসর) | স্পেস: O(n + k) | Stable: হ্যাঁ
 */
public class CountingSort {
    public static void sort(int[] arr) {
        if (arr.length < 2) return;
        int min = arr[0], max = arr[0];
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        int[] count = new int[max - min + 1];
        for (int v : arr) count[v - min]++;
        for (int i = 1; i < count.length; i++) count[i] += count[i - 1]; // cumulative

        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) { // পেছন থেকে চললে stable
            output[--count[arr[i] - min]] = arr[i];
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    void main() {
        int demo[] = {64, 25, 12, -22, 11, 90, 25, 0};
        System.out.println("Main array before sorting: " + java.util.Arrays.toString(demo));
        // int[] data = new Random(42).ints(2000, -5000, 5000).toArray();
        sort(demo);
        System.out.println("After Counting sort: " + java.util.Arrays.toString(demo));
    }
}