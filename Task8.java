package com.simplilearntasks;

import java.util.Scanner;

public class Task8 {
	
	private float length;
	private float breadth;
	
	void length(Scanner sc) {
		length=sc.nextFloat();
		this.length=length;
	}
	void breadth(Scanner sc) {
		breadth=sc.nextFloat();
		this.breadth=breadth;
	}

	void area() {
		float area = length*breadth;
		System.out.println("The area of rectangle is : "+area);
	}
	float perimeter( ) {
		float perimeter=2*(length+breadth);
		return perimeter;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task8 q=new Task8();
		System.out.println("Enter the breadth of rectangle");
		q.breadth(sc);
		System.out.println("Enter the length of rectangle");
		q.length(sc);
		q.area();
		System.out.println("The perimeter of rectangle is :"+q.perimeter());
		
		
	}
}
