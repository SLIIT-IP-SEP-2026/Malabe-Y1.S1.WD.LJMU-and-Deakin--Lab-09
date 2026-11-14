import java.util.Scanner;
public class IT26102441Lab9Q4{
	public static double calcFinalMark(double ass_marks,double exam_paper_mark){
		double Final_mark=(ass_marks*0.3) + (exam_paper_mark*0.7);
		return Final_mark;
	}
	public static char findGrades(double Final_mark){
		if (Final_mark>=75){
			return 'A' ;
		}else if (Final_mark>=60){
			return 'B' ;
		}else if(Final_mark>=50){
			return 'C' ; 
		}else{
			return 'F' ;
		}
	}
	public static void printDetails(String Name,double Final_mark,char Grade){
		System.out.println();
	}
		
	
	public static void main(String[] args){
		Scanner obj = new Scanner (System.in);
		String name[] = new String [5];
		double ass_mark [] = new double [5];
		double exam_mark [] = new double [5];
		double Final_mark [] = new double [5];
		char Grade [] = new char [5];
		for(int i=0;i<5;i++){
			System.out.println("Enter name of student "+(i+1)+":");
			name[i] = obj.next();
			System.out.println("Enter Assignment Mark (out of 100)for "+name[i]+":");
			ass_mark[i] = obj.nextDouble();
			System.out.println("Enter Exam Paper Mark (out of 100) for "+name[i]+":");
			exam_mark[i] = obj.nextDouble();
			Final_mark[i]=calcFinalMark(ass_mark[i],exam_mark[i]);
			Grade[i] = findGrades(Final_mark[i]);
			Final_mark[i] = calcFinalMark(ass_mark[i],exam_mark[i]);
			printDetails(name[i],Final_mark[i],Grade[i]);
		}
		System.out.println("Name\t\tFinal Mark\tGrade");
		for (int i=0;i<5;i++){
			System.out.println(name[i]+"\t\t"+Final_mark[i]+"\t\t"+Grade[i]);
		}
		
	}
}