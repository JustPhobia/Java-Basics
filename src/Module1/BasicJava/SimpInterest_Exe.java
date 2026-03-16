package Module1.BasicJava;

import java.text.NumberFormat;
import java.util.Scanner;

public class SimpInterest_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat ffCurrency = NumberFormat.getCurrencyInstance();
        System.out.println("How much are you investing: ");
        float p = sc.nextFloat();
        System.out.println("What's your interest rate:");
        float i = sc.nextFloat();
        System.out.println("What's your investing period: ");
        float n = sc.nextFloat();
        float _A = p*(1+i*n);
        System.out.println("Your total after investments: "+ ffCurrency.format(_A));
    }
}
