package method;

import java.util.Arrays;

//same method name but differnt arguments

public class Overloading {
    public static void main(String[] args) {
        //fun(77);
        //fun("Akshat Verma");
        sum(3,4,5,6,6);
        sum("hello","ji","how");
    }

    static void sum(int ...a1){
        System.out.println(Arrays.toString(a1));
    }
    static void sum(String ...a2){
        System.out.println(Arrays.toString(a2));
    }





    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String b){
        System.out.println(b);
    }
}
