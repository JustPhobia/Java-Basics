package Module1.Arrays;

public class ArrNoDupes_Exe {

    public static void main(String[] args) {

        int[] arrDupes = {
                42, 317, 89, 504, 217, 89, 742, 18, 317, 960,
                154, 601, 42, 888, 271, 504, 39, 712, 85, 317,
                460, 999, 154, 23, 601, 742, 318, 77, 504, 89,
                910, 65, 271, 460, 888, 154, 317, 12, 742, 504,
                39, 601, 88, 217, 960, 65, 504, 271, 89, 317,
                712, 42, 888, 154, 999, 77, 318, 601, 23, 460,
                504, 39, 742, 217, 65, 317, 154, 888, 960, 89,
                271, 601, 42, 712, 504, 77, 318, 460, 154, 999,
                23, 888, 65, 317, 742, 39, 601, 89, 217, 504
        };

        int k = 0, redNum=0,dupes=0;

        System.out.println("Here is your duplicates array:");

        for (int i = 0; i < arrDupes.length; i++) {
            System.out.print(arrDupes[i] + " ; ");
            k++;

            if (k == 10) {
                System.out.println();
                k = 0;
            }
        }




        System.out.println("\nLength: "+arrDupes.length);
        //=====================================================================================================================================================
        int size = arrDupes.length;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arrDupes[i] == arrDupes[j]) {
                    dupes++;

                    // shift left from j
                    for (int n = j; n < size - 1; n++) {
                        arrDupes[n] = arrDupes[n + 1];
                    }

                    size--;
                    j--;
                }
            }
        }
        //=====================================================================================================================================================





        System.out.println("Your new array without duplicates:");
        for (int i = 0; i < arrDupes.length-dupes; i++) {
            System.out.print(arrDupes[i] + " ; ");
            k++;

            if (k == 10) {
                System.out.println();
                k = 0;
            }
        }
        System.out.println("Length: "+(arrDupes.length-dupes));
    }
}
