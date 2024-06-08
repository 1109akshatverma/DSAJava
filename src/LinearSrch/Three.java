package LinearSrch;

//find the minimum number from an array
public class Three {
    public static void main(String[] args) {
        int[] arr={30,47,23,765,10,7563,22};
        System.out.println(minnn(arr));
    }
    static int minnn(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < min){
                min=arr[i];
            }

        }
    return min;
    }
}
