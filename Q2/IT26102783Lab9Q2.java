import java.util.Scanner;
public class IT26102783Lab9Q2 {

    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = input.nextDouble();

        double answer = circleArea(r);
        System.out.println("The area of the circle with radius " + r + " is : " + answer);
    }
}