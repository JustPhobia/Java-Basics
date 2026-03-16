package Module1.BasicJava;

import java.util.Scanner;

public class Factorial_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long factorial = 1;
        System.out.print("Insert the number you wish to see as a factorial: ");
        int userFactorial = sc.nextInt();
        for  (int i = 1; i <= userFactorial; i++) {
            factorial *= i;
        }
        System.out.println("Your total is: "+(Long)factorial);
    }
}
