package Module1.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Arr2D {
    public static void main(String[] args) {
        //Displaying it
        int[] oneDimension = new int[10];
        int[][] twoDimension = new int[10][10];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("    " + 0 + " " + 1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6 + " " + 7 + " " + 8 + " " + 9);
        System.out.println("   --------------------");
        for (int i = 0; i < twoDimension.length; i++) {
            System.out.print((i) + " | ");
            for (int j = 0; j < oneDimension.length; j++) {
                oneDimension[j] = rand.nextInt(1, 9);
            }
            for (int j = 0; j < oneDimension.length; j++) {
                twoDimension[i][j] = oneDimension[j];
                System.out.print(twoDimension[i][j] + " ");
            }
            System.out.println();
        }
        ;
        System.out.println("\n");

        //Sum of rows
        System.out.println("The sum of Rows:");
        for (int[] row : twoDimension) {
            int rowSum = 0;
            for (int col : row) {
                rowSum += col;
                System.out.print(col + " ");
            }
            System.out.println("Row sum is equal to :" + rowSum);
        }

        //sum of cols

        System.out.println("The sum of Columns: ");
        for (int i = 0; i < twoDimension.length; i++) {
            int colSum = 0;
            for (int[] ints : twoDimension) {
                colSum += ints[i];
                System.out.print(ints[i] + " ");
            }
            System.out.println("Column Sum: " + colSum);
        }

        //Maximum
        int max = 0;
        for (int[] row : twoDimension) {
            for (int col : row) {
                if (max < col) {
                    max = col;
                }
            }
        }
        System.out.println("The maximum in the 2D array is: " + max);


        //Minimum
        int min = 10;
        for (int[] row : twoDimension) {
            for (int col : row) {
                if (min > col) {
                    min = col;
                }
            }
        }
        System.out.println("The maximum in the 2D array is: " + min);

        //Transpose
        System.out.println("-");
        for (int i = 0; i < twoDimension.length; i++) {
            for (int j = i; j < twoDimension.length; j++) {
                int temp = twoDimension[j][i];
                twoDimension[j][i] = twoDimension[i][j];
                twoDimension[i][j] = temp;
            }
        }
        count = 0;
        for (int[] row : twoDimension) {
            count += 1;
            System.out.print(count + " : ");
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
        System.out.println("\n\n");

        //Multiplying matrices
        System.out.println("Multiplying Matrices: \n");
        System.out.println("    " + 0 + " " + 1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6 + " " + 7 + " " + 8 + " " + 9);
        System.out.println("   --------------------");
        for (int i = 0; i < twoDimension.length; i++) {
            System.out.print((i) + " | ");
            for (int j = 0; j < oneDimension.length; j++) {
                twoDimension[i][j] = oneDimension[j];
                System.out.print(twoDimension[i][j] + " ");
            }
            System.out.println();
        }
        ;
        System.out.println("\n");

        int[][] twoDTwo = new int[10][10], productTwoD = new int[10][10];
        System.out.println("    " + 0 + " " + 1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6 + " " + 7 + " " + 8 + " " + 9);
        System.out.println("   --------------------");
        for (int i = 0; i < twoDTwo.length; i++) {
            System.out.print((i) + " | ");
            for (int j = 0; j < oneDimension.length; j++) {
                oneDimension[j] = rand.nextInt(1, 9);
            }
            for (int j = 0; j < twoDTwo.length; j++) {
                twoDTwo[i][j] = oneDimension[j];
                System.out.print(twoDTwo[i][j] + " ");
            }
            System.out.println();
        }
        ;
        System.out.println("\n");

        for (int i = 0; i < twoDTwo.length; i++) {
            for (int j = 0; j < twoDTwo.length; j++) {
                productTwoD[i][j] = twoDimension[i][j] * twoDTwo[i][j];
            }
        }
        count = -1;
        for (int[] row : productTwoD) {
            count += 1;
            System.out.print(count + " : ");
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
        System.out.println("\n\n");

        //Finding neigbours
        System.out.println("Finding neighbours: \n");
        System.out.println("    " + 0 + " " + 1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6 + " " + 7 + " " + 8 + " " + 9);
        System.out.println("   --------------------");
        for (int i = 0; i < twoDimension.length; i++) {
            System.out.print((i) + " | ");
            for (int j = 0; j < oneDimension.length; j++) {
                twoDimension[i][j] = oneDimension[j];
                System.out.print(twoDimension[i][j] + " ");
            }
            System.out.println();
        }
        ;
        System.out.println("\n");
        boolean again = true;
        while (again) {
            int rValue = 0, lValue = 0, uValue = 0, dValue = 0;


            System.out.print("Insert Row: ");
            int userRow = sc.nextInt();
            System.out.print("\nInsert Column: ");
            int userCol = sc.nextInt();
            if (userRow == 0 && userCol == 0) {
                dValue = twoDimension[userRow + 1][userCol];
                rValue = twoDimension[userRow][userCol + 1];

                System.out.println("  -");
                System.out.println("- " + twoDimension[userRow][userCol] + " " + rValue);
                System.out.println("  " + dValue);
            } else if (userRow == 0 && userCol > 0 && userCol < 9) {
                lValue = twoDimension[userRow][userCol - 1];
                rValue = twoDimension[userRow][userCol + 1];
                dValue = twoDimension[userRow + 1][userCol];

                System.out.println("  -");
                System.out.println(lValue + " " + twoDimension[userRow][userCol] + " " + rValue);
                System.out.println("  " + dValue);
            } else if (userRow > 0 && userCol == 0 && userRow != 9) {
                rValue = twoDimension[userRow][userCol + 1];
                uValue = twoDimension[userRow - 1][userCol];
                dValue = twoDimension[userRow + 1][userCol];

                System.out.println("   " + uValue);
                System.out.println(" - " + twoDimension[userRow][userCol] + " " + rValue);
                System.out.println("   " + dValue);
            } else if (userRow == 9 && userCol == 0) {
                uValue = twoDimension[userRow - 1][userCol];
                rValue = twoDimension[userRow][userCol + 1];
                System.out.println("   " + uValue);
                System.out.println(" - " + twoDimension[userRow][userCol] + " " + rValue);
                System.out.println("   -");
            } else if (userRow == 0 && userCol == 9) {
                lValue = twoDimension[userRow][userCol - 1];
                dValue = twoDimension[userRow + 1][userCol];

                System.out.println("  -");
                System.out.println(lValue + " " + twoDimension[userRow][userCol] + " -");
                System.out.println("  " + dValue);
            } else if (userRow > 0 && userCol == 9 && userRow != 9) {
                uValue = twoDimension[userRow - 1][userCol];
                dValue = twoDimension[userRow + 1][userCol];
                lValue = twoDimension[userRow][userCol - 1];

                System.out.println("  " + uValue);
                System.out.println(lValue + " " + twoDimension[userRow][userCol] + " -");
                System.out.println("  " + dValue);
            } else if (userRow == 9 && userCol == 9) {
                lValue = twoDimension[userRow][userCol - 1];
                uValue = twoDimension[userRow - 1][userCol];
                System.out.println("  " + uValue);
                System.out.println(lValue + " " + twoDimension[userRow][userCol] + " -");
                System.out.println("  -");
            } else {
                uValue = twoDimension[userRow - 1][userCol];
                lValue = twoDimension[userRow][userCol - 1];
                dValue = twoDimension[userRow + 1][userCol];
                rValue = twoDimension[userRow][userCol + 1];
                System.out.println("  " + uValue);
                System.out.println(lValue + " " + twoDimension[userRow][userCol] + " " + rValue);
                System.out.println("  " + dValue);
            }
            System.out.println("Play again? Y/N ");
            char uChoice = sc.next().toLowerCase().charAt(0);
            if (uChoice == 'n') {
                again = false;
            }
        }
        //Counting
        while (!again) {
            System.out.print("Insert the number you would like to count: ");
            int uNum = sc.nextInt();
            int tCount = 0;
            for (int[] row : twoDimension) {
                for (int col : row) {
                    if (uNum == col) {
                        tCount++;
                    }
                }
            }
            System.out.println("That number appears " + tCount + " times!");

            System.out.println("Play again? Y/N ");
            char uChoice = sc.next().toLowerCase().charAt(0);
            if (uChoice == 'n') {
                again = true;
            }
        }
        //Sorting
        int[][] arr2D = new int[10][10];

        // Fill array
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = rand.nextInt(9) + 1;
            }
        }

        // Display UNSORTED
        System.out.println("Unsorted 2D Array:\n");

        System.out.print("    ");
        for (int h = 0; h < 10; h++) {
            System.out.print(h + " ");
        }
        System.out.println("\n   --------------------");

        for (int i = 0; i < arr2D.length; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        // 🔥 Bubble sort each row
        for (int row = 0; row < arr2D.length; row++) {

            for (int i = 0; i < arr2D[row].length - 1; i++) {

                for (int col = 0; col < arr2D[row].length - 1 - i; col++) {

                    if (arr2D[row][col] > arr2D[row][col + 1]) {

                        int temp = arr2D[row][col];
                        arr2D[row][col] = arr2D[row][col + 1];
                        arr2D[row][col + 1] = temp;
                    }
                }
            }
        }

        // Display SORTED
        System.out.println("\nSorted array:\n");

        System.out.print("    ");
        for (int h = 0; h < 10; h++) {
            System.out.print(h + " ");
        }
        System.out.println("\n   --------------------");

        for (int i = 0; i < arr2D.length; i++) {
            System.out.print(i + " | ");
            for (int col : arr2D[i]) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }
}

