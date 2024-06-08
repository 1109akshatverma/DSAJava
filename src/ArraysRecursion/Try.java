package ArraysRecursion;

public class Try {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4};
        int target = 4;
        System.out.println(sort(arr,target,0, arr.length -1 ));

    }

    static int sort(int[] arr,int target , int s, int e){
        if (s>e){
            return -1;
        }
        int m = s + (e-s) / 2;

        if (arr[m] == target){
            return m;
        }

        if (arr[m] >= arr[s]){
            if (target >= arr[s] && target <= arr[m]){
                return sort(arr,target,s,m - 1);
            }else {
                return sort(arr,target,m + 1,e);
            }
        }
        if (target >= arr[m] && target <= arr[e]){
            return sort(arr,target,m + 1,e);
        }
        return sort(arr,target,s,m - 1);
    }

}
