import java.util.Scanner;

public class IT26102576Lab9Q4{

    public static double calcFinalMark(double assignmentMark, double examMark){
        double finalMark = (assignmentMark * 0.30) + (examMark * 0.70);
        return finalMark;
    }

    public static char findGrades(double mark){
        char grade = mark >= 75 ? 'A' : mark >= 60 ? 'B' : mark >= 50 ? 'C' : 'F';
        return grade;
    }

    public static void printDetails(String name, double finalMark, char grade){
        System.out.println(name + "         " + finalMark + "        " + grade);
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String names[] = new String[5];
        double finalMarks[] = new double[5];
        char grades[] = new char[5];

        for(int i = 0; i < 5; i++){

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = input.nextDouble();

            input.nextLine();

            finalMarks[i] = calcFinalMark(assignmentMark, examMark);

            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        System.out.println("Name         Final Mark        Grade");

        for(int i = 0; i < 5; i++){
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}