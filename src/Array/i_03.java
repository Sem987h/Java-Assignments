package Array;

import java.util.Arrays; 

public class i_03 
{
	public static void main(String[] args) 
	{
		int[] num = {25, 14, 56, 15, 36,};
	   
		int Index_position = 2;
		int newValue    = 5;
		
		System.out.println("Original Array.. "+Arrays.toString(num));     
		
		for(int i=num.length-1; i > Index_position; i--)
		{
			num[i] = num[i-1];
		}
		num[Index_position] = newValue;
		System.out.println("New Array..  "+Arrays.toString(num));
	}
}
