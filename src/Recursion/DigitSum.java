package Recursion;

// sum of digits of a number
// product of digits of a number
public class DigitSum {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println("Sum is " + sum(n));
        System.out.println("Product is " + prod(n));
    }

    static int sum(int n){
        if (n == 0){
            return 0;
        }

        return (n % 10) + sum(n / 10);
    }

    static int prod(int n){
        if (n%10 == n){
            return n;
        }
        return (n % 10) * prod(n / 10);
    }
}
