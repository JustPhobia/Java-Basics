package Module1.FunBeginnerProjects;

import java.util.Scanner;
public class StudentScoring {
    public static void main(String[] args) {
        boolean newClass=true;
        Scanner sc= new Scanner(System.in);
        int i, scoreStudents=0, scoreTotal=0;
        while (newClass) {
            while (scoreStudents == 0) {
                System.out.println("Hi there! Please input the number of students you need to check:");
                scoreStudents = sc.nextInt();
            }
            while (scoreTotal == 0) {
                System.out.println("Now please input the total marks the test was worth:");
                scoreTotal = sc.nextInt();
            }
            Students[] ArrayTests = new Students[scoreStudents];

            for (i = 0; i < scoreStudents; i++) {

                ArrayTests[i] = new Students();

                System.out.println("Learner name: ");
                ArrayTests[i].scoreName = sc.next();

                System.out.println("Learner score: ");
                ArrayTests[i].scoreScore = sc.nextFloat();


                ArrayTests[i].scorePercentage = ArrayTests[i].scoreScore / 100;
            }
            for (i = 0; i < scoreStudents; i++) {
                System.out.println(ArrayTests[i].scoreName +
                        " " + ArrayTests[i].scoreScore +
                        " " + ArrayTests[i].scorePercentage * 100 + "%");
            }

            System.out.println("Would you like to place a new class? Y/N");
            char userChoice = sc.next().charAt(0);
            if (userChoice =='n'){
                newClass = false;
            }else{
                scoreStudents=0;
                scoreTotal=0;
            }
        }
/*        for (i=0; i<scoreStudents; i++){
            System.out.println( "Learner name: " +ArrayTests[i].scoreName +
                    " Learner Score: " + ArrayTests[i].scoreScore +
                    " Learner Percentage: "+ ArrayTests[i].scorePercentage*100+"%");
        }*/
    }
}
class Students {
    String scoreName;
    float scoreScore, scorePercentage;
}
