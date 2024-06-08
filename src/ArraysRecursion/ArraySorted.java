package ArraysRecursion;

// to find whether the array is sorted or not
public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,32,41,55,76,344};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr , int index){
        if ( index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr,index + 1);
    }

}
