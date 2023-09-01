package com.training.basic;

public class PatternDifference {

	public static void main(String[] args) {
		int increment=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(increment+"");
				increment++;
			}
			System.out.print(" ");
		}
	}

}
