package Module1.BasicJava;

import java.util.Scanner;

public class HangManV2_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hangman hanged = new Hangman();
        StringBuilder cGenerated_Word = new StringBuilder(), uGuesses = new StringBuilder();
        String[] hang_Stages = {hanged._1, hanged._2, hanged._3, hanged._4, hanged._5, hanged._6, hanged._7};
        boolean uAgain = true, uID10T = true, uCorrect = true, uChanged = false, uGameWon = false, uTried;
        String uWord, uGuess;
        char uCharacter, uGuessChoice, uChoice;
        int i, k, uGuessedTotal;
        while (uAgain) {
            uID10T = true;
            uGuessedTotal = 0;
            cGenerated_Word.delete(0, cGenerated_Word.length());
            uGameWon = false;
            uGuesses.delete(0, uGuesses.length());
            uTried = false;

            System.out.println("What word would you like them to guess?");
            uWord = sc.nextLine().toLowerCase();
            System.out.println("Are you ready for the game to start? \nGreat lets see what you're ready to guess!");
            for (i = 0; i < uWord.length(); i++) {
                cGenerated_Word.append("_");
            }
            for (i = 0; i < 6; i++) {
                uCorrect = true;
                uChanged = false;
                System.out.println(hang_Stages[i]);
                while (uCorrect) {
                    System.out.println("Here is your clue: \n" + cGenerated_Word);
                    System.out.println("Your guesses so far have been: \n" + uGuesses);
                    System.out.println("Please enter \"f\" if you want to enter full word, if not enter \"c\"");
                    uGuessChoice = sc.nextLine().toLowerCase().charAt(0);
                    if (uGuessChoice == 'f') {
                        System.out.println("Guess the full word!");
                        uGuess = sc.nextLine().toLowerCase();
                        if (uGuess.equals(uWord)) {
                            uGameWon = true;
                            i = 7;
                            break;
                        } else {
                            System.out.println("That is incorrect.");
                            uCorrect = false;
                        }
                    } else {
                        System.out.println("Select the letter you would like to choose:");
                        uCharacter = sc.nextLine().toLowerCase().charAt(0);
                        if (uGuesses.toString().indexOf(uCharacter) != -1 || cGenerated_Word.toString().indexOf(uCharacter) != -1) {
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("You already guessed that letter!");
                            System.out.println("------------------------------------------------------------------");
                            uTried = true;
                            continue;
                        } else {
                            for (k = 0; k < uWord.length(); k++) {

                                if ((uWord.charAt(k) == uCharacter) && (uCharacter != cGenerated_Word.charAt(k))) {
                                    cGenerated_Word.replace(k, k + 1, "" + uCharacter);
                                    uChanged = true;
                                    uGuessedTotal += 1;
                                }
                            }

                            if (!uChanged) {
                                uGuesses.append(uCharacter).append(" ");
                                uCorrect = false;
                                break;
                            } else if (uGuessedTotal == uWord.length()) {
                                uGameWon = true;
                                i = 7;
                                break;
                            } else {
                                uChanged = false;
                            }
                        }
                    }
                }

            }
            if (uGameWon) {
                System.out.println("Congrats on winning the game! You got the word! It was " + uWord);
            } else {
                System.out.println(hang_Stages[6]);
                System.out.println("Unfortunately you lost the game, the correct word was: " + uWord);
            }

            while (uID10T) {
                System.out.println("Would you to play again? Y/N");
                uChoice = sc.nextLine().toLowerCase().charAt(0);
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

    public static class Hangman {
        String _1 = ("""
                  ----------------
                 |
                 |
                 |
                 |
                 |
                 |
                 |
                 |
                 |
                 |
                ---"""),
                _2 = ("""
                          ----------------
                         |              _|_
                         |             |0 0|
                         |             |_U_|
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                        ---"""),
                _3 = ("""
                          ----------------
                         |              _|_
                         |             |0 0|
                         |             |_U_|
                         |              _|_
                         |               |
                         |               |
                         |               |
                         |              _|_
                         |
                         |
                        ---"""),
                _4 = ("""
                          ----------------
                         |              _|_
                         |             |0 0|
                         |             |_u_|
                         |              _|_
                         |             / |
                         |            /  |
                         |           /   |
                         |              _|_
                         |
                         |
                        ---"""),
                _5 = ("""
                          ----------------
                         |              _|_
                         |             |0 0|
                         |             |_-_|
                         |              _|_
                         |             / | \\
                         |            /  |  \\
                         |           /   |   \\
                         |              _|_
                         |
                         |
                        ---"""),
                _6 = ("""
                          ----------------
                         |              _|_
                         |             |0 0|
                         |             |_n_|
                         |              _|_
                         |             / | \\
                         |            /  |  \\
                         |           /   |   \\
                         |              _|_
                         |             |
                         |             |
                        ---"""),
                _7 = ("""
                          ----------------
                         |              _|_
                         |             |x x|
                         |             |_*_|
                         |              _|_
                         |             / | \\
                         |            /  |  \\
                         |           /   |   \\
                         |              _|_
                         |             |   |
                         |             |   |
                        ---""");
    }
}
