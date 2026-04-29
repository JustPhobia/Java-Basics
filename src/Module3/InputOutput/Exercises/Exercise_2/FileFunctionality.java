package Module3.InputOutput.Exercises.Exercise_2;

import java.io.*;
import java.util.Scanner;

public class FileFunctionality {

    public void run () {
        Scanner sc = new Scanner(System.in);
        File file;
        String filePath;
        boolean run = true;
        while (run) {
            System.out.println("""
                    ---------------------------
                    |      === Menu ===
                    ---------------------------
                    | 1: Read file contentis
                    | 2: Write text into a file
                    | 3: Copy File To Other File
                    | 4: Exit Program
                    ----------------------------\s""");
            System.out.println("Please input your choice:");
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("Please input the path of the file you wish to use: ");
                    filePath = sc.nextLine();
                    if ((file = readFile(filePath)) != null) {
                        System.out.println("Successfully read " + file.getName());
                        break;
                    } else {
                        System.out.println("An error occured, please check your file path.");
                    }
                case "2":
                    System.out.println("Please input the path of the file you wish to create");
                    filePath = sc.nextLine();
                    if ((file = writeToFile(sc, filePath)) != null) {
                        System.out.println("Successfully written to file" + file.getName());
                        readFile(filePath);
                        break;
                    } else {
                        System.out.println("An error occurred, please ensure your file path is correct.");
                    }
                case "3":
                    System.out.println("Please input the path of the file you wish to copy from: ");
                    filePath = sc.nextLine();
                    File copiedFile;
                    if ((copiedFile = copyFile(sc, filePath)) != null) {
                        readFile(filePath);
                        readFile(copiedFile.getAbsolutePath());
                    }
                    break;
                case "4":
                    System.out.println("Have a good day!");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public File copyFile(Scanner sc, String filePath){
        File copyToFilePath;
        File file = new File(filePath);
        String line;

        System.out.println("Please input the path of the file you wish to copy to: ");
        copyToFilePath = new File( sc.nextLine());

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
            PrintWriter printer = new PrintWriter(copyToFilePath)
        ){
            while ((line = reader.readLine()) != null){
                printer.println(line);
            }
            return  copyToFilePath;
        }catch (FileNotFoundException e){
            System.out.println("Error 2: File not found.");
        }catch (IOException e){
            System.out.println("An I/O Exception occurred when reading file.");
        }
        return null;
    }

    private File writeToFile(Scanner sc, String filePath){
        String message;
        String[] Lines;
        File file = new File(filePath);

        System.out.println("What would you like to write into this file: ");
        message = sc.nextLine();
        Lines = message.split(" ");
        try (PrintWriter printer = new PrintWriter(new FileWriter(file))){
        for(String line : Lines){
            printer.println(line);
        }
        return file;
        }catch (IOException e){
            System.out.println("An error occurred, please check your file path.");
        }
        return null;
    }

    private File readFile(String filePath){
        String line;
        File file = new File(filePath);

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t==="+file.getName()+"===");
            System.out.println("-------------------------------------------------------");
            while ((line = reader.readLine()) != null){
                System.out.println("| "+line);
            }
            System.out.println("-------------------------------------------------------");
            return null;
        }catch (FileNotFoundException e){
            System.out.println("Error 2: File not found.");
            return null;
        }catch (IOException e){
            System.out.println("An I/O Exception occurred when reading file.");
            return null;
        }
    }

    public static void main(String[] args) {
        new FileFunctionality().run();
    }
}
