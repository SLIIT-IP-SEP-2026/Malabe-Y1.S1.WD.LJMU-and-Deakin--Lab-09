
import java.util.Scanner;

public class IT26102539Lab9Q4 {

    public static double calculateFinalMark(double assignment, double exam) {
        double mark = (assignment * 0.3) + (exam * 0.7);
        return mark;
    }

    public static String findGrades(double mark) {

        if (mark > 75) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void printDetails(String name, double mark, String grade) {
        System.out.printf("%-10s %-15.2f %-5s\n", name, mark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] marks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = input.nextDouble();

            marks[i] = calculateFinalMark(assignment, exam);

            grades[i] = findGrades(marks[i]);
        }

        System.out.println("\nName       Final Mark      Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], marks[i], grades[i]);
        }

        input.close();
    }
}
