package Module1.BasicJava;

import java.util.Scanner;

public class CaffeineOD_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float gLethal = 10;
        System.out.println("Please enter your drinks caffeine content(mg): ");
        float gCaffeine = sc.nextFloat()/1000;

        System.out.println("The total number of drinks you can have in one day is: "+(int)(gLethal/gCaffeine));
    }
}
