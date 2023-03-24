package Array;

import java.util.Arrays;

public class i_07 
{
	public static void main(String[] args) 
	{
		int[] num = {55, 23, 54, 87, 14};
		System.out.println("Original num.. "+Arrays.toString(num));            
		Arrays.sort(num);
		int index = num.length-1;
		while(num[index]==num[num.length-1])
		{
			index--;
		}
		System.out.println("Second largest value.. " + num[index]);
	}
}
