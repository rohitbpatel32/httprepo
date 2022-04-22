package com.simplilearntasks;

import java.util.Scanner;

public class Task3 {
	public static void main(String []args) {
	
		float n,p,r;
		double simpleinterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the duration of interest in years");
		n=sc.nextFloat();
		System.out.println("Enter the principal amount to be barrowed");
		p=sc.nextFloat();
		System.out.println("Enter the rate of interest for loan");
		r=sc.nextFloat();
		simpleinterest=(n*p*r)/100;
		System.out.println("Simple inetrest of loan is"+simpleinterest);
	}
}
