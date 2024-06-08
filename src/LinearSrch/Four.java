package LinearSrch;

import java.util.Arrays;

//Linear Search in 2D array , Findind max number in 2D array
public class Four {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,57,6},
                {7,8,9}
        };
        int target =9;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

        maxval(arr);
    }
    static void maxval(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }




    static int[] search(int[][] arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
    return new int[] {-1-1};
    }
}
