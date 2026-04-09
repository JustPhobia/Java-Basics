package Module3.InputOutput.Exercises.Exercise_1;

import java.io.*;
import java.util.Scanner;

public class CopyContents {
    public static void main(String[] args) {
        new CopyContents().run();
    }

    public void run(){
        boolean run = true;

        try (Scanner sc = new Scanner(System.in)) {
            while (run) {
                System.out.println("Would you like to copy to a new file?" +
                        "\n1: Yes" +
                        "\n2: No");
                    switch (sc.nextLine()) {
                        case "1":
                            copyPaste(sc);
                            break;
                        case "2":
                            run = false;
                            break;
                        default:
                            System.out.println("Invalid input");
                    }

            }
        }
    }
    public void copyPaste(Scanner sc) {
        boolean correct = true;
        String copyPath;
        String pastePath;
        String line;
        StringBuilder pasteContent = new StringBuilder();

        try {
            while (correct) {
                System.out.print("Enter the path of the file you wish to copy contents from: ");

                copyPath = sc.nextLine();

                pasteContent.append(copy(copyPath));
                System.out.println();
                System.out.println("Is this correct?" +
                        "\n1: Yes" +
                        "\n2: No");

                switch (sc.nextLine()) {
                    case "1":
                        System.out.print("Enter the path of the file you wish to paste contents to: ");
                        pastePath = sc.nextLine();
                        paste(pastePath, pasteContent);
                        correct = false;
                        break;

                    case "2":
                        System.out.println("Retry, if problem continues to occur ensure the path is correct.");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }


    public StringBuilder copy(String copyPath) {
        StringBuilder pasteContent = new StringBuilder();

        try (BufferedReader read = new BufferedReader(new FileReader(copyPath))) {
            System.out.println("The file contains the following:\n");
            String line;
            while ((line = read.readLine()) != null) {
                System.out.println(line);
                pasteContent.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return pasteContent;
    }

    public void paste(String pastePath, StringBuilder pasteContent) throws IOException {
        String line;
        try (PrintWriter write = new PrintWriter(new FileWriter(pastePath, true))) {
            write.print(pasteContent);
        }

        try (BufferedReader read = new BufferedReader(new FileReader(pastePath))) {
            System.out.println("The file now contains the following:\n");
            while ((line = read.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

}
