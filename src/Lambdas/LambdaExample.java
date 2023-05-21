package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression with no parameters
        Runnable runnable = () -> System.out.println("Hello, Lambda!"); // Lambda expression prints "Hello, Lambda!"
        runnable.run(); // Execute the lambda expression

        // Lambda expression with one parameter
        Consumer<String> printConsumer = message -> System.out.println(message); // Lambda expression prints the given message
        printConsumer.accept("Hello, Consumer Lambda!"); // Execute the lambda expression with the message "Hello, Consumer Lambda!"

        // Lambda expression with multiple parameters
        BiFunction<Integer, Integer, Integer> sumFunction = (a, b) -> a + b; // Lambda expression adds two numbers
        int sum = sumFunction.apply(3, 5); // Execute the lambda expression with numbers 3 and 5 and get the sum
        System.out.println("Sum: " + sum);

        // Lambda expression with return statement
        Function<Integer, Integer> squareFunction = a -> { // Lambda expression calculates the square of a number
            int square = a * a;
            return square;
        };
        int square = squareFunction.apply(4); // Execute the lambda expression with the number 4 and get the square
        System.out.println("Square: " + square);

        // Lambda expression with predicate
        Predicate<Integer> evenPredicate = number -> number % 2 == 0; // Lambda expression checks if a number is even
        boolean isEven = evenPredicate.test(6); // Execute the lambda expression with the number 6 and check if it is even
        System.out.println("Is Even: " + isEven);

        // Lambda expression with consumer and forEach
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println(number)); // Lambda expression prints each number in the list

        // Lambda expression with supplier and method reference
        Supplier<List<String>> listSupplier = ArrayList::new; // Lambda expression creates a new ArrayList
        List<String> stringList = listSupplier.get(); // Execute the lambda expression and get the created ArrayList
        stringList.add("Java");
        stringList.add("Lambdas");
        stringList.forEach(System.out::println); // Method reference prints each element in the list

        // Lambda expression with custom functional interface
        MyFunction myFunction = (a, b) -> a * b; // Lambda expression multiplies two numbers
        int result = myFunction.operation(4, 5); // Execute the lambda expression with numbers 4 and 5 and get the product
        System.out.println("Result: " + result);
    }

    // Custom functional interface
    @FunctionalInterface
    interface MyFunction {
        int operation(int a, int b);
    }
}
