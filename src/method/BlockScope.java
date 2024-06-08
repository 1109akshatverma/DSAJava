package method;

public class BlockScope {
    public static void main(String[] args) {
        int a=4;
        int b=56;
        {
            a=100; // can't declare again
            int c=200; // can't print outside
        }
        System.out.println(a);
    }
}
