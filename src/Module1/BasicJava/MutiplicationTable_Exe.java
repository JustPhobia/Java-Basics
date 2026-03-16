package Module1.BasicJava;

import java.util.Scanner;

public class MutiplicationTable_Exe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean uAgain = true;
        while (uAgain) {
            System.out.println("Insert Number You Wish To Multiply: ");
            int uChoice = sc.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(uChoice + " multiplied by " + i + " = " + (uChoice * i));
            }
            System.out.println("Again? Y/N");
            char uDecision = sc.next().toLowerCase().charAt(0) ;
            if (uDecision =='y'){
                System.out.println("AGAIN!");
            }else{
                uAgain=false;
            }
        }
    }
}
