package Module1.BasicJava;

import java.util.Scanner;

public class SumNatNumbers_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uAgain = true,uID10T = true;
        int uNumber = 0, fSum = 0;
        while (uAgain==true){
            boolean uPositive= false;
            fSum=0;
            while(uPositive == false){
                System.out.println("Please choose a positive number");
                uNumber = sc.nextInt();
                if (uNumber>0){
                    uPositive=true;
                }
            }
            for (int i = 0; i<=uNumber; i++){
                fSum += i;
            }
            System.out.println("Your final sum is: "+fSum);

            while (uID10T == true) {
                System.out.println("Again?");
                char uChoice = sc.next().toLowerCase().charAt(0);
                if (uChoice == 'n') {
                    uAgain = false;
                    uID10T = false;
                } else if (uChoice == 'y') {
                    uAgain= true;
                    uID10T = false;
                }
            }
        }
    }
}
