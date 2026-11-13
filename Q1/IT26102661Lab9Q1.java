import java.util.Scanner;

public class IT26102661Lab9Q1 {
	
    public static void main(String[] args) {
		
        Scanner value = new Scanner(System.in);

        double a, b, c;
		
        double d, root1, root2;

        System.out.print("Enter value a: ");
        a = value.nextDouble();

        System.out.print("Enter value b: ");
        b = value.nextDouble();

        System.out.print("Enter value c: ");
        c = value.nextDouble();

        d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            System.out.println("\nRoots are real and different :");

            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);

        } else if (d == 0) {
			
            System.out.println("\nRoots are real and equal :");

            root1 = -b / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root1);

        } else {
			
            System.out.println("\nRoots are imaginary :");
            System.out.println("No real roots");
        }
    }
}