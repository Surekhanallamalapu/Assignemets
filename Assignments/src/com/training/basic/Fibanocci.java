package com.training.basic;

public class Fibanocci {

	public static void main(String[] args) {
		int number1=0,number2=1,number3;
		for(int i=2;i<10;i++)
		{
			number3=number1+number2;
			System.out.println(""+number3);
			number1=number2;
			number2=number3;
			
		}
	}

}
