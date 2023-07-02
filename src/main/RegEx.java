package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
//        PATTERN MATCHING
        /*  used to match patterns in text. They allow you to search,
        validate, and manipulate strings based on specific patterns */
        String pattern = "\\d{4}-\\d{2}-\\d{2}";
        String text = "Today's date is 2022-09-15";
        boolean isMatch = text.matches(".*" + pattern + ".*");
        System.out.println(isMatch);

//        . (DOT)
        /* Matches any single character. */
        pattern = "c.t";
        text = "cat, cot, cut";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

//        * (ASTERISK)
        /* Matches zero or more occurrences of the preceding character or group. */
        pattern = "ab*c";
        text = "ac, abc, abbc, abbbc";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        + (PLUS)
        /* Matches one or more occurrences of the preceding character or group. */
        pattern = "ab+c";
        text = "ac, abc, abbc, abbbc";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        ? (QUESTION MARK)
        /* Matches zero or one occurrence of the preceding character or group. */
        pattern = "colou?r";
        text = "color, colour";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        \ (BACKSLASH)
        /* Escapes special characters or indicates character classes. */
        pattern = "\\[abc\\]";
        text = "[abc] is a character class";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        [ ] (SQUARE BRACKETS)
        /* Defines a character class. Matches any character within the brackets. */
        pattern = "[aeiou]";
        text = "Hello World";
        regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        matcher = regex.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

//        ^ (CARET)
        /* Matches the beginning of a line or string. */
        pattern = "^Start";
        text = "Start of the line\nAnother line starts with Start";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        $ (DOLLAR)
        /*  Matches the end of a line or string. */
        pattern = "end$";
        text = "This is the end\nAnother line ends with end";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        EXTRACTING EMAIL ADDRESSES FROM TEXT
        pattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        text = "Contact us at info@example.com or support@example.com";
        Pattern emailPattern = Pattern.compile(pattern);
        matcher = emailPattern.matcher(text);
        while (matcher.find()) {
            String email = matcher.group();
            System.out.println(email);
        }

//        VALIDATING A PHONE NUMBER
        pattern = "\\d{3} \\d{3} \\d{2} \\d{2}";
        String phoneNumber = "079 960 51 42";
        boolean isValid = phoneNumber.matches(pattern);
        System.out.println(isValid);

//        SPLITTING TEXT INTO WORDS
        pattern = "\\W+"; //Non-word characters as delimiter
        text = "Hello, world! How are you today?";
        String[] words = text.split(pattern);
        for (String word : words) {
            System.out.println(word);
        }

//        REPLACING TEXT
        pattern = "\\bapple\\b";
        text = "I have an apple and a banana. I love apples.";
        String replacedText = text.replaceAll(pattern, "orange");
        System.out.println(replacedText);

//        \d
        /* Matches any digit (0-9) */
        pattern = "\\d+";
        text = "12345";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        \w
        /* Matches any word character (a-z, A-Z, 0-9 and underscore */
        pattern = "\\w+";
        text = "hello_world";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        \s
        /* Matches any whitespace character */
        pattern = "\\s+";
        text = "Hello World";
        regex = Pattern.compile(pattern);
        matcher = regex.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

//        \D
        /* Matches any non-digit character */
        pattern = "\\D+";
        text = "Hello123";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        \W
        /* Matches any non-word character */
        pattern = "\\W+";
        text = "Hello@World";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        \S
        /* Matches any non-whitespace character */
        pattern = "\\S+";
        text = "Hello\tWorld";
        regex = Pattern.compile(pattern);
        matcher = regex.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

//        {n}
        /* Matches exactly n occurrences of the preceding character or group. */
        pattern = "a{3}";
        text = "aaa";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        {n,}
        /* Matches at least n occurrences of the preceding character or group. */
        pattern = "a{3,}";
        text = "aaaa";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        {n,m}
        /* Matches between n and m occurrences of the preceding character or group. */
        pattern = "a{2,4}";
        text = "aaa";
        isMatch = text.matches(pattern);
        System.out.println(isMatch);

//        \b
        /* Matches a word boundary. */
        pattern = "\\bworld\\b";
        text = "Hello world! Welcome to the world.";
        regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        matcher = regex.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

//        GROUPS AND CAPTURING
        /* Groups allow you to capture parts of a matched string. */
        pattern = "(\\d+)-(\\w+)";
        text = "123-abc";
        regex = Pattern.compile(pattern);
        matcher = regex.matcher(text);
        if (matcher.matches()) {
            String wholeMatch = matcher.group(0);
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            System.out.println(wholeMatch);
            System.out.println(group1);
            System.out.println(group2);
        }

    }
}
