package com.training.basic;

public class Amstrong {

	public static void main(String[] args) 
	{
		int start=1;
		int end=100;
		for(int i=start;i<=end;i++)
		{
		int n=i;
		int temp=n;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		int sum=0;
		while(n>0)
		{
		int reminder=n%10;
		int fact=1;
		for(int j=1;j<=count;j++)
		{
			fact=fact*reminder;
		}
		
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Amstrong numbers="+sum);
		}
	}
	}
}


