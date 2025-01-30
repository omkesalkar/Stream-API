package Stream_API.Jan_30_filterQues;

/* Question - 1
------------
Write a Java program that creates a stream of integers using Stream.of, filters out the even numbers and then prints each squared number using forEach.
Input (Stream):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
Output:
2
4
6
8
10*/

import java.util.stream.*;

public class FindEvenAndSquaredNoUsingStreamOfORFilter 
{
	public static void main(String[] args) 
	{
		Stream<Integer> nums = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("Even numbers of Stream: ");
		nums.filter(num -> num % 2==0).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Square of Even numbers of stream: ");
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(num -> num % 2 == 0).forEach(x -> System.out.println(x*x));
		
		System.out.println();
		System.out.println("Square of stream: ");
		Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(x -> System.out.println(x*x));
		
		System.out.println();
		System.out.println("Odd numbers of stream: ");
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(num -> num % 2 != 0).forEach(System.out::println);
		
	
		System.out.println();
		System.out.println("Square of Odd numbers of stream: ");
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(num -> num % 2 != 0).forEach(x -> System.out.println(x*x));
	}

}
