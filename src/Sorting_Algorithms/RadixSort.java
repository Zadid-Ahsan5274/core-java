package Sorting_Algorithms;

/**
 * রেডিক্স সর্ট (Radix Sort) - LSD, Non-comparison sort
 * সংখ্যার একক, দশক, শতক... এভাবে প্রতিটি digit ধরে (counting sort ব্যবহার করে) সাজায়।
 * ঋণাত্মক সংখ্যার জন্য min দিয়ে offset করা হয়েছে।
 * সময় জটিলতা: O(d × (n + b)) (d = digit সংখ্যা, b = base 10) | স্পেস: O(n + b) | Stable: হ্যাঁ
 */
public class RadixSort {
    public static void sort(int[] arr) {
        if (arr.length < 2) return;
        int min = arr[0];
        for (int v : arr) if (v < min) min = v;
        for (int i = 0; i < arr.length; i++) arr[i] -= min; // সব সংখ্যা অ-ঋণাত্মক

        int max = arr[0];
        for (int v : arr) if (v > max) max = v;

        for (long exp = 1; max / exp > 0; exp *= 10) countByDigit(arr, exp);

        for (int i = 0; i < arr.length; i++) arr[i] += min; // মূল মান ফিরিয়ে আনা
    }

    private static void countByDigit(int[] arr, long exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];
        for (int v : arr) count[(int) ((v / exp) % 10)]++;
        for (int i = 1; i < 10; i++) count[i] += count[i - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            int d = (int) ((arr[i] / exp) % 10);
            output[--count[d]] = arr[i];
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    void main() {
        int demo[] = {64, 25, 12, -22, 11, 90, 25, 0};
        System.out.println("Main array before sorting: " + java.util.Arrays.toString(demo));
        // int[] data = new Random(42).ints(2000, -5000, 5000).toArray();
        sort(demo);
        System.out.println("After Radix sort: " + java.util.Arrays.toString(demo));
    }
}
