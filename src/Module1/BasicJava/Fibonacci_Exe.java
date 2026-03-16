package Module1.BasicJava;

import java.util.Scanner;

public class Fibonacci_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double uRunFor, uPastNumber=0, uCurrentNumber=1, uSumTotal;
        System.out.println("How long would you like it to loop for?");
        uRunFor = sc.nextInt();
        System.out.println(uPastNumber+"\n"+uCurrentNumber);
        for (double i =0; i<uRunFor-2; i++){
            System.out.println(uCurrentNumber+uPastNumber);
            uSumTotal = uCurrentNumber+uPastNumber;
            uPastNumber=uCurrentNumber;
            uCurrentNumber=uSumTotal;
        }

    }
}
