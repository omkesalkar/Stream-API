package Stream_API.Jan_31_Ques;

/* Given a list of Employee objects with id and salary properties, 
 * write a program to sort the list of Employees by salary in descending order
 *  using the Stream API.*/

import java.util.*;
import java.util.stream.Collectors;

record Employee(int id, int salary)
{
	
}

public class SortEmployeeBySalaryInDescending
{
	public static void main(String[] args) 
	{
		List<Employee> employees = Arrays.asList(
				new Employee(1, 90000),
				new Employee(2, 78000),
				new Employee(3,  56999),
				new Employee(4, 98220)
				);
		
		System.out.println("Printed by using Stream in Descending order: ");
		employees.stream().sorted(Comparator.comparingInt(Employee::salary).reversed()).forEach(System.out::println);
		
		
		System.out.println("\nPrinted by using stream to list Descending Order: ");
		List<Employee> filtered = employees.stream().sorted(Comparator.comparingInt(Employee::salary).reversed()).collect(Collectors.toList());
		System.out.println(filtered);
	}
}
