public class Strings {
    public static void main(String[] args) {

//        DECLARATION AND INITIALISATION
        /* Direct Initialisation: */
        String greeting = "Hello,";
        /* Using the "new"-keyword: */
        String name = new String("John Doe");
        System.out.println();

//        CONCACTENATION
        String personalGreeting = greeting + " " + name;
        System.out.println(personalGreeting);
        System.out.println();

//        STRING LENGTH
        /* You can get the length of a string using the length() method. */
        int length = personalGreeting.length();
        System.out.println(length);
        System.out.println();

//        ACCESSING CHARACTERS
        /* Syntax: charAt(index) */
        char firstChar = personalGreeting.charAt(0);
        System.out.println(firstChar);
        System.out.println();

//        SUBSTRING EXTRACTION
        /* Syntax: substring(start, end) */
        String subString = personalGreeting.substring(7, 11);
        System.out.println(subString);
        System.out.println();

//        STRING COMPARISON
        /* Syntax: what.equals(with) */
        String str1 = "Hello";
        String str2 = "Hello";
        boolean areEqual = str1.equals(str2);
        System.out.println(areEqual);
        System.out.println();

//        CONVERSION
        String lowerCaseMessage = personalGreeting.toLowerCase();
        String upperCaseMessage = personalGreeting.toUpperCase();
        System.out.println(lowerCaseMessage);
        System.out.println(upperCaseMessage);
        System.out.println();

//        TRIMMING WHITESPACE
        String input = "   Hello, World!   ";
        String nextPart = "John is here!";
        String trimmedInput = input.trim();
        System.out.println(input + " " + nextPart);
        System.out.println(trimmedInput + " " + nextPart);
        System.out.println();

//        REPLACING SUBSTRINGS
        /* Syntax: replace(what,with) */
        String message = "Hello, World!";
        String newMessage = message.replace("Hello", "Hi");
        System.out.println(newMessage);
        System.out.println();

//        SPLITTING A STRING
        /* Syntax: split(delimiter) */
        String sentence = "Hello John, John, hello!";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();

//        CHECKING PREFIXES
        /* Syntax: startsWith(substring)
                endsWith(substring) */
        boolean startsWith = sentence.startsWith("Hello");
        boolean endsWith = sentence.endsWith("hello!");
        System.out.println(startsWith);
        System.out.println(endsWith);
        System.out.println();

//        CHECKING IF A STRING CONTAINS A SUBSTRING
        /* Syntax: string.contains(substring) */
        boolean containsHello = sentence.contains("Hi");
        System.out.println(containsHello);

//        GETTING THE INDEX OF A SUBSTRING
        /* Syntax: string.indexOf(substring) */
        int index = sentence.indexOf("hello!");
        System.out.println(index);
        System.out.println();

//        REVERSING A STRING
        StringBuilder reversed = new StringBuilder(sentence).reverse();
        System.out.println(reversed);
        System.out.println();

//        JOINING STRINGS
        /* Syntax:    join(delimiter, Array) */
        String[] joinWords = {"Hello", "World", "Java"};
        String joined = String.join(" ", joinWords);
        System.out.println(joined);
        System.out.println();

//        SPECIAL CHARACTERS
        System.out.println("Backslash:" + "\t" + "\t" + "\t" + "\\" + "\\");
        System.out.println("Tab:" + "\t" + "\t" + "\t" + "\t" + "\\" + "t");
        System.out.println("New Line:" + "\t" + "\t" + "\t" + "\\" + "n");
        System.out.println("Quotation Marks:" + "" +
                "\t" + "\\" + "\"");
    }
}
