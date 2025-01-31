import java.util.Arrays;
import java.util.stream.Collectors;
/*. Write a program to convert all the strings 
 * in a list to uppercase and print the result 
 * using the Stream API.
 * */
import java.util.*;

public class ConvertStringInAListToUppercase 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Om", "Milind", "Prathmesh", "Nilay", "Yogesh", "Tejas");
		
		System.out.println("Printed by using stream: ");
		names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		
		System.out.println("\nPrinted by converting stream to list: ");
		List<String> filtered = names.stream().map(name ->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(filtered);
		
	}

}
