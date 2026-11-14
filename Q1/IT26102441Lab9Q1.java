import java.util.Scanner;
public class IT26102441Lab9Q1{
	public static void main(String[] args){
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter value a: ");
		double a = obj.nextDouble();
		
		System.out.println("Enter value b: ");
		double b = obj.nextDouble();
		
		System.out.println("Enter value c: ");
		double c = obj.nextDouble();
		
		if(a==0){
			System.out.println("Error");
		}else{
			double D = Math.pow(b,2)-4*a*c;
			double E = Math.sqrt(D);
			double root1 = (-b-E)/(2*a);
			double root2 = (-b+E)/(2*a);
			System.out.println("Root 1: "+root1);
			System.out.println("Root 2: "+root2);
		}
		
		
		
	}
}