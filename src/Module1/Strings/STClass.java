package Module1.Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class STClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message: ");
        StringTokenizer tokenizer = new StringTokenizer(sc.nextLine());
        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()){
            String local = tokenizer.nextToken();

            System.out.println("Current token: "+local);
            System.out.println("Tokens remaining"+ tokenizer.countTokens());
        }
    }
}
