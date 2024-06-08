package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a=new int[5];
        int[] arr=new int[5];

        a[0]=44;
        a[1]=55;
        a[2]=234;
        a[3]=456;
        a[4]=45674;
//        System.out.println(a[4]);

        Scanner input=new Scanner(System.in);

        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

    }
}
