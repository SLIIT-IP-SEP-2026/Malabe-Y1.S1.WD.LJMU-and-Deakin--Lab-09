import java.util.Scanner;

public class IT26102761Lab9Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double root1, root2, d;

        System.out.print("Enter value a: ");
        a = sc.nextDouble();

        System.out.print("Enter value b: ");
        b = sc.nextDouble();

        System.out.print("Enter value c: ");
        c = sc.nextDouble();

        d = Math.pow(b, 2) - (4 * a * c);

        if (d > 0) {

            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("\nRoots are real and different :");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);

        } else if (d == 0) {

            root1 = -b / (2 * a);

            System.out.println("\nRoots are real and same :");
            System.out.printf("Root: %.2f\n", root1);

        } else {

            System.out.println("\nRoots are imaginary");
        }

        sc.close();
    }
}