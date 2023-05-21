package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamCreationExample {
    public static void main(String[] args) {
        // Creating a stream from an array
        String[] array = {"Hello", "Java", "Streams"};
        Stream<String> arrayStream = Arrays.stream(array);

        System.out.println("Array Stream:");
        arrayStream.forEach(System.out::println);

        // Creating a stream from a list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> listStream = list.stream();

        System.out.println("\nList Stream:");
        listStream.forEach(System.out::println);

        // Creating a stream using Stream.of()
        Stream<String> stringStream = Stream.of("Hello", "Java", "Streams");

        System.out.println("\nString Stream:");
        stringStream.forEach(System.out::println);

        // Creating a stream of primitive values using IntStream
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(numbers);

        System.out.println("\nIntStream:");
        intStream.forEach(System.out::println);

        // Creating an empty stream
        Stream<String> emptyStream = Stream.empty();

        System.out.println("\nEmpty Stream:");
        emptyStream.forEach(System.out::println);

        // Creating a stream of random numbers using Stream.generate()
        Stream<Double> randomStream = Stream.generate(Math::random)
                .limit(5); // Limiting the stream to 5 random numbers

        System.out.println("\nRandom Stream:");
        randomStream.forEach(System.out::println);

        // Creating a stream of sequential numbers using Stream.iterate()
        Stream<Integer> sequentialStream = Stream.iterate(1, n -> n + 1)
                .limit(5); // Limiting the stream to 5 sequential numbers

        System.out.println("\nSequential Stream:");
        sequentialStream.forEach(System.out::println);
    }
}
