package method;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s1=input.nextInt();
        int s2=input.nextInt();
        int ans=sum3(s1,s2); //int ans=sum3(3,5);
        System.out.println(ans);

    }


    // pass values when calling a function
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }


    // return type
    static int sum(){
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();
        int c = a+b;
        return c;
    }


    // no return type
    static void sum2(){
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();
        int c = a+b;
        System.out.println(c);
    }


    //using String as return type
    static String greet(){
        String greeting="Hello How is you";
        return greeting;
    }

}




