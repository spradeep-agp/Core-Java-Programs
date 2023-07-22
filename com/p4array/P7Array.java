package com.p4array;
public class P7Array
{
	public static void main(String u[])
	{
		int[][] num1 = new int[3][2];
		
		num1[0][0] = 3;
		num1[0][1] = 4;
		
		num1[1][0] = 5;
		num1[1][1] = 6;
		
		num1[2][0] = 7;
		num1[2][1] = 8;
		
		//System.out.println("\nnum1[2][0] = "+num1[2][0]);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(num1[i][j]+" \t");
			}
			System.out.println();
		}
	}
}