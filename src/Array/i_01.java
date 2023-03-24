package Array;

import java.util.Arrays;

public class i_01 
{
		public static void main(String[] args) 
		{
			int[] element = {25, 14, 56, 15, 36, 56,};
	   
			System.out.println("Original Array.. "+Arrays.toString(element));     
			
			int removeIndex = 1;

			for(int i = removeIndex; i < element.length -1; i++)
			{
				element[i] = element[i + 1];
			}
			System.out.println("After removing the second element.. "+Arrays.toString(element));
		}
}
