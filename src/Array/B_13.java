package Array;

public class B_13 
{
	public static void main(String[] args) 
	{
		int num[] = new int[]{67,24,89,53,-12,83,-96};

		int sum = 0;
		for(int i=0; i < num.length ; i++)
			sum = sum + num[i];
		
		double average = sum / num.length;
		System.out.println("Average value of the array elements is.. " + average); 
	}
}
