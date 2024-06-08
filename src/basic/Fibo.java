package basic;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);


        /*while (count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(count); */
        for(int count=2;count<=n;count++){
            int temp=b;
            b=b+a;
            a=temp;
            System.out.println(b);

        }


    }

}
