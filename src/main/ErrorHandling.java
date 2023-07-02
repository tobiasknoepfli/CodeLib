package main;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
//        CATCHING AND HANDLING SPECIFIC EXCEPTIONS
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by 0 not possible");
        }

//    CATCHING MULTIPLE EXCEPTIONS
        try {
            int[] result2 = {2, 5, 3, 5, 9, 1};
            System.out.println(result2[11]);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by 0 not possible");
        } catch (Exception f) {
            System.out.println("not possible");
        }

        try {
            div(10, 0);
            div(10, 1);
        } catch (Exception e) {
        }

//        USING A FINALLY BLOCK
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("file.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("Cannot close the file " + e.getMessage());
                }
            }
        }

        try{
            String input = null;
            processInput(input);
        } catch (invalidInputException e){
            System.out.println(e.getMessage());
        }

    }

    //    THROWING EXCEPTIONS
    static int div(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }

    //    CREATING CUSTOM EXCEPTIONS
    static class invalidInputException extends Exception {
        public invalidInputException(String message) {
            super(message);
        }
    }

    public static void processInput(String input) throws invalidInputException{
        if (input == null || input.isEmpty()){
            throw new invalidInputException("Input is invalid or empty");
        }
    }

}
