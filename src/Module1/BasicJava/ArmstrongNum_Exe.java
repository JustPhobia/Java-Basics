package Module1.BasicJava;

import java.util.Scanner;

public class ArmstrongNum_Exe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uRange,cLength,cCurrent, count=0;
        double sum;
        String _Num;
        System.out.println("Enter the number range you wish to use: ");
        uRange = input.nextInt();
        for  (int i = 1; i <= uRange; i++) {
            sum = 0;
            _Num = Integer.toString(i);
            cLength = _Num.length();
            for(int j = 0; j < cLength; j++) {
                cCurrent = Integer.parseInt(_Num.charAt(j)+"");
                sum += Math.pow(cCurrent,cLength);
            }
            if ((int)sum == i){
                count++;
                System.out.println(i+ ": Is an Armstrong Number!");
            }
        }
        System.out.println("Total numbers: "+count);

    }
}
