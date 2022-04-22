package com.simplilearntasks;

import java.util.Scanner;

public class Task2 {
	public static void main(String []args) {
		
		float n;
		float cube,square;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to get square and cube of number");
		n=sc.nextFloat();
		cube = n*n*n;
		square = n*n;
		System.out.println("Cube of n is: "+cube);
		System.out.println("Square of n is : "+square);
	}

}
