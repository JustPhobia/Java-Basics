package Module1.Strings;

import java.util.Scanner;

public class StringBuilder_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder strBuild= new StringBuilder();
        System.out.println("Please insert string: ");
        strBuild.append(sc.nextLine());
        strBuild.reverse();
        System.out.println(strBuild);

        System.out.println("Please input 3 strings: ");
        String user1=sc.nextLine(), user2 = sc.nextLine(), user3 = sc.nextLine();
        strBuild.append(user1).append(user2).append(user3);
        System.out.println(strBuild);

        System.out.println("Perfect, now what string would you like to insert?");
        String userInsert = sc.nextLine();
        System.out.println("Please choose the numbers you want to replace your new string into: ");
        System.out.print("Start:");
        int userStart = sc.nextInt();
        System.out.print("End:");
        int userEnd = sc.nextInt();
        strBuild.replace(userStart, userEnd, userInsert);
        System.out.println(strBuild);


    }
}
