package BinarySearch;


//order agnostic binary search
//check for array for acc or des than find the desired target
public class Two {
    public static void main(String[] args) {
//        int[] arr={-14,-11,-5,2,4,6,7,8,9,10,11,14,15,17,33,66,678}; //acc
        int[] arr = {13,7,4,3,1,-1}; //des
        int target = 3;
        int ans = binary(arr,target);
        System.out.println(ans);
    }
    static int binary(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        if(end > arr[0]){
            while (end >= start){
                int mid = start + (end - start)/2;
                if (target > arr[mid]){
                    start = mid + 1;
                }else if (target < arr[mid]){
                    end = mid - 1;
                }else{
                    return mid;
                }
            }
        }else if (arr[0] > end){
            while (end >= start){
                int mid = start + (end - start)/2;
                if (target > arr[mid]){
                    end = mid - 1;

                }else if (target < arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }
        }
    return -1;
    }
}
