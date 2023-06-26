import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {

//        INITIALIZE
        Random random = new Random();

//        RANDOM INTEGER
        System.out.println(random.nextInt());

//        RANDOM POSITIVE INTEGER BELOW MAX
        /* Syntax: nextInt(Max) */
        System.out.println(random.nextInt(100));

//        RANDOM INTEGER BETWEEN MIN AND MAX
        /* Syntax: nextInt(Min,Max) */
        System.out.println(random.nextInt(-1000, 1000));

//        RANDOM DOUBLE
        System.out.println(random.nextDouble());

//        RANDOM BOOLEAN
        System.out.println(random.nextBoolean());
    }
}
