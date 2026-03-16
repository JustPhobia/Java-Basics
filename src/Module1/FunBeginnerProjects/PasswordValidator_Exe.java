package Module1.FunBeginnerProjects;

import java.util.Scanner;

public class PasswordValidator_Exe {
    //Please note use of bad coding practice such as no run() method, all code is together, DRY principle not followed
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uAgain = true,uID10T = true, uLength=false, uSpecChar=false, uNum=false, uCase=false, uCorrect=false, uIncorrect;
        String uPassword;
        while (uAgain){
                uID10T = true;
                uIncorrect = false;
                System.out.println("Your password should contain 7 characters minimum, \none special character and a number");
                System.out.println("Please insert the password you would like to use: ");
                while (!uCorrect) {
                    if (uIncorrect){
                        System.out.println("Your password was incorrect, please ensure you \nfollow the rules.");
                        System.out.println("Your password should contain 7 characters minimum, \none special character and a number");
                        System.out.println("Please insert the password you would like to use: ");
                    }
                    uPassword = sc.nextLine();

                    if (uPassword.matches(".*[0-9].*")) {
                        uNum = true;
                    }

                    if (uPassword.matches(".*[A-Z].*")) {
                        uCase = true;
                    }
                    if (uPassword.matches(".*[^a-zA-Z0-9].*")) {
                        uSpecChar = true;
                    }
                    if (uPassword.length() > 6) {
                        uLength = true;
                    }
                    if (uNum && uCase && uSpecChar && uLength) {
                        uCorrect=true;
                        System.out.println("Password is correct.");
                    } else {
                        System.out.println("Please ensure you followed the instructions correctly");
                        uIncorrect=true;
                    }
                }
                System.out.println("Again?");
                char uChoice = sc.nextLine().toLowerCase().charAt(0);
                if (uChoice == 'n') {
                    uAgain = false;
                    uID10T = false;
                } else if (uChoice == 'y') {
                    uID10T = false;
                }
            }
        }
    }
