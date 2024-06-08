package Pattern;
//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *

public class Pattern5 {
    public static void main(String[] args) {
        int n= 5;
        // for upper half of the pattern

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // for lower half
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n+i -4; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n-i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
