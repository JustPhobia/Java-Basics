package Module1.BasicJava;

import java.util.Scanner;

public class Hangman_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hangman hanged = new Hangman();
        boolean uAgain = true, uID10T = true, uCorrect = true,uChanged = false;
        String uWord, uGuess;
        char uCharacter;
        int i, k;
        StringBuilder cGenerated_Word = new StringBuilder();
        while (uAgain) {
            uID10T = true;
            System.out.println("What word would you like them to guess?");
            uWord = sc.nextLine();
            /*for (i =0; i <15;i++){
                System.out.println("\n");
            }*/
            System.out.println("Are you ready for the game to start? \nGreat lets see what you're ready to guess!");
            for (i = 0; i < uWord.length(); i++) {
                cGenerated_Word.append("_");
            }
            for (i = 0; i < 8; i++) {
                if (i == 1) {
                    uCorrect = true;
                    uChanged = false;
                    while (uCorrect) {
                        System.out.println(hanged._2);
                        System.out.println("Here is your clue: \n" + cGenerated_Word);
                        System.out.println("Please enter \"f\" if you want to enter full word, if not enter \"c\"");
                        if (sc.nextLine().charAt(0) == 'f') {
                            uGuess = sc.nextLine();
                            if (uGuess.equals(uWord)) {
                                System.out.println("That is correct, good job! The word was: " + uWord);
                            } else {
                                System.out.println("That is incorrect.");
                                uCorrect = false;
                            }
                        } else {
                            uCharacter = sc.nextLine().charAt(0);
                            for (k = 0; k < uWord.length(); k++) {
                                if (uWord.charAt(k) == uCharacter) {
                                    cGenerated_Word.replace(k, k + 1, "" + uCharacter);
                                    uChanged = true;
                                }
                            }
                            if (!uChanged) {
                                uCorrect = false;
                            }
                        }
                    }
                } else if (i == 2) {
                    uCorrect = true;
                    uChanged = false;
                    while (uCorrect) {
                        System.out.println(hanged._2);
                        System.out.println("Here is your clue: \n" + cGenerated_Word);
                        System.out.println("Please enter \"f\" if you want to enter full word, if not enter \"c\"");
                        if (sc.nextLine().charAt(0) == 'f') {
                            uGuess = sc.nextLine();
                            if (uGuess.equals(uWord)) {
                                System.out.println("That is correct, good job! The word was: " + uWord);
                            } else {
                                System.out.println("That is incorrect.");
                                uCorrect = false;
                            }
                        } else {
                            uCharacter = sc.nextLine().charAt(0);
                            for (k = 0; k < uWord.length(); k++) {
                                if (uWord.charAt(k) == uCharacter) {
                                    cGenerated_Word.replace(k, k + 1, "" + uCharacter);
                                    uChanged = true;
                                }
                            }
                            if (!uChanged) {
                                uCorrect = false;
                            }
                        }
                    }
                } else if (i == 3) {//First wrong answer
                    uCorrect = true;
                    uChanged = false;
                    while (uCorrect) {
                        System.out.println(hanged._3);
                        System.out.println("Here is your clue: \n" + cGenerated_Word);
                        System.out.println("Please enter \"f\" if you want to enter full word, if not enter \"c\"");
                        if (sc.nextLine().charAt(0) == 'f') {
                            uGuess = sc.nextLine();
                            if (uGuess.equals(uWord)) {
                                System.out.println("That is correct, good job! The word was: " + uWord);
                            } else {
                                System.out.println("That is incorrect.");
                                uCorrect = false;
                            }
                        } else {
                            uCharacter = sc.nextLine().charAt(0);
                            for (k = 0; k < uWord.length(); k++) {
                                if (uWord.charAt(k) == uCharacter) {
                                    cGenerated_Word.replace(k, k + 1, "" + uCharacter);
                                    uChanged = true;
                                }
                            }
                            if (!uChanged) {
                                uCorrect = false;
                            }
                        }
                    }
                }else if(i ==4) {//second wrong answer
                    uCorrect = true;
                    uChanged = false;
                    while (uCorrect) {
                        System.out.println(hanged._4);
                        System.out.println("Here is your clue: \n" + cGenerated_Word);
                        System.out.println("Please enter \"f\" if you want to enter full word, if not enter \"c\"");
                        if (sc.nextLine().charAt(0) == 'f') {
                            uGuess = sc.nextLine();
                            if (uGuess.equals(uWord)) {
                                System.out.println("That is correct, good job! The word was: " + uWord);
                            } else {
                                System.out.println("That is incorrect.");
                                uCorrect = false;
                            }
                        } else {
                            uCharacter = sc.nextLine().charAt(0);
                            for (k = 0; k < uWord.length(); k++) {
                                if (uWord.charAt(k) == uCharacter) {
                                    cGenerated_Word.replace(k, k + 1, "" + uCharacter);
                                    uChanged = true;
                                }
                            }
                            if (!uChanged) {
                                uCorrect = false;
                            }
                        }
                    }
                }else if(i == 5) { //third wrong answer
                    uCorrect = true;
                    uChanged = false;
                    while (uCorrect) {
                        System.out.println(hanged._5);
                        System.out.println("Here is your clue: \n" + cGenerated_Word);
                        System.out.println("Please enter \"f\" if you want to enter full word, if not enter \"c\"");
                        if (sc.nextLine().charAt(0) == 'f') {
                            uGuess = sc.nextLine();
                            if (uGuess.equals(uWord)) {
                                System.out.println("That is correct, good job! The word was: " + uWord);
                            } else {
                                System.out.println("That is incorrect.");
                                uCorrect = false;
                            }
                        } else {
                            uCharacter = sc.nextLine().charAt(0);
                            for (k = 0; k < uWord.length(); k++) {
                                if (uWord.charAt(k) == uCharacter) {
                                    cGenerated_Word.replace(k, k + 1, "" + uCharacter);
                                    uChanged = true;
                                }
                            }
                            if (!uChanged) {
                                uCorrect = false;
                            }
                        }
                    }
                }else if(i == 6) {//forth wrong answer
                    uCorrect = true;
                    uChanged = false;
                    while (uCorrect) {
                        System.out.println(hanged._6);
                        System.out.println("Here is your clue: \n" + cGenerated_Word);
                        System.out.println("Please enter \"f\" if you want to enter full word, if not enter \"c\"");
                        if (sc.nextLine().charAt(0) == 'f') {
                            uGuess = sc.nextLine();
                            if (uGuess.equals(uWord)) {
                                System.out.println("That is correct, good job! The word was: " + uWord);
                            } else {
                                System.out.println("That is incorrect.");
                                uCorrect = false;
                            }
                        } else {
                            uCharacter = sc.nextLine().charAt(0);
                            for (k = 0; k < uWord.length(); k++) {
                                if (uWord.charAt(k) == uCharacter) {
                                    cGenerated_Word.replace(k, k + 1, "" + uCharacter);
                                    uChanged = true;
                                }
                            }
                            if (!uChanged) {
                                uCorrect = false;
                            }
                        }
                    }
                }else if(i ==7) {//fifth wrong answer
                    uCorrect = true;
                    uChanged = false;
                    while (uCorrect) {
                        System.out.println(hanged._7);
                        System.out.println("Here is your clue: \n" + cGenerated_Word);
                        System.out.println("Please enter \"f\" if you want to enter full word, if not enter \"c\"");
                        if (sc.nextLine().charAt(0) == 'f') {
                            uGuess = sc.nextLine();
                            if (uGuess.equals(uWord)) {
                                System.out.println("That is correct, good job! The word was: " + uWord);
                            } else {
                                System.out.println("That is incorrect.");
                                uCorrect = false;
                            }
                        } else {
                            uCharacter = sc.nextLine().charAt(0);
                            for (k = 0; k < uWord.length(); k++) {
                                if (uWord.charAt(k) == uCharacter) {
                                    cGenerated_Word.replace(k, k + 1, "" + uCharacter);
                                    uChanged = true;
                                }
                            }
                            if (!uChanged) {
                                uCorrect = false;
                            }
                        }
                    }
                }//sixth wrong answer
            }//FOR LOOP FOR NUMBER OF TURNS

            while (uID10T) {
                System.out.println("Again?");
                char uChoice = sc.nextLine().toLowerCase().charAt(0);
                if (uChoice == 'n') {
                    uAgain = false;
                    uID10T = false;
                    cGenerated_Word.delete(0, cGenerated_Word.length());
                } else if (uChoice == 'y') {
                    uID10T = false;
                }
            }
        }
    }
    public static class Hangman{
        String _1 =("  ----------------\n"
                +" |n"
                +" |"
                +" |"
                +" |"
                +" |"
                +"\n |"
                +"\n |"
                +" |\n"
                +" |\n"
                +" |\n"
                +"---"),
        _2 = ("  ----------------\n"
                +" |              _|_\n"
                +" |             |0 0|\n"
                +" |             |_U_|\n"
                +" |\n"
                +" |"
                +"\n |"
                +"\n |"
                +" |\n"
                +" |\n"
                +" |\n"
                +"---"),
        _3 = ("  ----------------\n"
                +" |              _|_\n"
                +" |             |0 0|\n"
                +" |             |_U_|\n"
                +" |              _|_\n"
                +" |               | "
                +"\n |               |"
                +"\n |               |"
                +" |              _|_ \n"
                +" |\n"
                +" |\n"
                +"---"),
        _4 = ("  ----------------\n"
                +" |              _|_\n"
                +" |             |0 0|\n"
                +" |             |_u_|\n"
                +" |              _|_\n"
                +" |             / |"
                +"\n |            /  |"
                +"\n |           /   |"
                +" |              _|_\n"
                +" |\n"
                +" |\n"
                +"---"),
        _5 = ("  ----------------\n"
                +" |              _|_\n"
                +" |             |0 0|\n"
                +" |             |_-_|\n"
                +" |              _|_\n"
                +" |             / | \\"
                +"\n |            /  |  \\"
                +"\n |           /   |   \\"
                +" |              _|_\n"
                +" |             |   |\n"
                +" |"
                +"---"),
        _6 = ("  ----------------\n"
                +" |              _|_\n"
                +" |             |0 0|\n"
                +" |             |_n_|\n"
                +" |              _|_\n"
                +" |             / | \\"
                +"\n |            /  |  \\"
                +"\n |           /   |   \\"
                +" |              _|_\n"
                +" |             |\n"
                +" |             |"
                +"---"),
        _7 = ("  ----------------\n"
                +" |              _|_\n"
                +" |             |x x|\n"
                +" |             |_*_|\n"
                +" |              _|_\n"
                +" |             / | \\"
                +"\n |            /  |  \\"
                +"\n |           /   |   \\"
                +" |              _|_\n"
                +" |             |   |\n"
                +" |             |   |"
                +"---");
    }
}