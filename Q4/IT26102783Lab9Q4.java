import java.util.Scanner;
public class IT26102783Lab9Q4 {

    public static double calcFinalMark(double assign, double exam) {
        double finalMark = assign * 0.30 + exam * 0.70;
        return finalMark;
    }

    public static char findGrades(double finalMark) {
        char grade;
        if (finalMark >= 75) {
            grade = 'A';
        } else if (finalMark >= 60) {
            grade = 'B';
        } else if (finalMark >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-10s %10.2f %10c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assign = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = input.nextDouble();

            finalMarks[i] = calcFinalMark(assign, exam);
            grades[i] = findGrades(finalMarks[i]);
            System.out.println();
        }

        System.out.println();
        System.out.printf("%-10s %10s %10s%n", "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}