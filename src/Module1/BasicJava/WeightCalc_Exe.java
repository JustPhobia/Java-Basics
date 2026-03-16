package Module1.BasicJava;

import java.util.Scanner;

public class WeightCalc_Exe {
    public static void main(String[] args) {
        boolean uContinue = true;
        final float EARTH = 9.8f;
        final float MOON = 1.62f;
        float mass;
        Scanner input = new Scanner(System.in);
        while (uContinue) {
            System.out.print("Enter the mass(kg): ");
            mass = input.nextFloat();
            System.out.println("The weight would be "+(float)mass*EARTH+"N");
            System.out.println("The weight would be "+(float)mass*MOON+"N");
            System.out.println("Would you like to continue? (Y/N");
            char choice = input.next().toLowerCase().charAt(0);
            if (choice == 'n') {
                uContinue = false;
            }
        }
    }
}
