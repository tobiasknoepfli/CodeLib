package ExceptionHandling;

import java.io.FileNotFoundException;
import java.util.*;

public class ExceptionExamples {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            // NullPointerException
            String str = null;
            int length = str.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            // ArrayIndexOutOfBoundsException
            int[] array = { 1, 2, 3 };
            int element = array[5];
            System.out.println("Element: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // FileNotFoundException
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter file name: ");
            String fileName = scanner.nextLine();
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }

        try {
            // NumberFormatException
            String number = "ABC";
            int parsedNumber = Integer.parseInt(number);
            System.out.println("Parsed Number: " + parsedNumber);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        try {
            // ClassCastException
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            Object obj = numbers;
            List<String> stringList = (List<String>) obj;
            System.out.println("String List: " + stringList);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        try {
            // IllegalArgumentException
            int age = -1;
            validateAge(age);
            System.out.println("Age: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        try {
            // NoSuchElementException
            List<String> names = new ArrayList<>();
            Iterator<String> iterator = names.iterator();
            String name = iterator.next();
            System.out.println("Name: " + name);
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        throw new FileNotFoundException("File not found: " + fileName);
    }

    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age: " + age);
        }
    }
}
