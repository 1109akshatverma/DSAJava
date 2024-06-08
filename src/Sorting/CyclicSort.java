package Sorting;


import java.util.Arrays;

// only use when the array is from 1-n, 0-n or continuos array
//
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,8,6,5,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int change = arr[i] - 1;
            if (arr[i] != arr[change]){
                swap(arr,i,change);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int change) {
        int temp = arr[i];
        arr[i] = arr[change];
        arr[change] = temp;
    }

}
