import java.util.Scanner;

public class IT26102620Lab9Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("Not a quadratic equation");
        }
        else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("\nRoots are real and different :");
            System.out.printf("Root 1: %.2f%n", x1);
            System.out.printf("Root 2: %.2f%n", x2);
        }
        else if (d == 0) {
            double x = -b / (2 * a);

            System.out.println("\nRoots are real and equal :");
            System.out.printf("Root 1: %.2f%n", x);
            System.out.printf("Root 2: %.2f%n", x);
        }
        else {
            System.out.println("\nRoots are complex");

            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * Math.abs(a));

            System.out.printf("Root 1: %.2f + %.2fi%n", real, imaginary);
            System.out.printf("Root 2: %.2f - %.2fi%n", real, imaginary);
        }

        input.close();
    }
}
