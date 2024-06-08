package method;

import java.util.Arrays;

public class ChangeVal {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        num(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void num(int[] num){
        num[0]=99;
    }
}
