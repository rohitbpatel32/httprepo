package com.simplilearntasks;

import java.util.Scanner;

public class Task7 {
	private int n;
	public void n() {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	 this.n=n;
	}
	
	public void square() {
		
		float square=n*n;
		System.out.println("Square of n is: "+square);
	}
	public float cube( ) {
		float cube=n*n*n;
		return cube;
	}
	public static void main(String[] args) {
		
		Task7 obj = new Task7();
		System.out.println("ENter the value of n");
		obj.n();
		obj.square();
		System.out.println(obj.cube());
		
	}
}
