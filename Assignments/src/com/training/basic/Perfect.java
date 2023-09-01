package com.training.basic;

public class Perfect {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			int sum=0;
			int temp=i;
			if(100%i==0)
			{
				sum=sum+i;
			}
			if(temp==sum)
			{
				System.out.println("perfect number="+sum);
			}
		}
	}

}
