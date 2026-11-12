import java.util.Scanner;
public class IT26102439Lab9Q2 {
    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = circleArea(radius);
        System.out.printf("Area of the Circle: %.2f%n", area);
        input.close();
    }
}