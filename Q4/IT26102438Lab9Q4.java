import java.util.Scanner;

public class IT26102438Lab9Q4 {
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 30 + examMark * 70) / 100;
    }

    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-16s%-16.2f%c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];

        for (int i = 0; i < names.length; i++) {
            System.out.println();
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = input.nextDouble();
            input.nextLine();

            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
        }

        System.out.println();
        System.out.printf("%-16s%-16s%s%n", "Name", "Final Mark", "Grade");

        for (int i = 0; i < names.length; i++) {
            printDetails(names[i], finalMarks[i], findGrades(finalMarks[i]));
        }
    }
}
