package Module1.BasicJava;

import java.util.Scanner;

public class CalculatorUserInput_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean SumFin = false, uAgain = true,uID10T = true;
        float _One, _Two;
        final char cMultiply = '*', cDivision = '/', cAdd = '+', cMinus = '-';
        String uSum;
        while (uAgain){
            uID10T = true;
            while (!SumFin) {
                System.out.println("Insert simple math equation: ");
                 uSum = sc.nextLine();
                System.out.println(uSum);
                String trim = uSum.replaceAll(" ", "");
                System.out.println(trim);
                int uMultiply = trim.indexOf(cMultiply), uDivision = trim.indexOf(cDivision), uAdd = trim.indexOf(cAdd), uMinus = trim.indexOf(cMinus);
                if (uMultiply > 0){
                    _One = Integer.parseInt(trim.substring(0, uMultiply));
                    _Two = Integer.parseInt(trim.substring(uMultiply + 1));
                    System.out.println(_One + " * " + _Two + " = " + (_One * _Two));
                }else if (uDivision > 0){
                    _One = Integer.parseInt(trim.substring(0, uDivision));
                    _Two = Integer.parseInt(trim.substring(uDivision + 1));
                    System.out.println(_One +  " / " + _Two + " = " + (_One / _Two));
                }else if (uAdd > 0){
                    _One = Integer.parseInt(trim.substring(0, uAdd));
                    _Two = Integer.parseInt(trim.substring(uAdd + 1));
                    System.out.println(_One + " + " + _Two + " = " + (_One + _Two));
                }else if (uMinus>0){
                    _One = Integer.parseInt(trim.substring(0, uMinus));
                    _Two = Integer.parseInt(trim.substring(uMinus + 1));
                    System.out.println(_One + " - " + _Two + " = " + (_One - _Two));
                } else{
                    System.out.println("The math equation you input is wrong.");
                }
                SumFin = true;
                uSum="";
            }
            while (uID10T) {
                System.out.println("Again?");
                char uChoice = sc.nextLine().toLowerCase().charAt(0);
                if (uChoice == 'n') {
                    uAgain = false;;
                } else if (uChoice == 'y') {
                    uID10T = false;
                    SumFin = false;
                }
            }
        }

    }
}
