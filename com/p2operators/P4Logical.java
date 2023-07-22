package com.p2operators;

public class P4Logical {

	public static void main(String[] args) {

		// && - AND operator
		// If every condition is true: returns true
		// Even one condition fails : return false
		System.out.println("===========AND==========");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		// || - OR operator
		// Even one condition is true : returns true
		// If every condition is false: returns false
		System.out.println("===========OR==========");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);


		// ! - NOT operator
		// If condition is true: returns false
		// If condition is false: returns true
		System.out.println("===========NOT==========");
		System.out.println(! true);
		System.out.println(! false);
	}
}
