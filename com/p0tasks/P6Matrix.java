package com.p0tasks;

public class P6Matrix {

	public static void main(String[] args) {
		
		
		for(byte row=1; row<=5; row++)
		{
			for(byte col=1; col<=5; col++)
			{
					System.out.print(col%2 +" \t");
			}
			System.out.println();
		}

	}

}


/*
1	0	1	0	1
1	0	1	0	1
1	0	1	0	1
1	0	1	0	1
1	0	1	0	1
*/