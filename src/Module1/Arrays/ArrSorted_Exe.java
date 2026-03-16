package Module1.Arrays;

import java.util.Arrays;

public class ArrSorted_Exe {
    public static void main(String[] args) {
        int[] arrSort = {842,408 , 593, 276, 91, 734, 17};

        int tempStore =0,k=0;
        System.out.println("Here is your unsorted array:");
        for  (int i = 0; i < arrSort.length-1; i++) {
            k++;
            if (k == 10) {
                System.out.println("\n");
                k=0;
            }
                System.out.print(arrSort[i] + " ; ");

        }
        k=0;
        System.out.println("\n");
        for (int i = 0; i < arrSort.length - 1; i++) {

            for (int j = 0; j < arrSort.length - 1 - i; j++) {

                if (arrSort[j] > arrSort[j + 1]) {
                    tempStore = arrSort[j];
                    arrSort[j] = arrSort[j + 1];
                    arrSort[j + 1] = tempStore;
                }
            }
        }
        arrSort = Arrays.copyOf(arrSort,10);
        System.out.println("Here is your sorted array:");
        for (int i = 0; i < arrSort.length-1; i++) {
            k++;
            if (k == 10) {
                System.out.println("\n");
                k=0;
            }
            System.out.print(arrSort[i] + " ; ");
        }
    }
}
