package Module3.InputOutput.CopyDirectoryProject;

import java.io.File;
import java.util.Scanner;


public class CopyFilesImpl {


    public static void main(String[] args) {
        new CopyFilesImpl().run();
    }

    public void run() {
        File srcDirectory;
        File destDirectory;
        boolean exit = false;
        String tempPath;

        try (Scanner sc = new Scanner(System.in)) {
            while (!exit) {
                System.out.println("===Directory/File Copier===" +
                        "\n---Menu---" +
                        "\n1. Select directories" +
                        "\n2. Exit" +
                        "\n----------");
                System.out.print("Please enter your choice (1|2): ");

                switch (sc.nextLine()) {
                    case "1":
                        System.out.println("Please enter the path you want to copy:");
                        tempPath = validatePath(sc);
                        if (tempPath.isEmpty()) {
                            break;
                        }
                        srcDirectory = new File(tempPath);
                        System.out.println("Now please enter the path you want to copy to:");
                        tempPath =validatePath(sc);
                        if (tempPath.isEmpty()) {
                            break;
                        }

                        destDirectory = new File(tempPath);
                        CopyFiles copyFile = new CopyFiles(srcDirectory, destDirectory);
                        if (!copyFile.copyFile()){
                            System.out.println("There was an error copying directory/file. Please ensure all information is valid");
                        }
                        break;
                    case "2":
                        exit = true;
                        break;
                }
            }
        }
    }

    private String validatePath(Scanner sc){
        String pathRegex = "^(?:[a-zA-Z]:\\\\(?:[^\\\\/:*?\"<>|\\r\\n]+\\\\)*[^\\\\/:*?\"<>|\\r\\n]*|(?:/[^/]+)+/?)$";
        String tempFile ="";
        boolean id10t = false;
        while (!tempFile.matches(pathRegex)){
            if (id10t){
                System.out.println("Please insert a valid file path");
                System.out.println("Would you like to go back to menu: " +
                        "\n1. Yes" +
                        "\n2. No");
                switch (sc.nextLine()){
                    case "1": break;
                    case "2":
                        return "";
                    default: break;
                }
            }
            tempFile= sc.nextLine();
            id10t = true;

        }
        if (!tempFile.isEmpty()){
            System.out.println("File path valid!");
        }
        return tempFile;
    }


}
