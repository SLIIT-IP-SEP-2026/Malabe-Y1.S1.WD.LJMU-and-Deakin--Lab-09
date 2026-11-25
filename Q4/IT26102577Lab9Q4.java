import java.util.Scanner;

public class IT26102577Lab9Q4 {
    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 30 + exam * 70) / 100;
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

    public static void printDetails(String name, double mark, char grade) {
        System.out.printf("%-20s %-15.2f %c%n", name, mark, grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = sc.nextDouble();
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = sc.nextDouble();
            sc.nextLine();

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
            System.out.println();
        }

        System.out.printf("%-20s %-15s %s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < names.length; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
        sc.close();
    }
}
