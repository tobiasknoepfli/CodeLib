public class Strings {
    public static void main(String[] args) {

        /* DECLARATION AND INITIALISATION
        Direct Initialisation: */
        String greeting = "Hello,";
        /* Using the "new"-keyword: */
        String name = new String("John Doe");

        /* CONCACTENATION
        */
        String personalGreeting = greeting + " " + name;
        System.out.println(personalGreeting);

        /* STRING LENGTH
        You can get the length of a string using the length() method. */
        int length = personalGreeting.length();
        System.out.println(length);

        /* ACCESSING CHARACTERS
        Syntax: charAt(index)
        method. */
        char firstChar = personalGreeting.charAt(0);
        System.out.println(firstChar);

        /* SUBSTRING EXTRACTION
        Syntax: substring(start, end) */
        String subString = personalGreeting.substring(7, 11);
        System.out.println(subString);

        /* STRING COMPARISON
        Syntax: what.equals(with) */
        String str1 = "Hello";
        String str2 = "Hello";
        boolean areEqual = str1.equals(str2);
        System.out.println(areEqual);

        /* CONVERSION
        */
        String lowerCaseMessage = personalGreeting.toLowerCase();
        String upperCaseMessage = personalGreeting.toUpperCase();
        System.out.println(lowerCaseMessage);
        System.out.println(upperCaseMessage);

        /* TRIMMING WHITESPACE
        */
        String input = "   Hello, World!   ";
        String nextPart = "John is here!";
        String trimmedInput = input.trim();
        System.out.println(input + " " + nextPart);
        System.out.println(trimmedInput + " " + nextPart);

        /* REPLACING SUBSTRINGS
        Syntax: replace(what,with) */
        String message = "Hello, World!";
        String newMessage = message.replace("Hello", "Hi");
        System.out.println(newMessage);

        /* SPLITTING A STRING
        Syntax: split(delimiter) */
        String sentence = "Hello John, John, hello!";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        /* CHECKING PREFIXES
        Syntax: startsWith(substring)
                endsWith(substring) */
        boolean startsWith = sentence.startsWith("Hello");
        boolean endsWith = sentence.endsWith("hello!");
        System.out.println(startsWith);
        System.out.println(endsWith);

        /* CHECKING IF A STRING CONTAINS A SUBSTRING
        Syntax: string.contains(substring) */
        boolean containsHello = sentence.contains("Hi");
        System.out.println(containsHello);

        /* GETTING THE INDEX OF A SUBSTRING
        Syntax: string.indexOf(substring) */
        int index = sentence.indexOf("hello!");
        System.out.println(index);

        /* REVERSING A STRING
        */
        StringBuilder reversed = new StringBuilder(sentence).reverse();
        System.out.println(reversed);

        /* JOINING STRINGS
        Syntax:    join(delimiter, Array) */
        String[] joinWords = { "Hello", "World", "Java" };
        String joined = String.join(" ", joinWords);
        System.out.println(joined);

        /* SPECIAL CHARACTERS
         */
        System.out.println("Backslash:"+"\t"+"\t"+"\t"+"\\"+"\\");
        System.out.println("Tab:"+"\t"+"\t"+"\t"+"\t"+  "\\" +"t");
        System.out.println("New Line:"+"\t"+ "\t"+"\t"+"\\"+"n");
        System.out.println("Quotation Marks>"+"" +
                "\t"+"\\"+ "\"");
    }
}
