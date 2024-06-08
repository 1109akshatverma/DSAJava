package basic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter the fruit name");
        Scanner input=new Scanner(System.in);
        String fruit=input.next();

        switch (fruit){
            case "Apple":
                System.out.println("Red Fruit");
                break;
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            default:
                System.out.println("Plz enter a fruit name");


        }

    }
}
