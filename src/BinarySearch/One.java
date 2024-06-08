package BinarySearch;

import java.util.Arrays;

// find a number in a sorted array... to improve time complexity
public class One {
    public static void main(String[] args) {
        int[] arr={-14,-11,-5,2,4,6,7,8,9,11,14,15,17,33,66,678};
        int target = 66;
        int ans = binary(arr,target);
        System.out.println(ans);
    }

    static int binary(int[] arr,int target){
        int start = 0;
        int end = arr.length;
        while (end >= start){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
