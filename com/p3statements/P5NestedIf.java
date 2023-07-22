package com.p3statements;

import java.util.Scanner;

public class P5NestedIf {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = s.nextInt();
		
		if( age<0 || age>100 )
			System.out.println("Invalid Age");
		else 
		{
			
			if(age >= 18)
				System.out.println("Eligible to Vote");
			else
				System.out.println("Not Eligible to Vote");
		}
			
	}

}
















