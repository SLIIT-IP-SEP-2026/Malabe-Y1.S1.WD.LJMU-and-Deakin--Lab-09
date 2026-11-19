
import java.util.Scanner;
public class IT26102660Lab9Q4{
    public static double calcFinalMark(double assignment, double exam){
        return (assignment * 0.30) + (exam * 0.70);
    }

    public static String findGrades(double mark){
        if (mark >= 75) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-20s %-20.2f %-10s%n",name, finalMark, grade);
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];

        double finalMark;
        String grade;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for "+ names[i] + ": ");
            assignmentMarks[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "+ names[i] + ": ");
            examMarks[i] = input.nextDouble();
            input.nextLine();
            System.out.println();
        }
        System.out.printf("%-20s %-20s %-10s%n","Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++){

            finalMark = calcFinalMark(assignmentMarks[i], examMarks[i]);
            grade = findGrades(finalMark);
            printDetails(names[i], finalMark, grade);
        }
        input.close();
    }
}
