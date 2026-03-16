package Module1.Arrays;

import java.util.Scanner;

public class Average_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean  numNumbers = true;
        int sum = 0,k=0;

        while(numNumbers) {
            k++;
            System.out.print("Enter a number: ");
            sum += sc.nextInt();
            System.out.print("Another number? (Y/N): ");
            char ch = sc.nextLine().toLowerCase().charAt(0);
            if(ch != 'n') {
                numNumbers = false;
            }
        }
        if (k!=6) {
            System.out.println("You need 6 numbers!");
        }else {
            System.out.println("Average is " + sum / 6d);
        }
    }
}
