package main;

public class WrapperClasses {
    public static void main(String[] args) {
//        AUTOBOXING: PRIMITIVE TO WRAPPER
        Integer num1 = 10;
        System.out.println(num1);

//        UNBOXING: WRAPPER TO PRIMITIVE
        int num2 = num1.intValue();
        System.out.println(num2);

//        UTILITY METHODS
        /* parse number */
        String numberString = "123";
        int parsedNumber = Integer.parseInt(numberString);

        /* value.toSTring */
        Integer v = parsedNumber;
        String s = v.toString();
        System.out.println(s);

        /* intValue */
        Double pi = Math.PI;
        int roundedPi = pi.intValue();
        System.out.println(roundedPi);

        /* valueOf */
        Boolean flag = Boolean.valueOf("false");
        System.out.println(flag);

//        NULL VALUES
        Integer age = null;
        System.out.println(age);


    }
}
