package Module1.BasicJava;//F = (C x 9/5) + 32.
import java.util.Scanner;
public class Metric_Imperial {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            float vCels;
            System.out.println("Please input Celsius");
            vCels = sc.nextFloat();
            System.out.println(vCels+" degrees Celsius in Fahrenheit is: "+(vCels*9/5)+32+"degrees Fahrenheit");
        }
}