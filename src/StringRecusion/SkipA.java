package StringRecusion;


// skip all letter 'a' and print rest of the String...
public class SkipA {
    public static void main(String[] args) {
        skip("","akshatverma");

    }
    static void skip (String n, String o){
        if(o.isEmpty()){
            System.out.println(n);
            return;
        }

        char ch = o.charAt(0);

        if (ch == 'a'){
            skip(n,o.substring(1));
        }else {
            skip(n+ch,o.substring(1));
        }



    }
}
