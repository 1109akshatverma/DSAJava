// variable arguments : when we don't know how many input are there
package method;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(13,4,5,6,323,46,345);
        notfun(1,2,"hjello","jello");
    }

    static void notfun(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));

    }


    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
