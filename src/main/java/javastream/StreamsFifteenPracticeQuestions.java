package javastream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.jcp.xml.dsig.internal.dom.DOMEnvelopedTransform;

public class StreamsFifteenPracticeQuestions {

	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5);
		// 1. Find the sum of all elements in a List using streams.
		int sum = nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println("1. sum is: "+ sum);

        // 2. Given a List of integers, write a program to find the maximum element using streams.
		Integer max = nums.stream().max(Comparator.naturalOrder()).get();
		System.out.println("2. max num is: "+max);
		
        // 3. Given a List of strings, write a program to count the number of strings that start with a specific character using streams.
		List<String> fruits = Arrays.asList("cherry","banana","coconut", "berry", "cantaloupe");
		long count = fruits.stream().filter(fruit->fruit.startsWith("c")).count();
		System.out.println("3. count is: "+count);

        // 4. Convert a List of strings to uppercase using streams.
		fruits.stream().map(str->str.toUpperCase()).forEach(System.out::println);

        // 5. Given a List of integers, write a program to filter out the even numbers using streams.
        //    Count the number of elements in a list that satisfy a specific condition using streams.
		long evncount = nums.stream().filter(num->num%2==0).count();
		System.out.println("5. even count is: "+evncount);

        // 6. Write a program to find the average of a List of floating-point numbers using streams.

        // 7. Given a List of strings, write a program to concatenate all the strings using streams.

        // 8. Write a program to remove duplicate elements from a List using streams.

        // 9. Given a List of objects, write a program to sort the objects based on a specific attribute using streams.

        // 10. Write a program to check if all elements in a List satisfy a given condition using streams.

        //Extra practice questions

        // 11. Given a List of integers, write a program to find the difference between the maximum and minimum elements using streams.

        // 12. Write a program to check if a List of strings contains at least one uppercase word using streams.

        // 13. Given a List of integers, write a program to filter out the prime numbers using streams.

        // 14. Write a program to check if a List of strings contains any duplicates using streams.

        // 15. Given a List of strings, write a program to count the total number of characters in all strings using streams.


	}

}
