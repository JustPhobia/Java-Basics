package Module1.BasicJava;

import java.util.Scanner;

public class VzapScore_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score: ");
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("You got an A!");
        }else if (score >= 80) {
            System.out.println("You got an B!");
        }else if (score >= 60) {
            System.out.println("You got an C!");
        }else if (score >= 50) {
            System.out.println("You got an D!");
        }else if (score < 50) {
            System.out.println("You got an F! Which means you failed.");
        }
    }
}
