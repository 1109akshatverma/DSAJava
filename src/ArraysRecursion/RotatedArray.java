package ArraysRecursion;

// binary search in rotated array
public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3};
        int target = 1;
        System.out.println(binary(arr,target,0, arr.length-1));
    }
    static int binary(int[] arr , int target , int s , int e){
        if ( s > e){
            return -1;
        }

        int m = s + (e - s)/2;

        if(target == arr[m]){
            return m;
        }

        if (arr[s] <= arr[m]){
            if (target <= arr[m] && target >= arr[s]){
                return binary(arr, target, s , m - 1);
            }else {
                return binary(arr, target,m + 1, e);
            }
        }
        if (target >= arr[m] && target <= arr[e]){
            return binary(arr, target, m + 1, e);
        }
        return binary(arr, target , s , m - 1);

    }


}
