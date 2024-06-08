package BitwiseOperator;


// finding odd with bitwise operators
public class FindingOdd {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(odd(n));
    }
    static boolean odd(int n){
        return (n & 1)== 1;
    }

}
