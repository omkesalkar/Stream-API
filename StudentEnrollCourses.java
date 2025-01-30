




package Stream_API.Jan_30_filterQues;

import java.util.Arrays;
import java.util.List;

/*Ques - 3
-----------
You have a Student record with the following fields:
name : (String)
course : (String)

Create a ELC class StudentFilter.
Given a list of Student objects, where each student is enrolled in different courses, write a Java program to filter out the students who are enrolled in the "Java" course and print their names using the forEach method and the stream API.

Test Case 1:
Input:
List<Student> students =  [("Alice", "Java"),
   ("Bob", "Python"),
   ("Charlie", "Java"),
   ("David", "C++"),
   ("Eve", "JavaScript")]
Expected Output:
Alice
Charlie

*/

import java.util.stream.*;

record Student(String name, String course)
{
	
}

public class StudentEnrollCourses 
{
	public static void main(String[] args)
	{
		List<Student> students = Arrays.asList(
						new Student("Alice", "Java"),
						new Student("Bob", "Python"),
						new Student("Charlie", "Java"),
						new Student("David", "C++"),
						new Student("Eve", "JavaScript")
						);
		
		//prints all details
		students.stream().filter(stu -> stu.course().equals("Java")).forEach(System.out::println);
		
		//print name only
		students.stream().filter(stu -> stu.course().equals("Java")).forEach(x -> System.out.println(x.name()));
	}

}
