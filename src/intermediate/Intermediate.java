package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Intermediate {
//    Find the maximum number in a list using Stream
//    Given a list of integers, use a Stream to find the maximum value.
//
//    List<Integer> numbers = Arrays.asList(1, 5, 3, 9, 7);
//
//    Group people by their age using Stream
//    Given a list of Person objects, group them by age using Collectors.groupingBy.
//
//    class Person {
//        String name;
//        int age;
//        // constructors, getters
//    }
//    List<Person> people = Arrays.asList(
//            new Person("John", 25),
//            new Person("Jane", 30),
//            new Person("Jim", 25),
//            new Person("Jack", 30)
//    );
//
//    Find the average of a list of integers using Stream
//    Given a list of integers, find the average using Stream.
//
//            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//    Remove duplicates from a list of integers using Stream
//    Given a list of integers, remove duplicates and return a new list with unique numbers using distinct().
//
//    List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//
//    Convert a list of strings to a single concatenated string
//    Given a list of strings, concatenate them into one single string, separated by commas.
//
//    List<String> words = Arrays.asList("apple", "banana", "cherry");

    public Integer maxNumber(){
        List<Integer> numbers = Arrays.asList(1, 5, 3, 9, 7);
        return numbers.stream()
                .max(Comparator.naturalOrder()).orElse(-1);
    }

    public Map<Object,List<Person>> groupByAge(){
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Jane", 30),
                new Person("Jim", 25),
                new Person("Jack", 30)
        );

        return people.stream()
                .collect(Collectors.groupingBy(person -> person.getAge()));
    }

    public Double findAverage(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        return numbers.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
    }

    public List<Integer> getDistinct(){
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public String joining(){
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        return words.stream()
                .collect(Collectors.joining(","));
    }
}
