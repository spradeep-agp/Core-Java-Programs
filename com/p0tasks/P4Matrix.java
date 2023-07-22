package com.p0tasks;

public class P4Matrix {

	public static void main(String[] args) {
		
		
		for(byte row=1; row<=5; row++)
		{
			byte a = 1;
			for(byte col=1; col<=5; col++)
			{
				System.out.print(a+"\t");
				if(a == 1)
					a = 0;
				else
					a = 1;
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