package StringRecusion;

// skip if the word 'apple' comes and print rest
public class SkipApple {
    public static void main(String[] args) {
        System.out.println(skip("bascdappleaaa"));
    }
    static String skip(String o){
        if (o.isEmpty()){
            return "";
        }

        if (o.startsWith("apple")){
            return skip(o.substring(5));
        }else{
            return o.charAt(0) + skip(o.substring(1));
        }
    }
}
