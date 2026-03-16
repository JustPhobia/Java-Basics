package Module1.FunBeginnerProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserGame_Exe {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        boolean uAgain=true;
        char uPlay;
        int cNumber,uGuess,uGuesses;
        boolean uNotFin= true;
            while (uAgain==true) {
                cNumber = rand.nextInt(1,101);
                uGuesses=0;
                while (uNotFin==true) {
                    System.out.println("Choose what number you think i have: ");
                    uGuess = sc.nextInt();
                    if (uGuess == cNumber) {
                        System.out.println("Great guess you were correct!");
                        uNotFin =false;
                    } else if (uGuess < cNumber) {
                        System.out.println("Higher");
                        uNotFin =true;
                    } else {
                        System.out.println("Lower");
                        uNotFin =true;
                    }
                    uGuesses++;
                }
                System.out.println("Play again: Y/N");
                uPlay = sc.next().toLowerCase().charAt(0);
                if (uPlay=='y'){
                    System.out.println("Lets reset" );
                    uNotFin=true;
                } else if (uPlay=='n') {
                    System.out.println( "Thank you for playing! The number was: "+cNumber+" \nYour number of guesses was: "+uGuesses);
                    uAgain=false;
                    uNotFin=false;
                }
            }
        }
    }
