package Module1.BasicJava;

import java.util.Scanner;

public class RemainderCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rNum1, rNum2;
        System.out.println("Please input the numbers you wish to find the remainder of:");
        rNum1 = sc.nextFloat();
        rNum2 = sc.nextFloat();
        System.out.println("The remainder of " + rNum1 + " divided by " + rNum2 + " = " + rNum1 % rNum2);
    }
}
