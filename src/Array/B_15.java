package Array;

public class B_15 
{
		public static int  findIndex (int[] num, int t) 
		{
			if (num == null) return -1;
			int len = num.length;
			int i = 0;
			while (i < len) 
			{
				if (num[i] == t) return i;
				else i=i+1;
			}
		        return -1;
		}
		public static void main(String[] args) 
		{
			int[] num = {25, 14, 56, 15, 36,};
			System.out.println("Index position of 25 is.. " + findIndex(num, 25));
			System.out.println("Index position of 56 is.. " + findIndex(num, 56));
		}
}
