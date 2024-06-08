package Recursion;


// leetcode 1342
// reduce the number to zero and count the steps
// if even divide by 2
// if odd subtract by 1
public class ReduceToZero {

    static int count(int n, int c){
        if (n == 0){
            return c;
        }

        if (n % 2 == 0){
            return count(n / 2 , c + 1);
        }
        return count(n - 1, c + 1);

    }

    public static void main(String[] args) {
        int n = 14;
        System.out.println(count(n , 0));
    }
}
