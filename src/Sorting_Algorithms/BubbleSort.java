package Sorting_Algorithms;

public class BubbleSort {
    public static void sort(int[] a){
        int n = a.length;
        for(int i = 0; i < n -1 ; i++){
            boolean swapped = false;
            for(int j = 0; j < n-1-i;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];a[j] = a[j+1];a[j+1]=t;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    static void main() {
        int arr[] = {64, 25, 12, 22, 11, 90, 25, 3};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
