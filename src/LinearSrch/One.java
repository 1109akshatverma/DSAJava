package LinearSrch;
//Linear Search of Integers ..

public class One {
    public static void main(String[] args) {
        int[] arr={22,56,29,8,2,38,23,4,3,46,78,31};
        int target=3;
        System.out.println(linear(arr,target));
    }
    static int linear(int[] arr, int target){

        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==target){
                return i;
            }
        }
    return -1;
    }

}
