package Module1.BasicJava;

import java.util.Scanner;

public class ExitLoop_exe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uAgain = true,uID10T = true;
        int fSum = 0, uNumber;
        while (uAgain){
            uID10T = true;
            System.out.println("Please insert the number you wish to add:");
            String userNumber = sc.nextLine();
            uNumber = Integer.parseInt(userNumber);
            fSum += uNumber;
            while (uID10T) {
                System.out.println("Another number? Y/N");
                char uChoice = sc.nextLine().toLowerCase().charAt(0);
                if (uChoice == 'n') {
                    uAgain = false;
                } else if (uChoice == 'y') {
                    uID10T = false;
                }
                userNumber= "";
                System.out.println("Running count: "+fSum);
            }
        }
        System.out.println("Total Final Sum is: "+fSum);
    }
}
