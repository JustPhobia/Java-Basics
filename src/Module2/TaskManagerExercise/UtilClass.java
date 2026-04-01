package Module2.TaskManagerExercise;

import java.util.Scanner;

public class UtilClass {
    private Scanner sc;
    public UtilClass(Scanner sc) {
        this.sc = sc;
    }

    public String getInputString(String regex) {
        String inputString;
        boolean flag = false;
        do {
            if (flag) {
                System.out.println("Invalid input. Please try again.");
            }
            inputString = sc.nextLine().trim();
            flag = true;
        } while (!inputString.matches(regex));
        return inputString;
    }

    public char getInputChar() {
        char first;
        String choice;
        choice = getInputString("^[A-Za-z]$");
        first = Character.toLowerCase(choice.charAt(0));
        return first;
    }

    public char getInputCharYesNo() {
        boolean error = false;
        char first = ' ';
        String choice;
        do {
            if (error) {
                System.out.println("Invalid input. Please try again.");
            }
            choice = getInputString("^(?i)(yes|no|y|n)$").trim();

            if (choice.isEmpty()) {
                continue;
            }
            first = Character.toLowerCase(choice.charAt(0));
            error = true;
        } while (first != 'y' && first != 'n');

        return first;
    }


    public int getIndexInt(int max) {
        int choice = -1;
        boolean valid = false;

        while (!valid) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice >= 1 && choice <= max) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and " + max + ".");
                sc.next();
            }
        }
        return choice-1;
    }


    public int getInputInt(int min, int max) {
        int choice = -1;
        boolean valid = false;

        while (!valid) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice >= min && choice <= max) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and " + max + ".");
                sc.next();
            }
        }
        return choice;
    }
}