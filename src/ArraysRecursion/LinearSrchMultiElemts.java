package ArraysRecursion;

// finding elements on multiple occurrence
import java.util.ArrayList;
public class LinearSrchMultiElemts {
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,223,88,12};
        int target = 8;
        linear(arr,target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void linear(int[] arr , int target , int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        linear(arr,target,index+ 1);
    }
}
