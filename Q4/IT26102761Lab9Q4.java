import java.util.Scanner;

public class IT26102761Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 30 / 100) + (examMark * 70 / 100);
    }

    public static char findGrade(double finalMark) {

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
        System.out.printf("%-10s %-12.2f %-5c\n",
                name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("\nEnter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            double assMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            double examMark = input.nextDouble();

            finalMarks[i] = calcFinalMark(assMark, examMark);
            grades[i] = findGrade(finalMarks[i]);
        }

        System.out.println("\n");
        System.out.printf("%-10s %-12s %-5s\n",
                "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}