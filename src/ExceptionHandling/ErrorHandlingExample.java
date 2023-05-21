package ExceptionHandling;

import java.io.*;

public class ErrorHandlingExample {
    public static void main(String[] args) {
        // Example 1: Try-Catch
        try {
            int result = divide(10, 0); // Causes an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example 2: Multiple Catch Blocks
        try {
            String str = null;
            int length = str.length(); // Causes a NullPointerException
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Example 3: Finally Block
        try {
            readFile("nonexistent.txt"); // Causes a FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // Example 4: Throwing Exceptions
        try {
            checkAge(-1); // Throws an InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        }
    }

    // Example 1: Try-Catch
    public static int divide(int a, int b) {
        return a / b;
    }

    // Example 3: Finally Block
    public static void readFile(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
    }

    // Example 4: Throwing Exceptions
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
    }

    // Custom Exception
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
}
