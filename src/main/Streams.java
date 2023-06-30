package main;

import java.util.Arrays;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> languages1 = Arrays.asList("German", "Hindi", "Mandarin");
        String[] languages2 = {"English", "Spanish"};

        //    CREATING A STREAM
        /* from a collection */
        Stream<String> streamFromCollection = languages1.stream();
        /* from an array */
        Stream<String> streamFromArray = Arrays.stream(languages2);
        /* from specified elements */
        Stream<String> streamOfElements = Stream.of("French", "Italian", "Russian");
        /* creating an infinite stream */
        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 1);
        List<Integer> numbers = infiniteStream.limit(25).collect(Collectors.toList());
        System.out.println(numbers);
        numbers.addAll(Arrays.asList(2, 5, 8, 66, 5, 9, 4, 8, 1, 2, 3, 5, 9));

//        MERGING STREAMS
        Stream<String> lng = Stream.concat(streamFromArray, Stream.concat(streamOfElements, streamFromCollection));
        List<String> languages = lng.collect(Collectors.toList());
        System.out.println(languages);

//        FILTER EVEN NUMBERS
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::print);

//        MAP EACH NUMBER TO ITS SQUARE
        List<Integer> squarelist = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squarelist);

//        SORT
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);

//        OMIT DUPLICATES
        List<Integer> noDuplicates = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(noDuplicates);

//        REDUCE
        /* sum of all numbers */
        int sum = noDuplicates.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        /* product of all numbers */
        int product = noDuplicates.stream()
                .reduce(1, (n1, n2) -> n1 * n2);
        System.out.println(product);

//        MATCH
        boolean positive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println(positive);

        boolean greaterThan50 = numbers.stream()
                .anyMatch(n -> n > 50);
        System.out.println(greaterThan50);

        boolean negative = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println(negative);

//        MAX/MIN
        int max = noDuplicates.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(max);

        int min = noDuplicates.stream()
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println(min);

//        COLLECT TO LIST
        List<Integer> evenNumbers = noDuplicates.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

//        SKIP
        List<Integer> skipFirstFive = noDuplicates.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(skipFirstFive);

    }

}

