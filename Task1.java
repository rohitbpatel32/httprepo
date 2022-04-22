package com.simplilearntasks;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		float n1,n2;
		float product;
		double division;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n1");
		n1=sc.nextInt();
		System.out.println("Enter the numbaer n2");
		n2=sc.nextInt();
		product = n1*n2;
		division=n1/n2;
		System.out.println(+product);
		System.out.println(+division);
	}

}
