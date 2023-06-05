package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperationsExample {
    public static void main(String[] args) {
        // Filtering
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)  // Keep only even numbers
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Mapping
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        List<Integer> nameLengths = names.stream()
                .map(String::length)  // Map each name to its length
                .collect(Collectors.toList());
        System.out.println("Name lengths: " + nameLengths);

        // FlatMap
        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flattenedNumbers = nestedNumbers.stream()
                .flatMap(Collection::stream)  // Flatten the nested lists
                .collect(Collectors.toList());
        System.out.println("Flattened numbers: " + flattenedNumbers);

        // Sorting
        List<String> sortedNames = names.stream()
                .sorted()  // Sort the names in natural order
                .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);

        // Limiting
        List<Integer> limitedNumbers = numbers.stream()
                .limit(3)  // Keep only the first 3 numbers
                .collect(Collectors.toList());
        System.out.println("Limited numbers: " + limitedNumbers);

        // Skipping
        List<Integer> skippedNumbers = numbers.stream()
                .skip(2)  // Skip the first 2 numbers
                .collect(Collectors.toList());
        System.out.println("Skipped numbers: " + skippedNumbers);

        // Distinct
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()  // Remove duplicates
                .collect(Collectors.toList());
        System.out.println("Distinct numbers: " + distinctNumbers);

        // Reducing
        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum);  // Sum all the numbers
        System.out.println("Sum: " + sum.orElse(0));

        // Collecting
        String concatenatedNames = names.stream()
                .collect(Collectors.joining(", "));  // Concatenate names with a comma separator
        System.out.println("Concatenated names: " + concatenatedNames);

        // GroupingBy
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Jane", 30)
        );
        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));  // Group people by age
        System.out.println("People grouped by age: " + peopleByAge);
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
