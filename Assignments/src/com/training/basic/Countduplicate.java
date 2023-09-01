package com.training.basic;

public class Countduplicate {

	public static void main(String[] args) {
		int[] arr= {2,7,5,2,4,5};
		int duplicateCount=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					duplicateCount++;
			}
			
			
		}
		System.out.println("count="+duplicateCount);
	}

}
