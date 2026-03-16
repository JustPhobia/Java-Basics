package Module1.Arrays;

import java.util.Scanner;

public class ArrReversed_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k = -1;
        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arrReverse = new int[n];
        for (int i = 0; i < n; i++) {
            arrReverse[i] = sc.nextInt();
        }
        System.out.println("Your current array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arrReverse[i] + " ");
        }
        System.out.println("Your reversed array is: ");
        for (int i = (arrReverse.length-1); i > (arrReverse.length/2); i--){
            k++;
            int placeHolder = arrReverse[i];
            arrReverse[i] = arrReverse[k];
            arrReverse[k] = placeHolder;
        }
        for (int i = 0; i < arrReverse.length; i++) {
            System.out.println(arrReverse[i]);
        }

    }
}
