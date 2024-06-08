package BitwiseOperator;

// finding the unique number in the array which occurs one time
public class FindingUnique {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5,3,2,1,4};
        System.out.println(unique(arr));
    }

    static int unique(int[] arr) {
        int unique = 0;
        for (int n : arr){
            unique = unique ^ n;
        }
        return unique;
    }
}
