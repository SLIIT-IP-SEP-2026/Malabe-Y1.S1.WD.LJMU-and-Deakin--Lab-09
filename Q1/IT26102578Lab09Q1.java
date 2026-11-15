import java.util.Scanner;
public class IT26102578Lab09Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		double a,b,c;
		double x1,x2,discriminant;
		
		System.out.print("Enter value a : ");
		a = input.nextDouble();
		
		System.out.print("Enter value b : ");
		b = input.nextDouble();
		
		System.out.print("Enter value c :");
		c = input.nextDouble();
		
		discriminant = Math.pow(b, 2) - (4*a*c);
		
		if(discriminant > 0){
			x1 = (-b + Math.sqrt(discriminant)) /(2*a);
			x2 = (-b + Math.sqrt(discriminant)) /(2*a);
			
			System.out.println("\nRoots are real and different");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		else if (discriminant == 0) {
			x1 = (-b) / (2*a);
			
			System.out.println("\nRoots are real and different");
			System.out.println("x1 = x2 = " + x1);
		}
		else {
			System.out.println("\nRoots are imaginary");
		}
		
	}
	
}

			