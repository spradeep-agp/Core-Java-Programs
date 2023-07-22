package com.p1basics;

import java.util.Scanner;

public class P4UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		
		int res = a + b;
		
		System.out.println(res);
		
	}
}
