package com.p3statements;

public class P10Break {

	public static void main(String[] args) {
		
		abc:
		for(byte row=1; row<=5; row++)
		{
			for(byte col=1; col<=5; col++)
			{
				if(col==3)
					break abc;
				System.out.print(col);
			}
			System.out.println();
		}
		
		System.out.println("\nEnd of the program...");

	}

}


/*
1	0	1	0	1
1	0	1	0	1
1	0	1	0	1
1	0	1	0	1
1	0	1	0	1
*/