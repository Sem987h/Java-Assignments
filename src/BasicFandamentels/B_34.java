package BasicFandamentels;

import java.util.Scanner;

public class B_34 
{
	public class BasicJavaProgram 
	{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);

			double num1, num2;
			System.out.print("Enter two double values.. ");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();

			if (num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1) 
			{
				System.out.println("true");
			}
			else 
			{
				System.out.println("false");
			}
		}		
	}
}