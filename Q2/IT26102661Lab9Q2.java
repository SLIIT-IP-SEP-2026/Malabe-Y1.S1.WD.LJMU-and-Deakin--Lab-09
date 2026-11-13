import java.util.Scanner;

public class IT26102661Lab9Q2 {
	
    public static void main(String[] args) {
		
        Scanner value = new Scanner(System.in);

        double radius, area;

        System.out.print("Enter the radius of the circle: ");
        radius = value.nextDouble();

        area = circleArea(radius);

        System.out.println("The area of the circle with radius " + radius + " is : " + area);
    }

    public static double circleArea(double radius) {
		
        double area;

        area = Math.PI * Math.pow(radius, 2);

        return area;
    }
}