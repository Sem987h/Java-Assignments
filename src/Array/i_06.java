package Array;

public class i_06 
{
	public static void main(String[] args) 
	{
		String[] name = {"Sem", "Smit", "Sem", "Hemang", "Meet", "Hemang"};
		
		for (int i = 0; i < name.length-1; i++)
		{
			for (int j = i+1; j < name.length; j++)
			{
				if( (name[i].equals(name[j])) && (i != j) )
				{
					System.out.println("Duplicate Name is : "+name[j]);
				}
			}
		}
	}    
}
