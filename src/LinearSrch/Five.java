package LinearSrch;

// find all the numbers which have even number of digits
// eg. {11,2,3333} here 11 and 3333 have even no. of digits
public class Five {
    public static void main(String[] args) {
        int[] arr = {12,22,3452,6666};
        System.out.println(findNumber(arr));

    }
    static int findNumber(int[] arr){
        int count = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (even(arr[i])){
                count++;
            }
        }

        return count;
    }
    static boolean even(int num){
        int ans = digits(num);
        return ans % 2 == 0;
    }
    static int digits (int num){
        int count = 0;
        while (num > 0){
            count++ ;
            num = num / 10;
        }

        return count;
    }
}
