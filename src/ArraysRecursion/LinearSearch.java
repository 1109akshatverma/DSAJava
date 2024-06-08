package ArraysRecursion;

// finding an element in an array using Linear Search
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,223,956,12};
        int target = 223;
        System.out.println(presentornot(arr,target,0));
        System.out.println(indexofelement(arr,target,0));
    }
    static boolean presentornot(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || presentornot(arr,target,index + 1);
    }

    static int indexofelement(int[] arr , int target , int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return indexofelement(arr,target,index + 1);
    }
}
