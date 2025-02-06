package Stream_API.Feb_06_LabQues;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*Write a program to process a list of strings. Use a custom predicate 
 * to filter strings that start with a vowel and have a length greater than 5.*/

public class StreamProgram1 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("apple", "orange", "banana", "umbrella", "elephant", "icecream", "octopus", "grape");
		
        // Custom predicate to filter strings starting with a vowel and length > 5
		Predicate<String> customfiltered = str -> str.length()>5 && str.matches("^[AEIOUaeiou].*");
		
		List<String> filteredWords = list.stream()
											.filter(customfiltered)
											.collect(Collectors.toList());
		
		System.out.println(filteredWords);
	}
}
