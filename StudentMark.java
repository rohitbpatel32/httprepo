package demo;
import practice;
import java.util.Scanner;

public class StudentMark {
	public static void main(String [] args) {
		//declaring and initiallizing the variables
		Scanner sc = new Scanner(System.in);
		float physics,chemistry,maths;
		
		//taking input from the user
		System.out.println("Enter the marks of Physics out of 100?");
		physics = sc.nextFloat();
		System.out.println("Enter the marks of Chemistry out of 100?");
		chemistry = sc.nextFloat();
		System.out.println("Enter the marks of Maths out 100?");
		maths = sc.nextFloat();
		
		
		// getting total marks 
		float total_marks = getTotalMarks(physics,chemistry,maths);
		System.out.println("Total marks of student out 300 is "+total_marks);
		//getting percentage
		float percentage = getPercentage(physics,chemistry,maths);
		System.out.println("Parcentage of student out of 100 is " +percentage);
		// getting grade to students
		String Grade = getgrade(physics,maths,chemistry);
		System.out.println("Grade of student is " +Grade);
	}

	public static String getgrade(float physics, float maths, float chemistry) {
		// TODO Auto-generated method stub
		float percentage = (getTotalMarks(physics, chemistry, maths)/300)*100;
		if(percentage>=80 && percentage>=100)
		{
			return "A+";
		}
		else if(percentage >=60 && percentage<=79) {
			return "A";
		}
		else {
			return "B";
		}
	}

	public static float getPercentage(float physics, float chemistry, float maths) {
		// TODO Auto-generated method stub
		//float totalmarks = physics+maths+chemistry;
		float percentage = (getTotalMarks(physics, chemistry, maths)/300)*100;
		return percentage;
	}

	public static float getTotalMarks(float physics, float chemistry, float maths) {
		// TODO Auto-generated method stub
		float total_marks = physics+chemistry+maths;
		return total_marks;
	}

}