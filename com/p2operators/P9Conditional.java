package com.p2operators;

public class P9Conditional {

	//Conditional Or Ternary Operator
	//(condition) ? true-block : false-block
	
	public static void main(String[] args) {
		
		int a = 210, b = 150;

		System.out.println( ((a>b) ? a : b) + " is biggest number ");
		
		System.out.println( a + " is "+ ((a%2==0) ? "Even" : "Odd") + " number ");
	}

}
