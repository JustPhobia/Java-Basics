package Module1.BasicJava;

import java.util.Scanner;

public class Quadratic_Exe {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Boolean mathError = true;
        System.out.print("Enter the valuse for A: ");
        float a = sc.nextFloat();
        System.out.print("Enter the value for B: ");
        float b = sc.nextFloat();
        System.out.print("Enter the value for C: ");
        float c = sc.nextFloat();
        while(mathError){
        if (a!=0) {
            double rootValue = Math.sqrt(b*b + 4 * a * c);
            double x1 = (-b + rootValue) / (2 * a);
            double x2 = (-b - rootValue) / (2 * a);
            System.out.println("Therefor X = " + x1 + " or X = " + x2);
            mathError = false;
        }else{
            System.out.println("Please enter a number that isn't zero for A.");
        }
        }
    }
}
