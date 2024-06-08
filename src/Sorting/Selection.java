package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length - i - 1;
            int max = findMax(arr,0,last);
            swap(arr,last,max);
        }
    }

    static int findMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap (int[] arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
