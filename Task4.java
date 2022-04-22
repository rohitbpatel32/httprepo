package com.simplilearntasks;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Number is even number");
		}
		else {
			System.out.println("Given number is ODD number");
		}
	}

}
