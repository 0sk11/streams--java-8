package advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Advance {
    /*

    * Find the first non-repeated character in a string using Stream
    Given a string, find the first non-repeated character using Stream.

    String input = "swiss";

    Partition a list of integers into even and odd using partitioningBy
    Given a list of integers, partition them into even and odd numbers using Collectors.partitioningBy.

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    Implement IntStream to find the sum of even numbers between a given range
    Use IntStream to calculate the sum of even numbers between 1 and 100.

    int start = 1;
    int end = 100;

    Flatten a list of lists into a single list
    Given a list of lists, flatten it into a single list using Streams.

    List<List<Integer>> lists = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6),
        Arrays.asList(7, 8, 9)
    );

    Implement a custom Collector to sum squares of all elements in a list
    Create a custom collector to sum the squares of a list of integers.

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    *
    *
    * */
    public boolean uniqueCharacter(Character ch,String str){
        Map<Character, Long> characterCount = str.chars()  // Convert string to an IntStream
                .mapToObj(c -> (char) c)  // Convert each int (Unicode) back to char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Group by character and count
        return characterCount.getOrDefault(ch,0L) == 1;
    }
    public String nonRepeatingCharacter(){
        String input = "swiss";
        return input.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> uniqueCharacter(ch,input))
                .map(String::valueOf)
                .findFirst()
                .orElse(" ");
    }

    public Map<Boolean,List<Integer>> partitioningBy(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        return numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));
    }

    public Integer sumOfEvenNumber(){
        return IntStream.rangeClosed(1,101)
                .filter(num -> (num & 1) == 0)
                .sum();
    }

    public List<Integer> flattenList(){
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        return lists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

}
