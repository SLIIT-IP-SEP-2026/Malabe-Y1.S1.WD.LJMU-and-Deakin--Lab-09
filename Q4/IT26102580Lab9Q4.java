import java.util.Scanner;

public class IT26102580Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
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
        System.out.printf("%-15s %-15.2f %-10c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];

        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];
        double[] finalMarks = new double[5];

        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {

            System.out.println();

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            assignmentMarks[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            examMarks[i] = input.nextDouble();

            input.nextLine();

            finalMarks[i] = calcFinalMark(assignmentMarks[i], examMarks[i]);

            grades[i] = findGrades(finalMarks[i]);
        }

        System.out.println("\nName           Final Mark      Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

    }
}