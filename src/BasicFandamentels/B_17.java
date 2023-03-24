package BasicFandamentels;

import java.util.Scanner;

public class B_17 
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char letter = 'a';
		String input = "a";
		boolean flag = true;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
		boolean vowel = false;

		do{
		try{
		System.out.println("Inpt a Letter.. ");
		input = in.nextLine();
		if(input.length() == 1 && Character.isAlphabetic(input.charAt(0))){
		letter = input.charAt(0);
		flag = false;
		} else {
		throw new Exception();
		}
		} catch(Exception e) {
		System.out.println("That is Not a Single Letter.. ");

		}
		}while(flag);

		Character.toLowerCase(letter);

		for(int i = 0; i < vowels.length; i++){
		if(letter == vowels[i]) {
		vowel = true;
		break;
		}
		}

		if(vowel){
		System.out.println("The Letter is Vowel...");
		}else
		System.out.println("The Letter is Consonent...");
	}
}
