import java.util.Scanner;


public class IT26102381Lab9Q1 {

    public static void main(String[] args) {

        double a, b, c, x_1, x_2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        c = sc.nextDouble();

        x_1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        x_2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println("\nRoots are real and different:");
        System.out.println("Root 1 = " + x_1);
        System.out.println("Root 2 = " + x_2);

        sc.close();
    }

}