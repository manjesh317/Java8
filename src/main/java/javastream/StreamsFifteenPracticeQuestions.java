package javastream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class StreamsFifteenPracticeQuestions {

	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,2,4);
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
		List<Double> floatNums = Arrays.asList(1.1,2.2,3.3,4.4,5.5);
		 double average = floatNums.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		System.out.println("6. avaerage is: "+average);
		
        // 7. Given a List of strings, write a program to concatenate all the strings using streams.
		String concatenatedString = fruits.stream().collect(Collectors.joining(","));
		System.out.println("7. concatenated string is: "+concatenatedString);

        // 8. Write a program to remove duplicate elements from a List using streams.
		List<Integer> disticntList = nums.stream().distinct().collect(Collectors.toList());
		System.out.println("8. distinct list is: "+disticntList);

        // 9. Given a List of objects, write a program to sort the objects based on a specific attribute using streams.
		List<Person> people = Arrays.asList(
				new Person("Alice", 21),
				new Person("charlie", 29),
				new Person("Bob", 30),
				new Person("Barbai", 56),
				new Person("Anna", 20));
//		Collections.sort(people,Comparator.comparing(Person::getAge));
//		System.out.println(people);
		people.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);;
		

        // 10. Write a program to check if all elements in a List satisfy a given condition using streams.
		List<Integer> nums1 = Arrays.asList(2,4,6,8,10,7);
		boolean allEvene = nums1.stream().allMatch(elemment->elemment%2==0);
		System.out.println("all Even: "+allEvene);
		

        //Extra practice questions

        // 11. Given a List of integers, write a program to find the difference between the maximum and minimum elements using streams.
		

        // 12. Write a program to check if a List of strings contains at least one uppercase word using streams.

        // 13. Given a List of integers, write a program to filter out the prime numbers using streams.

        // 14. Write a program to check if a List of strings contains any duplicates using streams.

        // 15. Given a List of strings, write a program to count the total number of characters in all strings using streams.


	}

}
