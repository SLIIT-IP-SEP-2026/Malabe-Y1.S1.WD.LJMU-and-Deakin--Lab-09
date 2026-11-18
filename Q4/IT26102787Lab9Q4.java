public class IT26102787Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {

        double finalMark;

        finalMark = (assignment * 0.30) + (exam * 0.70);

        return finalMark;
    }

    public static String findGrades(double finalMark) {

        if (finalMark >= 75) {
            return "A";
        }
        else if (finalMark >= 60) {
            return "B";
        }
        else if (finalMark >= 50) {
            return "C";
        }
        else {
            return "F";
        }
    }

    public static void printDetails(String name, double finalMark, String grade) {

        System.out.printf("%-15s %-15.2f %-10s%n",
                          name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, grade;
        double assignment, exam, finalMark;

        System.out.println("Enter details of 5 students");

        System.out.printf("%-15s %-15s %-10s%n",
                          "Name", "Final Mark", "Grade");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            name = input.next();

            System.out.print("Enter Assignment Mark: ");
            assignment = input.nextDouble();

            System.out.print("Enter Exam Mark: ");
            exam = input.nextDouble();

            finalMark = calcFinalMark(assignment, exam);

            grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}