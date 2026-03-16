package Module1.Strings;

import java.util.Scanner;

public class Strings_Exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert a string: ");
        String inStr = sc.nextLine();
        System.out.println(inStr.length());
        System.out.println(inStr.charAt(1));
        System.out.println(inStr.charAt((inStr.length())-2));
        String converted = inStr.toUpperCase();
        System.out.println(converted);
        converted = inStr.toLowerCase();
        System.out.println(converted);
    }
}
