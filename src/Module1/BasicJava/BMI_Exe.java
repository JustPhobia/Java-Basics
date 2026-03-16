package Module1.BasicJava;

import java.util.Scanner;

public class BMI_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight(kg's):");
        float kg = sc.nextFloat();
        System.out.println("Enter your height(m):");
        float h = sc.nextFloat();
        System.out.println("Your BMI Is: " + (kg * h * h));
    }
}