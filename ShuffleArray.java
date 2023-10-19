package Practice;

import java.util.*;

public class ShuffleArray {

	public static void main(String[] args) {
		
		// Create an array With values
		Integer[] arr= {1, 2, 3, 4, 5, 6, 7};

		// Convert array to collections-list 
		List<Integer> list = Arrays.asList(arr);
		
		// Shuffle the list
		Collections.shuffle(list);
		
		// Convert the shuffled list back to an array
		Integer[] shuffledArray = list.toArray(new Integer[list.size()]);
		
		// Print the shuffled array
		System.out.println("Array After Shuffling : ");
		
		for(Integer arr1:shuffledArray)
			System.out.print(arr1+" ");

	}
}
