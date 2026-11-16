import java.util.Scanner;

public class IT26102427Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static String findGrades(double finalMark) {

        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-15s %-15.2f %-5s\n", name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        double assignmentMark, examMark;
        double finalMark;
        String grade;

        System.out.println("Name\t\tFinal Mark\tGrade");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            name = input.next();

            System.out.print("Enter Assignment Mark: ");
            assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Mark: ");
            examMark = input.nextDouble();

            finalMark = calcFinalMark(assignmentMark, examMark);

            grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}