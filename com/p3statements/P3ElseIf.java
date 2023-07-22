package com.p3statements;

import java.util.Scanner;

public class P3ElseIf {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number [1-5] : ");
		int num = s.nextInt();
		
		if(num == 1)
			System.out.println("One");
		else if(num == 2)
			System.out.println("Two");
		else if(num == 3)
			System.out.println("Three");
		else if(num == 4)
			System.out.println("Four");
		else if(num == 5)
			System.out.println("Five");
		else
			System.out.println("Invalid Input");
		

	}

}
















