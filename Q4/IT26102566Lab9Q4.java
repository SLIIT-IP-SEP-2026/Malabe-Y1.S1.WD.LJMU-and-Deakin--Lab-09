import java.util.Scanner;

public class IT26102566Lab9Q4 {

    // 30% assignment + 70% exam
    public static double calcFinalMark(double assignment, double exam) {
        return assignment * 0.30 + exam * 0.70;
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

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-12.2f %c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 5;
        String[] names = new String[count];
        double[] finalMarks = new double[count];
        char[] grades = new char[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Enter Name: ");
            names[i] = input.next();
            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignment = input.nextDouble();
            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double exam = input.nextDouble();

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
            System.out.println();
        }

        System.out.printf("%-15s %-12s %s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < count; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}
