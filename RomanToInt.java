package Practice;
import java.util.*;

public class RomanToInt {

	public static int romanToInt(String s) {


		// Create a HashMap to store the values of Roman numbers
		Map<Character, Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = map.get(s.charAt(s.length()-1));

		// Iterate through the Roman numeral string in reverse order
		for(int i=s.length()-2; i >=0; i--) {

			// If the current value is smaller than the previous value, subtract it
			if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {

				result-=map.get(s.charAt(i));
			}
			
			// Else add it
			else {
				result+=map.get(s.charAt(i));

			}

		}
		return result;

	}

	public static void main(String[] args) {
		String romanNumber="XMVLDIV"; // Convert this roman number to integer
		int integerEquivalent = romanToInt(romanNumber);
		System.out.println("The integer equivalent of Roman Number '"+romanNumber+"' is:"+integerEquivalent);
	}
}
