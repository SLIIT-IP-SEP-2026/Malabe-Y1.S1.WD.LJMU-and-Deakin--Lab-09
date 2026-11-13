import java.util.Scanner;


public class IT26102381Lab9Q1 {

    public static void main(String[] args) {

        double radius;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();

        double area = circleArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        sc.close();
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}