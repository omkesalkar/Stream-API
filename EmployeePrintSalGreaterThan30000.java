package Stream_API.Jan_30_filterQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Create a record of Employee with attributes name:(String) and id:(String)
Given a list of Employee objects with name and salary properties, 
write a program to filter the list of Employees by salary in
who are having salary > 30000 and print the employee names.
*/


record Employee(String id, String name, int Salary)
{
	
}

public class EmployeePrintSalGreaterThan30000 
{
	public static void main(String[] args) 
	{
		List<Employee> emp = Arrays.asList(
				new Employee("1", "Om", 97000),
				new Employee("2", "Salman", 88000),
				new Employee("3", "Nilesh", 29000),
				new Employee("4", "Milind", 92000),
				new Employee("5", "Alex", 26000) );
		
		emp.stream().filter(e -> e.Salary()>30000).forEach(x -> System.out.println(x.name()));
	}
}
