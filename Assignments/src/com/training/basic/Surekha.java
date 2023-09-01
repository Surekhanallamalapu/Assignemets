package com.training.basic;

import java.util.Scanner;

public class Surekha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[5];
		int sum=0;
		for(int val:arr)
		{
			val=sc.nextInt();
			sum=sum+val;
			
		}
		System.out.println(sum);
		
	}

}
