package com.p2operators;

public class P6IncrDecr {

	public static void main(String[] args) {

		int a, b;
		
		a = 5;		
		b = a--; //Post Increment Operator
		System.out.println("a = "+a+"\tb = "+b);
		
		a = 5;
		b = --a; //Pre Increment Operator
		System.out.println("a = "+a+"\tb = "+b);
		
	}
}
