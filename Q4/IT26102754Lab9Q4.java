import java.util.Scanner;

public class IT26102754Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {

        double finalMark = (assignment * 0.30) + (exam * 0.70);

        return finalMark;
    }

    public static char findGrades(double mark) {

        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String[] names, double[] marks, char[] grades) {

        System.out.println("\nName\tFinal Mark\tGrade");

        for (int i = 0; i < 5; i++) {

            System.out.printf("%s\t%.2f\t\t%c%n", names[i], marks[i], grades[i]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignment = new double[5];
        double[] exam = new double[5];
        double[] finalMark = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark for " + names[i] + ": ");
            assignment[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark for " + names[i] + ": ");
            exam[i] = input.nextDouble();

            finalMark[i] = calcFinalMark(assignment[i], exam[i]);

            grades[i] = findGrades(finalMark[i]);

            System.out.println();
        }

        printDetails(names, finalMark, grades);
        
    }
}
