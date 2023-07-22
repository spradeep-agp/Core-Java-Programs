package com.p1basics;

public class P8PrimitiveToString{
	public static void main(String[] args){
	
		byte a = 5;
		String sa = String.valueOf(a);
		
		short b = 6;
		String sb = String.valueOf(b);
		
		double c = 7.88;
		String sc = String.valueOf(c);
		
		char d = '$';
		String sd = String.valueOf(d);

		boolean e = true;
		String se = String.valueOf(e);

		System.out.println(sa+" : "+sb+" : "+sc+" : "+sd+" : "+se);


	}
}