package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		int[] arr= {7,4,5,111,6,8};
		//Greatest
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if(max<arr[i])
			{
				max=arr[i];
			
				
			}
		}
			System.out.println(max);
		//smallest	
			int min=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(min>arr[i])
				{
					min=arr[i];
				}
			}
			System.out.println(min);	
		
	}

}
