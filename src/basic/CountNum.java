package basic;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long a= input.nextLong();
        long count=0;

        while (a>0){
            long n=a%10;
            if (n==5){
                count++;
            }
            a=a/10;
        }
        System.out.println(count);
    }
}
