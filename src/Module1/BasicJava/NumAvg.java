package Module1.BasicJava;

import java.util.Random;

public  class NumAvg {
    public static void main(String[] args) {
        Random rand= new Random();
        int a= rand.nextInt(100)+1, b= rand.nextInt(100)+1, c= rand.nextInt(100)+1;
        float rAvg;
        System.out.println("First: "+a+" Second: "+b+" Third: "+c);
        rAvg = (a+b+c)/3f;
        System.out.println("That means your average is: "+rAvg);
    }
}