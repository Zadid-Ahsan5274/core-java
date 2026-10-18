package Sorting_Algorithms;

/**
 * হিপ সর্ট (Heap Sort)
 * প্রথমে অ্যারে থেকে Max-Heap বানায়। তারপর root (সবচেয়ে বড়) কে শেষে সরিয়ে heap ছোট করতে থাকে।
 * সময় জটিলতা: সব ক্ষেত্রে O(n log n) | স্পেস: O(1) | Stable: না
 */
public class HeapSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        // Max-Heap তৈরি
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);
        // একে একে root সরিয়ে শেষে বসানো
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0]; arr[0] = arr[i]; arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int size, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;
        if (left < size && arr[left] > arr[largest]) largest = left;
        if (right < size && arr[right] > arr[largest]) largest = right;
        if (largest != root) {
            int temp = arr[root]; arr[root] = arr[largest]; arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }

    void main() {
        int demo[] = {64, 25, 12, -22, 11, 90, 25, 0};
        System.out.println("Main array before sorting: " + java.util.Arrays.toString(demo));
        // int[] data = new Random(42).ints(2000, -5000, 5000).toArray();
        sort(demo);
        System.out.println("After Heap sort: " + java.util.Arrays.toString(demo));
    }
}
