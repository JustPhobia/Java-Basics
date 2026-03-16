package Module1.FunBeginnerProjects;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MorseCode_Exe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] normalLetters= {
                'a','b','c','d','e','f','g','h','i','j',
                'k','l','m','n','o','p','q','r','s','t',
                'u','v','w','x','y','z','.',','
        };
        String[] codeLetters={
                ".-", "-...", "-.-.", "-..", ".", "..-." ,"--." ,"....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                ".-.-.-", "--..--"
        };
        StringBuilder codeOutput = new StringBuilder();

        System.out.print("Please insert the phrase you would like to encrypt in morse code:");
        String codeEncrypt = input.nextLine();

        for (int i = 0; i < codeEncrypt.length(); i++) {
            char letter = codeEncrypt.charAt(i);
            for (int j = 0; j < normalLetters.length; j++) {
                if (normalLetters[j] == letter) {
                    codeOutput.append(codeLetters[j]);
                }else if(' '==letter){
                    codeOutput.append("  ");
                }else{
                    codeOutput.append(" ");
                }
            }
        }
        System.out.println(" "+codeOutput);

        System.out.println("Would you like to translate morse code into something (Y/N): ");
        if (input.nextLine().equalsIgnoreCase("Y")) {
            codeOutput.delete(0, codeOutput.length());
            System.out.print("Please give the code you would like to translate from morse code: ");
            codeEncrypt = input.nextLine();
            StringTokenizer Token = new StringTokenizer(codeEncrypt, "  ");
            while (Token.hasMoreTokens()) {
                String character = Token.nextToken();
                character = character.trim();
                for  (int i = 0; i < character.length(); i++) {
                    if (character.equals(codeLetters[i].trim())) {
                        codeOutput.append(normalLetters[i]);
                    }
                }
                codeOutput.append(" ");
            }
        }


    }
}
