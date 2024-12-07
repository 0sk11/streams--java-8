package beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Beginner {
//    Filter even numbers from a list of integers using Stream
//    Given a list of integers, use a stream to filter out all even numbers and print the result.
//
//            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//    Sum all numbers using IntStream
//    Given an array of integers, use an IntStream to find the sum of all elements.
//
//    int[] numbers = {1, 2, 3, 4, 5};
//
//    Square all numbers in a list using Stream
//    Given a list of integers, return a list of squares of all the numbers using Stream.
//
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//    Convert a list of strings to uppercase using Stream
//    Given a list of strings, return a list where each string is converted to uppercase using Stream.
//
//            List<String> words = Arrays.asList("java", "python", "ruby");
//
//    Check if all numbers are positive in a list using Stream
//    Given a list of integers, check if all numbers are positive using Stream’s allMatch.
//
//    List<Integer> numbers = Arrays.asList(1, -2, 3, 4, 5);

    public List<Integer> evenNumbers(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        return numbers.stream()
                .filter(number -> (number & 1) == 0)
                .collect(Collectors.toList());
    }

    public Integer sumUsingIntstream(){
        int[] numbers = {1, 2, 3, 4, 5};
        return IntStream.of(numbers)
                .sum();
    }

    public List<Integer> listOfSquares(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }

    public List<String> returnUpperCase(){
        List<String> words = Arrays.asList("java", "python", "ruby");
        return words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());
    }

    public Boolean ifAllNumbersPositive(){
        List<Integer> numbers = Arrays.asList(1, -2, 3, 4, 5);
        return numbers.stream()
                .allMatch(number -> number >= 0);
    }

}
