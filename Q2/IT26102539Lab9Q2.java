import java.util.Scanner;

public class IT26102539Lab9Q2 {

    public static double circleArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius;

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        System.out.println("The area of the circle with radius " + radius + " is : " + circleArea(radius));

    }
}
