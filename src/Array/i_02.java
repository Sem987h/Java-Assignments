package Array;

import java.util.Arrays; 

public class i_02 
{
	public static void main(String[] args) 
	{
		int[] num = {25, 14, 56, 15, 36,};
		int[] new_num = new int[07];     
		
		System.out.println("Source Array.. "+Arrays.toString(num));     
		
		for(int i=0; i < num.length; i++) 
		{
			new_num[i] = num[i];
		}
		System.out.println("New Array.. "+Arrays.toString(new_num));
	}
}
