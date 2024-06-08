package method;

public class Scoping {
    static int x=90; // shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x); //print 90
        int x=40;
        System.out.println(x);// x changed to 40
        random();
    }
    static void random(){
        System.out.println(x);
    }
}
