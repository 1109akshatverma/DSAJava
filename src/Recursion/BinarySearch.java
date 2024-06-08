package Recursion;


// using recursion and find element in array using binary search
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,66,78,98};
        int target = 78;
        int ans = fun(arr,target,0,arr.length-1);
        System.out.println(ans);


    }
    static int fun(int[] arr , int target , int start , int end){

        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]){
            return mid;
        }

        if (target > arr[mid]){
            return fun(arr,target,mid + 1,end);
        }
        return fun(arr,target,start,mid - 1);
    }

}
