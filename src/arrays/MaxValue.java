package arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr={1,44,63,8,33,98,2};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxno=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxno){
                maxno=arr[i];
            }
        }
        return maxno;
    }
}
