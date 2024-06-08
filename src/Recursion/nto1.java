package Recursion;

// print n - 1 number and 1 - n
public class nto1 {
    public static void main(String[] args) {
        int n = 5;
        funcrev(n);
    }
    static void func(int n){
        if (n <=0){
            return;
        }

        System.out.println(n);
        func(n-1);
    }

    static void funcrev(int n){
        if ( n <= 0){
            return;
        }

        funcrev(n-1);
        System.out.println(n);
    }

    // new way of printing 5 4 3 2 1
    static void newway(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        newway(--n);
    }
}
