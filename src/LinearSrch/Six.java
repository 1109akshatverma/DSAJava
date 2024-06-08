package LinearSrch;

import java.util.Arrays;
// {{1,2,3},{3,2,1}} solve this 2Darray and sum of one array should 6;;
public class Six {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {3,2,1}
        };
        int ans1=def1(arr);
        System.out.println(ans1);

    }
    static int def1(int[][] arr){
        int ans=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
            if (sum>ans){
                ans=sum;
            }

        }

    return ans;
    }
}