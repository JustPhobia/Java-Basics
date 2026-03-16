package Module2.TaskManagerExercise;

import java.util.Scanner;

public class UtilClass {
    private Scanner sc = new Scanner(System.in);


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
        int choice = 0;
        boolean error = false;
        do {
            if (error) {
                System.out.println("Index range is between 1 and " + max);
            }
            choice = getInputInt();
            error = true;
        } while (choice > max || choice < 0);
        return choice;
    }

    public int getInputInt() {
        int input = sc.nextInt();
        sc.nextLine();
        return input;
    }

    public double getInputDouble() {
        double input = sc.nextDouble();
        sc.nextLine();
        return input;

    }
}
