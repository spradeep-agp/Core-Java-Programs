package com.p2operators;

import java.util.Scanner;

public class P2Relational {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
				
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
	}
}
