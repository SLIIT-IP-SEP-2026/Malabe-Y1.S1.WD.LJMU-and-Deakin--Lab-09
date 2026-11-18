import java.util.Scanner;

public class IT26102576Lab9Q2{
	
	public static double circleArea(double radius){
		return Math.PI * radius * radius;
	}
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double radius;
			
		System.out.print("Enter the radius of the circle: ");
		radius = input.nextDouble();
		
		double circleArea = circleArea(radius);
		System.out.println("The area of circle with radius "+ radius +" is: " + circleArea);
	}
}
	
	
		