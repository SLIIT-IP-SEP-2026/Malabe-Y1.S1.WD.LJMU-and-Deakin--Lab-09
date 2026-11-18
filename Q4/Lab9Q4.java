import java.util.Scanner;

public class IT26102753Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }

    public static String findGrade(double finalMark) {
        if (finalMark >= 75)
            return "Distinction";
        else if (finalMark >= 50)
            return "Credit";
        else
            return "Fail";
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.println("Name: " + name);
        System.out.println("Final Mark: " + finalMark);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Assignment Mark: ");
            double assignment = sc.nextDouble();

            System.out.print("Enter Exam Mark: ");
            double exam = sc.nextDouble();

            double finalMark = calcFinalMark(assignment, exam);
            String grade = findGrade(finalMark);

            printDetails(name, finalMark, grade);
        }
    }
}