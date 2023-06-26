import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;

//        ARITHMETIC OPERATORS
        System.out.println(a + b); //Addition
        System.out.println(d - c); //Subtraction
        System.out.println(b * c); //Multiplication
        System.out.println(d / b); //Division
        System.out.println(d % c); //Modulus
        System.out.println();

//        ASSIGNMENT OPERATORS
        System.out.println(b);
        b += 5;     // x = x + 5
        System.out.println(b);
        b -= 3;     // x = x - 3
        System.out.println(b);
        b *= 2;     // x = x * 2
        System.out.println(b);
        b /= 4;     // x = x / 4
        System.out.println(b);
        b %= 3;     // x = x % 3
        System.out.println(b);
        System.out.println();

//        COMPARISON OPERATORS
        System.out.println((a == b));    // Equality: false
        System.out.println((a != b)); // Inequality: true
        System.out.println((a > b));   // Greater than: false
        System.out.println((a < b));      // Less than: true
        System.out.println((a >= b));  // Greater than or equal to: false
        System.out.println((a <= b));     // Less than or equal to: true
        System.out.println();

//        INCREMENT AND DECREMENT
        System.out.println(c);
        System.out.println(d);
        c++;
        d--;
        System.out.println(c);
        System.out.println(d);
        System.out.println();

//        TENARY OPERATOR
        int max = (a > b) ? a : b;
        System.out.println(max);


    }
}
