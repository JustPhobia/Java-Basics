package Module1.FunBeginnerProjects;

import java.util.Random;
import java.util.Scanner;

public class MatchingNumber_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean uPlaying = true,uFalseGuess=false;
        String firstGuess,secGuess;
        int TrueCount = 0,randRow, randCol, rowFirstGuess = 0, rowSecGuess = 0, colFirstGuess = 0, colSecGuess = 0;
        int[][] arrNumbers = {
                {1, 2, 3, 4, 5, 6},//1
                {1, 2, 3, 4, 5, 6},//2
                {7, 8, 9, 10, 11, 12},//3
                {7, 8, 9, 10, 11, 12},//4
                {13, 14, 15, 16, 17, 18,},//5
                {13, 14, 15, 16, 17, 18,},//6
        };
        String[][] arrMap = {
                {"X", "X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X", "X"}
        };
        int randRowNew, randColNew;
        for (int i = 0; i < 18; i++) {
            randRowNew = rand.nextInt(0, 6);
            randColNew = rand.nextInt(0, 6);
            randRow = rand.nextInt(0, 6);
            randCol = rand.nextInt(0, 6);
            int temp = arrNumbers[randRowNew][randColNew];
            arrNumbers[randRowNew][randColNew] = arrNumbers[randRow][randCol];
            arrNumbers[randRow][randCol] = temp;
        }
        /*for (int i = 0; i < 2; i++) {
            if (i > 0) {
                i = 5;
            }
            randRowNew = rand.nextInt(0, 6);
            randColNew = rand.nextInt(0, 6);
            int temp = arrNumbers[randRowNew][randColNew];
            arrNumbers[i][i] = arrNumbers[randColNew][randRowNew];
            arrNumbers[randColNew][randRowNew] = temp;
        }*/

        System.out.println("    0\t1\t2\t3\t4\t5");
        System.out.println("    __\t__\t__\t__\t__\t__");
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.print(i + " |\t");
            for (int j = 0; j < arrNumbers[i].length; j++) {
                System.out.print(arrNumbers[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("    ‾‾\t‾‾\t‾‾\t‾‾\t‾‾\t‾‾");
        System.out.println("    0\t1\t2\t3\t4\t5");
        System.out.println("\n");

        while (uPlaying) {
            //Printing
            System.out.println("\n");
            System.out.println("   0\t1\t2\t3\t4\t5");
            System.out.println("    __\t__\t__\t__\t__\t__");
            for (int i = 0; i < arrMap.length; i++) {
                System.out.print(i + " |\t");
                for (int j = 0; j < arrMap[i].length; j++) {
                    System.out.print(arrMap[i][j] + "\t");
                }
                System.out.print("| "+ i);
                System.out.println();
            }
            System.out.println("    ‾‾\t‾‾\t‾‾\t‾‾\t‾‾\t‾‾");
            System.out.println("    0\t1\t2\t3\t4\t5");

            if (uFalseGuess){
                System.out.println("Your last guess was already selected, try again");
                uFalseGuess = false;
            }
            //Storing
            uFalseGuess = true;
            do {
                System.out.print("Insert Guess (xy): ");
                firstGuess = sc.nextLine();
                if (firstGuess.matches("^[0-5]{2}$")) {
                //You need to apply row and column, create error
                    rowFirstGuess = Character.getNumericValue(firstGuess.charAt(0));
                    colFirstGuess = Character.getNumericValue(firstGuess.charAt(1));
                    uFalseGuess = true;
                }else{
                    System.out.println("\nYour last guess was out out of bounds, try again.");
                    uFalseGuess = false;
                }
            }while (!uFalseGuess);
            uFalseGuess=false;
            //The first part of the game
            if (!arrMap[rowFirstGuess][colFirstGuess].equals("X")){
                uFalseGuess = true;
                continue;
            }
            arrMap[rowFirstGuess][colFirstGuess] = String.valueOf(arrNumbers[rowFirstGuess][colFirstGuess]);
            //Printing again

            System.out.println("    0\t1\t2\t3\t4\t5");
            System.out.println("    __\t__\t__\t__\t__\t__");
            for (int i = 0; i < arrMap.length; i++) {
                System.out.print(i + " |\t");
                for (int j = 0; j < arrMap[i].length; j++) {
                    System.out.print(arrMap[i][j] + "\t");
                }
                System.out.print("| "+ i);
                System.out.println();
            }
            System.out.println("    ‾‾\t‾‾\t‾‾\t‾‾\t‾‾\t‾‾");
            System.out.println("    0\t1\t2\t3\t4\t5");

            //The matching guess:
            uFalseGuess = true;
            do {
                System.out.print("Insert Guess (xy): ");
                secGuess = sc.nextLine();
                if (secGuess.matches("^[0-5]{2}$")) {
                    //You need to apply row and column, create error
                    rowSecGuess = Character.getNumericValue((secGuess.charAt(0)));
                    colSecGuess = Character.getNumericValue(secGuess.charAt(1));
                    uFalseGuess = true;
                }else{
                    System.out.println("\nYour last guess was out out of bounds, try again.");
                    uFalseGuess = false;
                }
            }while (!uFalseGuess);
            uFalseGuess=false;

            if (colSecGuess ==colFirstGuess && rowSecGuess ==rowFirstGuess){
                System.out.println("Your last guess was already selected, try again");
                arrMap[rowFirstGuess][colFirstGuess] = "X";
                uFalseGuess = true;
                continue;
            }
            arrMap[rowSecGuess][colSecGuess] = String.valueOf(arrNumbers[rowSecGuess][colSecGuess]);

            if (arrMap[rowFirstGuess][colFirstGuess].equals(arrMap[rowSecGuess][colSecGuess])){
                System.out.println("You got it! Good job!");
                TrueCount++;
            }else{
                arrMap[rowFirstGuess][colFirstGuess] = "X";
                arrMap[rowSecGuess][colSecGuess] = "X";
            }
            if (TrueCount == 18) {
                uPlaying = false;
            }
        }
        System.out.println("Well played! You have a good memory and it shows! YOu beat the challenge :D");
    }
}
