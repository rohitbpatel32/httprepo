package com.simplilearntasks;

import java.util.Scanner;

public class ArithmeticCalcy {
	public static void main(String []args) {
		
		float n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n1 and n2");
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		
		int j;
		do {
		System.out.println("Enter 1 for addition, enter 2 for multiplication, enter 3 for divison and enter 4 substraction");
		int ch=sc.nextInt();
		switch(ch) {
		
		case 1 : float addition = n1+n2;
		System.out.println(+addition);
					break;
		case 2 : float product = n1*n2;
		System.out.println(product);
					break;
		case 3 : float divison = n1/n2;
		System.out.println(divison);
				break;
		case 4: float subtraction =n1-n2;
		System.out.println(subtraction);
			break;
		}
		System.out.println("Press 0 to continue");
		j = sc.nextInt();
		}
		
		while(j==0);System.out.println("SUccessful exit");
	}
	
	

}
