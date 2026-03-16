package Module1.Arrays;

import java.util.Scanner;

public class LengthArray_Exe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Array length is: " + arr.length);
    }
}
