package Recursion;

// factorial of a number
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial is " + factorial(n));
        System.out.println("Sum is " + sum(n));
    }
    static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
