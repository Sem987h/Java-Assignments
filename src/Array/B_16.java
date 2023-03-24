package Array;

import java.util.Arrays;

public class B_16 
{
	static int max;
	static int min;
	
	public static void max_min(int num[]) 
	{
		max = num[0];
		min = num[0];
		int len = num.length;
		for (int i = 1; i < len - 1; i = i + 2) 
		{
			if (i + 1 > len) 
			{
				if (num[i] > max) max = num[i];
				if (num[i] < min) min = num[i];
			}
			if (num[i] > num[i + 1]) 
			{
				if (num[i] > max) max = num[i];
				if (num[i + 1] < min) min = num[i + 1];
			}
			if (num[i] < num[i + 1]) 
			{
				if (num[i] < min) min = num[i];
				if (num[i + 1] > max) max = num[i + 1];
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] num = {25, 14, 56, 15, 36, 56,};
		max_min(num);
		System.out.println(" All Numbers.. "+Arrays.toString(num));
		System.out.println(" ");
		System.out.println(" Maximun of Numbers.. " + max);
		System.out.println(" ");
		System.out.println(" Minimum of Numbers.. " + min);
		System.out.println(" ");
	}
}




