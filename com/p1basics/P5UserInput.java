package com.p1basics;

import java.util.Scanner;

public class P5UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Name : ");
		String a = sc.nextLine();
		
		System.out.print("Enter Last Name : ");
		String b = sc.nextLine();
		
		String res = a + b;
		
		System.out.println(res);
		
	}
}
