package BasicFandamentels;

import java.util.Scanner;

public class B_24 
{
	public static void main(String[] args) 
	{
		
		     int no_row,c=1,blk,i,j;
		     System.out.print("Input number of rows.. ");
		     Scanner in = new Scanner(System.in);
		 		    no_row = in.nextInt();
		     for(i=0;i<no_row;i++)
		     {
		         for( int k=no_row;k>0;k--)
		        	 System.out.print(" ");
		         for(j=0;j<=i;j++)
		         {
		             if (j==0||i==0)
		                 c=1;
		             else
		                c=c*(i-j+1)/j;
		             System.out.print(c+" ");
		         }
		         System.out.println();
		     }
	}
}
