package Module1.BasicJava;

import java.util.Scanner;

public class CircleArea_Exe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float r = input.nextFloat();
        System.out.println(Math.PI*r*r);
    }
}
