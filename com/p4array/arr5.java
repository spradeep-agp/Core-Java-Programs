package com.p4array;

public class arr5
{
	public static void main(String x[])
	{
		//Declaring & Assigning the array
		int[] num = {11,3,14,7,32,28,84,61};

		for(int i=0;i<num.length;i++)
			if(num[i]%7 == 0)
				System.out.println(num[i]);
	}
}
		