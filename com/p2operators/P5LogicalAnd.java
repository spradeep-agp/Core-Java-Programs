package com.p2operators;

public class P5LogicalAnd {

	public static boolean fun1() {
		System.out.println("Fun1 Executed...");
		return true;
	}
	
	public static boolean fun2() {
		System.out.println("Fun2 Executed...");
		return true;
	}
	
	public static void main(String[] args) {

		if(fun1() | fun2())
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
			
	}
}
