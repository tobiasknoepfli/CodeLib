package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamModificationExample {
    public static void main(String[] args) {
        // Sorting elements
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted() // Sort the elements in natural order
                .collect(Collectors.toList());

        System.out.println("Sorted numbers: " + sortedNumbers);

        // Distinct elements
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Integer> distinctNumbers = duplicateNumbers.stream()
                .distinct() // Filter out duplicate elements
                .collect(Collectors.toList());

        System.out.println("Distinct numbers: " + distinctNumbers);

        // Filtering elements
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Alice", "Bob");
        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 3) // Filter names with length greater than 3
                .collect(Collectors.toList());

        System.out.println("Filtered names: " + filteredNames);

        // Mapping elements to a different type
        List<String> namesList = Arrays.asList("John", "Jane", "Adam");
        List<Integer> nameLengths = namesList.stream()
                .map(String::length) // Map names to their lengths
                .collect(Collectors.toList());

        System.out.println("Name lengths: " + nameLengths);

        // FlatMap operation
        List<List<Integer>> numberGroups = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flattenedNumbers = numberGroups.stream()
                .flatMap(List::stream) // Flatten the nested lists into a single stream
                .collect(Collectors.toList());

        System.out.println("Flattened numbers: " + flattenedNumbers);

        // Combining multiple streams
        List<Integer> stream1 = Arrays.asList(1, 2, 3);
        List<Integer> stream2 = Arrays.asList(4, 5, 6);
        List<Integer> combinedStream = Stream.concat(stream1.stream(), stream2.stream())
                .collect(Collectors.toList());

        System.out.println("Combined stream: " + combinedStream);
    }
}
