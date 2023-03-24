package Array;

public class B_14 
{
	public static boolean contains(int[] arr, int item) {
		for (int n : arr) 
		{
			if (item == n) 
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		int[] num = {23, 56, 38, 48, 95};
		System.out.println(contains(num, 15));
		System.out.println(contains(num, 95));
	}
}
