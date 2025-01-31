package Stream_API.Jan_31_Ques;

/*Write a program to convert all the lower case strings in a list
 * to first letter Uppercase and print the result using the Stream API.
ex -> input -> "abcd" , "efgh" , "jklm" , "xyz" -----> 
      output -> Abcd , Efgh , Jklm , Xyz
*/

import java.util.*;
import java.util.stream.Collectors;

public class FIrstCharacterOfStringIsUpper 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("om", "milind", "nilay", "salman", "mahesh");
		
		System.out.println("Printed by using Stream API: ");
		names.stream().map(name -> name.substring(0,1).toUpperCase() + name.substring(1)).forEach(System.out::println);
		
		System.out.println("\nPrinted by converting Stream API to List: ");
		List<String> capitalizedWords = names.stream().map(name -> name.substring(0, 1).toUpperCase() + name.substring(1)).collect(Collectors.toList());
		System.out.println(capitalizedWords);
	}
}
