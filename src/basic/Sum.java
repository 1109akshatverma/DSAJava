package basic;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter two number");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        float num2=input.nextFloat();

        float sum=num1 +num2;
        System.out.println("Sum : "+ sum);

    }
}
