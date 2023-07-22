package com.p4array;
class arr10
{
	public static void main(String y[])
	{
		//Jagged Array
		int[][] mat = new int[4][];
		
		mat[0] = new int[4];
		mat[1] = new int[2];
		mat[2] = new int[3];
		mat[3] = new int[1];
		
		mat[0][0] = 1;
		mat[0][1] = 2;
		mat[0][2] = 3;
		mat[0][3] = 4;
		
		mat[1][0] = 11;
		mat[1][1] = 12;
		
		mat[2][0] = 21;
		mat[2][1] = 22;
		mat[2][2] = 23;
		
		mat[3][0] = 33;
		
		System.out.println(mat[2][1]);
		
	}
}