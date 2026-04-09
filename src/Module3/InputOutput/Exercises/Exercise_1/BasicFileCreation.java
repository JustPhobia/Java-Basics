package Module3.InputOutput.Exercises.Exercise_1;

import Module1.BasicJava.Fibonacci_Exe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BasicFileCreation {
    public static void main(String[] args) {
        new BasicFileCreation().run();
    }
    public void run(){
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the name of the file:");
            String fileName = sc.nextLine();
            File NewFile = new File("C:\\VZAP\\Practice Projects\\VZap Activities\\Fun VZAP\\src\\Module3\\InputOutput\\Exercises\\Exercise_1\\"+fileName+".txt").toPath().toFile();
        NewFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
