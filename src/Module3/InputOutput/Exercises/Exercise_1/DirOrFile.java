package Module3.InputOutput.Exercises.Exercise_1;

import java.io.File;
import java.util.Scanner;

//User inputs a path and sees whether it is a directory or file.
public class DirOrFile {
    public void run(){
        boolean run = true;
        try (Scanner sc = new Scanner(System.in)) {
            while (run) {
                System.out.println("Would you like to enter a new path?" +
                        "\n1: Yes" +
                        "\n2: No");
                switch (sc.nextLine()) {
                    case "1":
                        pathCheck(sc);
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
    public void pathCheck(Scanner sc){
        System.out.print("Enter the path you wish to check: ");
        File file = new File(sc.nextLine());
        if (!file.exists()) {
            System.out.println("The path you entered is invalid");
        } else {
            if (file.isFile()) {
                System.out.println("The path you entered is a file");
            } else {
                System.out.println("The path you entered is a directory");
            }
        }
    }

    public static void main(String[] args) {
        new DirOrFile().run();
    }
}
