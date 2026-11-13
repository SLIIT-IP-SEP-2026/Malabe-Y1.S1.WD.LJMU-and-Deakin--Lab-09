import java.util.Scanner;


public class IT26102381Lab9Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Student " + i);

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter assignment mark (out of 100): ");
            double assignmentMark = sc.nextDouble();

            System.out.print("Enter exam paper mark (out of 100): ");
            double examMark = sc.nextDouble();
            sc.nextLine();

            double finalMark = calcFinalMark(assignmentMark, examMark);
            String grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
            System.out.println();
        }

        sc.close();
    }

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return assignmentMark * 0.30 + examMark * 0.70;
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
        System.out.println("Name: " + name);
        System.out.println("Final Mark: " + finalMark);
        System.out.println("Grade: " + grade);
    }

}
