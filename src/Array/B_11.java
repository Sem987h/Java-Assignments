package Array;

import java.util.Arrays;

public class B_11 
{
	public static void main(String[] args) 
	{
		int num[] = {23, 76, 54, 35};
		String[] name = { "Java" ,"Smit", "Hemang" };
		
		System.out.println("Original numeric array.. "+Arrays.toString(num));
	    Arrays.sort(num);
	    System.out.println(" ");
	    
	    System.out.println("Sorted numeric array.. "+Arrays.toString(num));
	    System.out.println(" ");
	    
	    System.out.println("Original string array.. "+Arrays.toString(name));
	    Arrays.sort(name);
	    System.out.println(" ");
	    System.out.println("Sorted string array.. "+Arrays.toString(name));
	}
}
