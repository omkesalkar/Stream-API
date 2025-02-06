package Stream_API.Feb_06_LabQues;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Use Stream.iterate or Stream.generate to create an infinite stream. 
 * Then filter and map the data to produce the first 10 odd squares.
*/

public class StreamProgram2 
{
	public static void main(String[] args) 
	{
		List<Integer> oddSquare = Stream.iterate(1, n -> n+1)  //Infinite Stream starting from 1
				.filter(n -> n%2!=0)  //filter odd number
				.map(n -> n*n) //Square off odd numbers
				.limit(10)  //Set limit to 10
				.collect(Collectors.toList());  //convert Stream into list
		
		System.out.println(oddSquare);  //printing the list
	}
}
