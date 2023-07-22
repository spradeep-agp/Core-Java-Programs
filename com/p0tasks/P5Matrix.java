package com.p0tasks;

public class P5Matrix {

	public static void main(String[] args) {
		
		
		for(byte row=1; row<=5; row++)
		{
			for(byte col=1; col<=5; col++)
			{
				if(col%2 ==1)
					System.out.print("1 \t");
				else
					System.out.print("0\t");
				
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