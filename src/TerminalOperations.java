import java.util.Scanner;

public class TerminalOperations {
    public static void main(String[] args) {

        /* READING WORDS
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.println("You entered: " + text);

        /* READING LINES
         */
        System.out.println("Enter a string: ");
        String t = scanner.nextLine();
        System.out.println("You entered " + t);

        /* READING NUMERIC VALUES
         */
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        /* READING BOOLEANS
         */
        System.out.print("Enter a boolean value (true/false): ");
        boolean value = scanner.nextBoolean();
        System.out.println("You entered: " + value);

        /* READING CHARACTERS
         */
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("You entered: " + ch);

        /* SKIPPING INPUT
         */
        System.out.print("Enter a string to skip: ");
        scanner.skip("hello");
        String txt = scanner.nextLine();
        System.out.println("You entered: " + text);
    }
}

