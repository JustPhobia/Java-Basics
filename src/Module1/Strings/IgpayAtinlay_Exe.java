package Module1.Strings;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
//Need to make an else-if statment for if length is only 2

public class IgpayAtinlay_Exe {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String input, placeLatin;
        StringBuilder pigLatin= new StringBuilder();
        Random rand = new Random();
        int _1Word = 0;
        System.out.println("Please insert the phrase you would like to convert into pig latin:");
        input = sc.nextLine();
        StringTokenizer Token = new StringTokenizer(input," ");
        pigLatin.delete(0,pigLatin.length());
        while (Token.hasMoreTokens()) {
                placeLatin = Token.nextToken();
                String twoChars = placeLatin.substring(0, 2).toLowerCase();
                char pigFirst = placeLatin.charAt(0);
            if (_1Word == 0) {
                _1Word++;
                if (pigFirst == 'a' || pigFirst == 'e' || pigFirst == 'i' || pigFirst == 'o' || pigFirst == 'u') {
                    int k = rand.nextInt(2);
                    if (k == 1) {
                        pigLatin.append(placeLatin.substring(0, 1).toUpperCase()).append(placeLatin.substring(1)).append("-way").append(" ");
                    } else {
                        pigLatin.append(placeLatin.substring(0, 1).toUpperCase()).append(placeLatin.substring(1)).append("-lay").append(" ");
                    }
                } else if (twoChars.equals("qu") || twoChars.matches(".*[b-df-hj-np-tv-z].*[b-df-hj-np-tv-z].*")){
                    pigLatin.append(placeLatin.substring(2,3).toUpperCase()).append(placeLatin.substring(3)).append("-").append(twoChars).append("ay").append(" ");
                } else if (placeLatin.length() <= 2) {
                    pigLatin.append(placeLatin.substring(1, 2).toUpperCase()).append("-").append(placeLatin.toLowerCase().charAt(0)).append("ay").append(" ");
                } else {
                    pigLatin.append(placeLatin.substring(1, 2).toUpperCase()).append(placeLatin.substring(2)).append("-").append(placeLatin.toLowerCase().charAt(0)).append("ay").append(" ");
                }
            }else{
                if (pigFirst == 'a' || pigFirst == 'e' || pigFirst == 'i' || pigFirst == 'o' || pigFirst == 'u') {
                    int k = rand.nextInt(2);
                    if (k == 1) {
                        pigLatin.append(placeLatin.charAt(0)).append(placeLatin.substring(1)).append("-way").append(" ");
                    } else {
                        pigLatin.append(placeLatin.charAt(0)).append(placeLatin.substring(1)).append("-lay").append(" ");
                    }
                } else if ( twoChars.equals("qu")||twoChars.matches(".*[b-df-hj-np-tv-z].*[b-df-hj-np-tv-z].*")) {
                    pigLatin.append(placeLatin.charAt(2)).append(placeLatin.substring(3)).append("-").append(twoChars).append("ay").append(" ");
                } else if (placeLatin.length() <= 2) {
                    pigLatin.append(placeLatin.charAt(1)).append("-").append(placeLatin.toLowerCase().charAt(0)).append("ay").append(" ");
                } else {
                    pigLatin.append(placeLatin.charAt(1)).append(placeLatin.substring(2)).append("-").append(placeLatin.toLowerCase().charAt(0)).append("ay").append(" ");
                }

            }
        }
        System.out.println(pigLatin);
    }
}
