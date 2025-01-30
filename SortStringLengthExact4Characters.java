package Stream_API.Jan_30_filterQues;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Write a Java program that processes a list of names to filter, sort, and print names with a length of exactly 4 characters.
Requirements:
Use a list of strings containing names as input.
Filter out names that are not exactly 4 characters long.
Sort the filtered names in lexicographical order (alphabetical order).
Limit the output to the first 2 names after sorting.
Print each name on a new line.

Input : 
A List of strings: ["Toby", "Anna", "Leroy", "Alex"]
Expected Output:
Anna
Alex
*/

public class SortStringLengthExact4Characters
{	
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Toby","Anna", "Leroy", "Alex");
		
		//Print directly by using stream
		names.stream().filter(name -> name.length()==4).sorted().limit(2).forEach(System.out::println);
		
		//Print by converting stream to list
		List<String> filteredNames = names.stream().filter(name -> name.length()==4).sorted().limit(2).collect(Collectors.toList());
		System.out.println(filteredNames);
	}
	
}
