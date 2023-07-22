package com.p4array;

public class arr2
{
	public static void main(String x[])
	{

		//Declaring array
		double[] mark;

		//defining the size of the array
		mark = new double[5];
		
		//Assigning values to the arrays
		mark[0]=85.5;
		mark[1]=92.3;
		mark[2]=78.4;
		mark[3]=66.8;
		mark[4]=91.8;

		//Displaying the array values
		for(int i=0; i<mark.length; i++)
			System.out.println(mark[i]);

	}
}
		