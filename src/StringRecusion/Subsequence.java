package StringRecusion;


// find all the subset (subsequence) of the String ...
public class Subsequence {
    public static void main(String[] args) {
        subseq("","abc");
    }
    static void subseq(String p,String un){
        if (un.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = un.charAt(0);
        subseq(p + ch ,un.substring(1));
        subseq(p , un.substring(1));

    }
}
