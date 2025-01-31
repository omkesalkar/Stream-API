package Stream_API.Jan_31_Ques;

import java.util.*;
import java.util.stream.Collectors;

/* 1. Given a list of Person objects with name and age 
 * properties, write a program to sort the list of persons 
 * by age in ascending order using the Stream API.
*/

record Person(int age, String name)
{
	
}

public class SortPersonAgeUsingStream 
{
	public static void main(String[] args) 
	{
		List<Person> person = Arrays.asList(
				new Person(22, "Om"),
				new Person(25, "Milind"),
				new Person(23, "Salman"),
				new Person(28, "Amarjeet"),
				new Person(18, "Sanket")
				);
		
		System.out.println("Printed by converting List to stream: ");
		person.stream().map(x -> x.age()).sorted().forEach(System.out::println);
		
		System.out.print("\nPrinted by converting stream to List: ");
		List<Integer> sortedPerson = person.stream().map(x -> x.age()).sorted().collect(Collectors.toList());
		System.out.println(sortedPerson);
		
		System.out.println("\nSorted Person List: ");
		List<Person> sortedPersons = person.stream().sorted(Comparator.comparingInt(x -> x.age())).collect(Collectors.toList());
		sortedPersons.forEach(System.out::println);
	}
}
