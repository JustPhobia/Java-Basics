package Module3.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTrajectoryCalculator {
    private final TrajectoryCalculator calculate = new TrajectoryCalculator();
    Scanner sc = new Scanner(System.in);
    private void run() {
        boolean run = true;

        while (run) {
            try {
                System.out.println("===========Select Number To Choose===========\n" +
                        "1. Calculate Velocity\n" +
                        "2. Calculate Position\n" +
                        "3. Exit Program");

                String input = sc.nextLine(); // always read as string
                switch (input) {
                    case "1":
                        calcVelocity();
                        break;
                    case "2":
                        calcPosition();
                        break;
                    case "3":
                        run = false;
                        break;
                    default:
                        System.out.println("Invalid choice, please enter 1, 2, or 3.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter numeric values where required.");
                sc.nextLine();
            }
        }
        sc.close();
    }
    private double getPosition(){
        double position;
        System.out.println("Please enter the position: ");
        position = sc.nextDouble();
        sc.nextLine();
        return position;
    }

    private double getInitialVelocity(){
        double initVelocity;
        System.out.print("Please enter initial velocity:");
        initVelocity = sc.nextDouble();
        sc.nextLine();
        return initVelocity;
    }
    private double getAcceleration(){
        double a;
            System.out.print("Please enter acceleration:");
            a = sc.nextDouble();
            sc.nextLine();
            return a;
    }

    private  double getTime(){
        double t;
        System.out.print("Please enter time:");
        t = sc.nextDouble();
        sc.nextLine();
        return t;
    }
    private void calcPosition(){
        try{
            System.out.println("Your final position is:"+calculate.calculatePosition(getPosition(),getInitialVelocity(),getAcceleration(),getTime()));
        }catch (TrajectoryCalculationException e){
            System.out.println(e.getMessage());
        }
    }
    private void calcVelocity(){
        try {
            System.out.println("Your final velocity is: "+ calculate.calculateVelocity(getInitialVelocity(),getAcceleration(),getTime()));;
        }catch (TrajectoryCalculationException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new MainTrajectoryCalculator().run();
    }
}
