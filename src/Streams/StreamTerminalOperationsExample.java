package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTerminalOperationsExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // forEach - prints each element in the stream
        numbers.stream().forEach(System.out::println);

        // toArray - converts the stream elements into an array
        Integer[] array = numbers.stream().toArray(Integer[]::new);
        System.out.println("Array: " + Arrays.toString(array));

        // reduce - performs a reduction operation (in this case, summing the elements)
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("Sum: " + sum.orElse(0));

        // collect - performs a mutable reduction operation (filtering even numbers into a new list)
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // min - finds the minimum element in the stream
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(value -> System.out.println("Min: " + value));

        // max - finds the maximum element in the stream
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        max.ifPresent(value -> System.out.println("Max: " + value));

        // count - counts the number of elements in the stream
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // anyMatch - checks if any element matches a given condition
        boolean anyMatch = numbers.stream().anyMatch(num -> num > 5);
        System.out.println("Any Match (>5): " + anyMatch);

        // allMatch - checks if all elements match a given condition
        boolean allMatch = numbers.stream().allMatch(num -> num > 0);
        System.out.println("All Match (>0): " + allMatch);

        // noneMatch - checks if no elements match a given condition
        boolean noneMatch = numbers.stream().noneMatch(num -> num < 0);
        System.out.println("None Match (<0): " + noneMatch);

        // findFirst - finds the first element in the stream
        Optional<Integer> first = numbers.stream().findFirst();
        first.ifPresent(value -> System.out.println("First: " + value));

        // findAny - finds any element in the stream
        Optional<Integer> any = numbers.stream().findAny();
        any.ifPresent(value -> System.out.println("Any: " + value));

        // iterator - creates an iterator over the stream elements
        Iterator<Integer> iterator = numbers.stream().iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }

        // spliterator - creates a spliterator over the stream elements
        Spliterator<Integer> spliterator = numbers.stream().spliterator();
        spliterator.forEachRemaining(System.out::println);
    }
}
