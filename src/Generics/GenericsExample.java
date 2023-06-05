package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // Generic class instantiation
        Box<Integer> integerBox = new Box<>(); // Create a Box that can hold Integers
        integerBox.set(10); // Set the value inside the Box
        int value = integerBox.get(); // Get the value from the Box
        System.out.println("Value: " + value);

        // Generic method invocation
        String[] names = {"John", "Alice", "Bob"};
        List<String> nameList = arrayToList(names); // Convert array to List using a generic method
        System.out.println("Name List: " + nameList);

        // Bounded type parameters
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        double circleArea = calculateArea(circle); // Call method with Circle argument
        double rectangleArea = calculateArea(rectangle); // Call method with Rectangle argument
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);

        // Wildcards - Upper Bounded
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        double average = calculateAverage(integers); // Calculate average of a List of Integers
        System.out.println("Average: " + average);

        // Wildcards - Unbounded
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        printList(strings); // Print a List of any type

        // Wildcards - Lower Bounded
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers); // Add any Number or its subtypes to the list
        System.out.println("Numbers: " + numbers);
    }

    // Generic class definition
    static class Box<T> {
        private T value;

        public void set(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }
    }

    // Generic method definition
    static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    // Bounded type parameter
    static abstract class Shape {
        abstract double calculateArea();
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double calculateArea() {
            return length * width;
        }
    }

    static <T extends Shape> double calculateArea(T shape) {
        return shape.calculateArea();
    }

    // Wildcards - Upper Bounded
    static double calculateAverage(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.size();
    }

    // Wildcards - Unbounded
    static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    // Wildcards - Lower Bounded
    static void addNumbers(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(2.0);
        numbers.add(3L);
    }
}
