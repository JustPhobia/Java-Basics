package Module1.FunBeginnerProjects;

import java.util.Scanner;
public class testing_Roman_exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder roman = new StringBuilder();
        boolean digits=false, tens=false, half_cents=false, hundreds=false;
        int PlaceHolder=0, tensCount=0;

        for (int i = 1; i <= 110; i++) {
            roman.delete(0, roman.length());
            hundreds = false;
            half_cents = false;
            tens = false;
            digits = false;
            PlaceHolder = i;

            if (i == 110) {
                System.out.println("C X");
                continue;  // ← Add this
            } else if (i > 100) {
                hundreds = true;
                digits = true;
            } else if (i == 100) {
                System.out.println("C");
                continue;  // ← Add this
            } else if (i > 60) {
                half_cents = true;
                tens = true;
                digits = true;
            } else if (i > 50) {
                half_cents = true;
                digits = true;
            } else if (i == 50) {
                System.out.println("L");
                continue;  // ← Add this
            } else if (i >= 10) {
                tens = true;
                digits = true;
            } else {
                digits = true;
            }

            if (digits) {
                if (hundreds) {
                    PlaceHolder -= 100;
                }
                if (half_cents) {
                    PlaceHolder -= 50;
                }
                if (tens) {
                    tensCount = PlaceHolder / 10;
                    PlaceHolder -= (PlaceHolder / 10) * 10;
                }
                switch (PlaceHolder) {
                    case 1: roman.append("I "); break;
                    case 2: roman.append("II "); break;
                    case 3: roman.append("III "); break;
                    case 4: roman.append("IV "); break;
                    case 5: roman.append("V "); break;
                    case 6: roman.append("VI "); break;
                    case 7: roman.append("VII "); break;
                    case 8: roman.append("VIII "); break;
                    case 9: roman.append("IX "); break;
                    default: break;
                }
            }

            if (tens) {
                for (int j = 1; j <= tensCount; j++) {
                    roman.insert(0, "X ");
                }
            }

            if (half_cents) {
                roman.insert(0, "L ");
            }

            if (hundreds) {
                roman.insert(0, "C ");
            }

            System.out.println(roman);
        }
    }
}