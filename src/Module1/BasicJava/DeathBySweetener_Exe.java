package Module1.BasicJava;

import java.util.Scanner;

public class DeathBySweetener_Exe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        *All code belongs to Jarryd Lautenbach
        * AI was used to provide neatness,
        * measurements and commments.
        */

        // --- Constants (theoretical / academic values) ---
        final float LETHAL_MOUSE = 0.1f;   // mg (dose for a 30 g mouse)
        final float MOUSE_WEIGHT = 30;     // g
        final float DOSE_DRINK = 0.001f;   // mg per drink unit

        // --- User input ---
        System.out.print("Please input your starting weight (kg): ");
        float weightStart = sc.nextFloat(); // currently not used

        System.out.print("Please input your desired weight (kg): ");
        float weightDesired = sc.nextFloat() * 1000; // kg → g

        // --- Calculation ---
        float lethalHuman = LETHAL_MOUSE * (weightDesired / MOUSE_WEIGHT);

        float numberOfUnits = lethalHuman / DOSE_DRINK;

        // --- Output ---
        System.out.println("\n--- Calculation Results (Theoretical) ---");
        System.out.println("Mouse dose: " + LETHAL_MOUSE + " mg");
        System.out.println("Mouse weight: " + MOUSE_WEIGHT + " g");
        System.out.println("Human weight used: " + weightDesired + " g");
        System.out.println("Scaled dose: " + lethalHuman + " mg");
        System.out.println("Drink dose per unit: " + DOSE_DRINK + " mg");
        System.out.println("Equivalent drink units: " + numberOfUnits);
    }
}
