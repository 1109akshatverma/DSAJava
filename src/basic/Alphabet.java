package basic;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char a=input.next().trim().charAt(0);

        if (a>='a' && a<='z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }

    }
}
