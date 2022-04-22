package com.simplilearntasks;

import java.util.Scanner;

public class Emp_Details {
	 static int empcode;
	static String empName,empEmail;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empcode ");
		empcode=sc.nextInt();
		System.out.println("Enter the empName ");
		empName=sc.next();
		System.out.println("Enter the empEmail ");
		empEmail=sc.next();
		Emp_Details a=new Emp_Details();
		a.display(empcode, empEmail, empEmail);
	}
	private void display(int empcode, String empName, String empEmail) {
		
		// TODO Auto-generated method stub
		System.out.println(empcode+" "+empName+"  "+empEmail);
	}
	
	
}
