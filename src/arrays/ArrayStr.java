package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] str=new String[5];
        String[] arr=new String[5];

//        for(int i=0; i< str.length;i++){
//            arr[i]=input.next();
//        }
//        str[1]="kunal";
//        System.out.println(Arrays.toString(arr));

        int[] a= {3,4,5,67,5};
        arr(a);
        System.out.println(Arrays.toString(a));


    }
    static void arr(int[] a){
        a[0]=55;
    }

}
