package basic;

import java.util.Scanner;

public class NesSwitch {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int erpID=input.nextInt();
        String department=input.next();

        switch (erpID){
            case 1:
                System.out.println("ERP ID 1");
                break;
            case 2:
                System.out.println("ERP ID 2");
                break;
            case 3:
                System.out.println("ERP ID 3");
                break;
            case 4:
                System.out.println("Department");
                switch (department){
                    case "it":
                        System.out.println("You r from IT");
                        break;
                    case "management":
                        System.out.println("You are from management");
                        break;
                    default:
                        System.out.println("Enter valid department");
                }
                break;
            default:
                System.out.println("Enter valid ID");

        }


    }
}
