package Module1.Strings;

import java.util.Scanner;

public class String_Exe2 {
    public static void main(String[] args) {
        //start of question 2
        Scanner sc =new Scanner(System.in);
        System.out.println("Please input a string greater than 10");
        String userStr = sc.nextLine();
        if (userStr.length()<10){
            System.out.println("Please read");
            System.exit(0);
        }
        System.out.println(userStr);
        String first3 = userStr.substring(0,3);
        System.out.println(first3);
        String last3 = userStr.substring((userStr.length()-3), userStr.length());
        System.out.println(last3);
        String middle = userStr.substring(3, (userStr.length()-3));
        System.out.println(middle);
        System.out.println("Insert Char you would like to test:");
        char testChar = sc.nextLine().charAt(0);
        int testLast = first3.lastIndexOf(testChar);
        if (testLast!=-1){
            System.out.println("First 3 contains Char: "+testLast);
        }else{
            System.out.println("Char not contained in first 3");
        }
        testLast = last3.lastIndexOf(testChar);
        if (testLast!=-1){
            System.out.println("Last 3 contains char: "+testLast);
        }else{
            System.out.println("Char not contained in last 3");
        }
        testLast = middle.lastIndexOf(testChar);
        if (testLast!=-1){
            System.out.println("Middle contains char: " +testLast);
        }else{
            System.out.println("Middle does not contain char.");
        }

    }
}
