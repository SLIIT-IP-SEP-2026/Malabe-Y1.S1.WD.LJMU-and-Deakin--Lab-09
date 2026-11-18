import java.util.Scanner;

public class IT26102752Q2 {

    public static double circleArea(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double area = circleArea(radius);

        System.out.println("Area = " + area);
    }
}