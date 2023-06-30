package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.*;

import static java.lang.Math.*;

public class Lambdas {
    //    LAMBDA WITH SINGLE PARAMETER
    /* Syntax: Function<input,output> || T -> R */
    static Function<Double, Double> square = x -> pow(x.doubleValue(), 2);

    //    LAMBDA WITH MULTIPLE PARAMETERS
    /* Syntax: BiFunction<input,input,output> || T,R -> S */
    static BiFunction<Integer, Integer, Integer> sum = (a, b) -> {
        return a + b;
    };

    //    PREDICATE LAMBDA
    /* boolean-valued function of one argument || T -> boolean */
    static Predicate<Double> isEven = x -> x % 2 == 0;

    //    CONSUMER LAMBDA
    /* represents an operation that takes a single argument and returns no result || T -> void */
    static Consumer<String> printer = message -> System.out.println(message);

    //    FUNCTION LAMBDA
    /* takes one argument and produces a result || T -> R */
    static Function<Integer, String> stringify = x -> String.valueOf(x);

    //    SUPPLIER LAMBDA
    /* represents a supplier of results, no input needed || () -> T */
    static Supplier<Double> randomValue = () -> Math.random() * 100;

    //    LAMBDA WITH METHOD REFERENCE
    /* reference to a static method */
    static Function<Integer, Double> squareRoot = Math::sqrt;

    //    ARBITRARTY OBJECT METHOD REFERENCE
    static Function<String, Integer> lengthGetter = String::length;

    //    TYPE INFERENCE
    static Function<Integer, String> binStringConverter = (n) -> Integer.toBinaryString(n);


    public static void main(String[] args) {
        System.out.println(square.apply(3.14));
        System.out.println(sum.apply(5, 9));
        System.out.println(isEven.test(6.0));
        printer.accept("Hi");
        System.out.println(stringify.apply(45));
        System.out.println(randomValue.get());
        System.out.println(squareRoot.apply(559));

        StringJoiner joiner = new StringJoiner(", ");
        StringJoiner joiner2 = new StringJoiner("; ");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

//        INSTANCE METHOD REFERENCE
        names.forEach(joiner::add);
        /* does the same as the forEach loop below */
        for (String s : names) {
            joiner2.add(s);
        }

        System.out.println(joiner.toString());
        System.out.println(joiner2.toString());

//        CONSTRUCTOR METHOD REFERENCE
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        /* is equivalent to the first example */
        Supplier<ArrayList<String>> listSupplier1 = () -> new ArrayList<>();
        /* saves the explicit definition of an anonymous inner class that implements
        the Supplier<ArrayList<String>> interface and overrides the get() method, where
        you have to instantiate a new object using the constructor. */
        Supplier<ArrayList<String>> listSupplier2 = new Supplier<ArrayList<String>>() {
            @Override
            public ArrayList<String> get() {
                return new ArrayList<String>();
            }
        };

        ArrayList<String> list = listSupplier.get();
        ArrayList<String> list1 = listSupplier2.get();
        ArrayList<String> list2 = listSupplier2.get();

        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println(lengthGetter.apply("This is a String with a length"));

        String message = "Run, Forrest!";

        System.out.println(binStringConverter.apply(42));

//        VARIABLE CAPTURE
        Runnable runnable = () -> System.out.println(message);

        runnable.run();
    }
}


