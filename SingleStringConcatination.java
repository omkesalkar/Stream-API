package Stream_API.Jan_30_filterQues;

/*Ques - 2
-----------
Write a Java program that uses the Stream.of method to create a stream of strings, filters out the empty strings, and then concatenate the remaining strings into a single string..

Input:
A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].

Output:
A single concatenated string:
HelloWorld from Java!
*/

import java.util.stream.*;

public class SingleStringConcatination 
{
	public static void main(String[] args) 
	{
		Stream<String> string = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!");
		
		System.out.println("A single concatenated string: ");
		String s = string.filter(str -> !str.isEmpty()).collect(Collectors.joining(""));
		System.out.println(s);
	}
}
   