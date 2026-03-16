package Module1.BasicJava;

import java.util.Scanner;

public class IntDetector_Exe {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean uAgain=true,uID10T=false;
        while (uAgain==true) {
            uAgain=false;
            uID10T=false;
            System.out.println("Please type a number: ");
            int uNumber = sc.nextInt();
            if (uNumber == 0) {
                System.out.println("Your number is zero!");
            } else if (uNumber > 0) {
                System.out.println("Your number is positive!");
            } else {
                System.out.println("Your number is negative!");
            }
            while (uID10T == false) {
                System.out.println("Again?");
                char uChoice = sc.next().toLowerCase().charAt(0);
                if ((uChoice == 'n') || (uChoice == 'y')) {
                    uID10T = true;
                    if (uChoice == 'n') {
                        uAgain = false;
                    } else if (uChoice == 'y') {
                        uAgain = true;
                    }
                } else {
                    System.out.println("Please insert a valid response");
                }
            }
        }
    }
}
