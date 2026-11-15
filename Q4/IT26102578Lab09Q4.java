import java.util.Scanner;

public class IT26102578Lab9Q4 {

    
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
        System.out.printf("%-15s %-15.2f %-10s\n", name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Name\t\tFinal Mark\tGrade");
        System.out.println("----------------------------------------");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nEnter details of Student " + i);

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Assignment Mark: ");
            double assignmentMark = input.nextDouble();

            System.out.print("Exam Mark: ");
            double examMark = input.nextDouble();
            input.nextLine(); // clear buffer

            double finalMark = calcFinalMark(assignmentMark, examMark);
            String grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}