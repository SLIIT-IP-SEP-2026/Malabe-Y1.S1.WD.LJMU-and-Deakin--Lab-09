import java.util.Scanner;
public class IT26102441Lab9Q2{
	public static double circleArea(double radius){
		double area = Math.PI*(radius*radius);
		return area;
	}
		public static void main (String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double radius = obj.nextDouble();
		double result = circleArea(radius);
		System.out.println("The area of the circle with radius "+radius+" is :"+result);
		
	}
}