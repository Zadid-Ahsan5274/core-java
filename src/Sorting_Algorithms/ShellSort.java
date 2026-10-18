package Sorting_Algorithms;

import java.util.Arrays;

public class ShellSort {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int gap = n / 2; gap > 0; gap /= 2){
            for(int i = gap; i < n; i++){
                int temp = arr[i];
                int j = i;
                while(j >= gap && arr[j-gap]>temp){
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }

    void main(){
        int demo[] = {64, 25, 12, -22, 11, 90, 25, 0};
        System.out.println("Main array before sorting: "+ Arrays.toString(demo));
        // int[] data = new Random(42).ints(2000, -5000, 5000).toArray();
        sort(demo);
        System.out.println("After Shell sort: "+Arrays.toString(demo));
    }
}
