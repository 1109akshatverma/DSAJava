package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[][] arr=new int[3][2];
        System.out.println(arr.length);


        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length ; j++){
                arr[i][j]=input.nextInt();
            }

        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }



    }

}
