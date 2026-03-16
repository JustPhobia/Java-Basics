package Module1.Arrays;

import java.util.Scanner;

public class ArrMaxNum_Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum=0, tempNum,locMax=0;
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        for  (int i = 0; i < nums.length-1; i++) {
            tempNum = nums[i];
            if (tempNum>maxNum){
                maxNum = tempNum;
                locMax = i;
            }
        }
        System.out.println("The maximum number is:" + nums[locMax] + "\nIt is array number "+locMax);
    }
}
