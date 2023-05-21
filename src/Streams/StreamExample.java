package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamExample {
    public static void main(String[] args) {
        // Creating a stream from a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers.stream();

        // Stream operations: intermediate and terminal
        List<Integer> squaredNumbers = stream
                .filter(n -> n % 2 == 0)        // Intermediate operation: filtering even numbers
                .map(n -> n * n)                // Intermediate operation: squaring the numbers
                .collect(Collectors.toList());  // Terminal operation: collecting the squared numbers

        System.out.println("Squared numbers: " + squaredNumbers);

        // Stream creation and modification
        Stream<String> stringStream = Stream.of("Hello", "Java", "Streams");

        long count = stringStream
                .map(String::toUpperCase)       // Intermediate operation: converting to uppercase
                .peek(System.out::println)      // Intermediate operation: printing each element
                .count();                       // Terminal operation: counting the elements

        System.out.println("Count: " + count);

        // Stream reduction
        Stream<Integer> numStream = Stream.of(1, 2, 3, 4, 5);

        int sum = numStream
                .reduce(0, Integer::sum);        // Reducing the stream to calculate the sum

        System.out.println("Sum: " + sum);

        // Infinite streams
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);

        List<Integer> evenNumbers = infiniteStream
                .limit(5)                        // Limiting the infinite stream to 5 elements
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
    }
}
