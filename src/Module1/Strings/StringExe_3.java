package Module1.Strings;

import java.util.Scanner;

public class StringExe_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Write something:");
        String testStr=sc.nextLine();
        System.out.println("Please place a char test value:");
        char testChar= sc.nextLine().charAt(0);
        StringBuffer strBuff= new StringBuffer(testStr);
        System.out.println(strBuff);
        strBuff.insert(3, testChar);
        strBuff.insert(4, testChar);
        System.out.println(strBuff);
        strBuff.append("xyz");
        System.out.println(strBuff);
        strBuff.deleteCharAt(5);
        System.out.println(strBuff);
        strBuff.delete(2,5);
        System.out.println(strBuff);
        strBuff.replace(2,3,"x");
        System.out.println(strBuff);
        strBuff.reverse();
        System.out.println(strBuff);
    }
}
