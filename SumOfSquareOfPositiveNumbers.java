package Stream_API.Jan_30_filterQues;

import java.util.Arrays;
import java.util.stream.Stream;

/*Ques - 4
------------
Write a Java program that reads an array of integers, filters out the negative numbers, and then calculates the sum of the squares of the remaining positive numbers using streams and the reduce method.

Input:
Input array: [-3, 2, -5, 6, -1, 4]
Output:
Sum of squares of positive numbers: 56
*/

public class SumOfSquareOfPositiveNumbers 
{
	public static void main(String[] args) 
	{
		int[] array = {-3, 2, -5, 6, -1, 4};
		
		int sum = Arrays.stream(array).filter(arr -> (arr > 0)).map(x -> x*x).sum();
		System.out.println("Sum of squares of positive numbers:  "+ sum);
	}
}
