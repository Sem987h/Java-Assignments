package Array;

import java.util.Arrays;

public class i_05 
{
	public static void main(String[] args) 
	{
		int[] num = {1, 2, 5, 5, 8, 8, 7, 2};
		
		for (int i = 0; i < num.length-1; i++)
		{
			for (int j = i+1; j < num.length; j++)
			{
				if ((num[i] == num[j]) && (i != j))
				{
					System.out.println("Duplicate Element : "+num[j]);
				}
			}
		}
	}    
}
