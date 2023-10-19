package Practice;

import java.util.*;

public class Pangram {

	public static void main(String[] args) {
		
		String str="Pack my box with five dozen liquor jugs";

		str=str.toLowerCase();// Convert the input to lowercase

		Set<Character> alphabetSet=new HashSet<>();

		// Iterate through the string and add lowercase letters to the set
		for(int i=0; i<str.length(); i++) {

			char ch=str.charAt(i);

			if(Character.isLetter(ch)) {
				alphabetSet.add(ch);
			}
		}

		// Check if the set contains all 26 letters of the alphabet
		if(alphabetSet.size()==26) 
		{
			System.out.println("String is Pangram");			
		}
		else 
		{
			System.out.println("String is not Pangram");
		}

	}

}
