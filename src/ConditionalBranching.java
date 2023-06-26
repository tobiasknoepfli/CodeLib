import java.util.Random;

public class ConditionalBranching {
    public static void main(String[] args) {
        Random rnd = new Random();

        /* IF
         */
        int x = rnd.nextInt(-1000, 1000);
        System.out.println(x);
        if (x > 0) {
            System.out.println("x is positive");
        }
        System.out.println();

        /* IF-ELSE
         */
        int age = rnd.nextInt(0, 100);
        System.out.println(age);
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
        System.out.println();

        /* IF-ELSE-IF-ELSE
         */
        int score = rnd.nextInt(0, 100);
        System.out.println(score);
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        System.out.println();

        /* SHORT IF
         */
        int y = rnd.nextInt(-1000, 1000);
        System.out.println(y);
        String result = (y > 0) ? "Positive" : "Negative";
        System.out.println(result);
        System.out.println();

        /* SWITCH STATEMENT
         */
        int dayOfWeek = rnd.nextInt(1, 7);
        System.out.println(dayOfWeek);
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println();

        /* FALL-THROUGH-SWITCH
         */
        System.out.println(dayOfWeek);
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println();

        /* ENUMERATED SWITCH
         */
        enum Month {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
        }
        System.out.println();

        Month month = Month.JULY;
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("Winter");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Spring");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Summer");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month");
        }
        System.out.println();

        /*  ARROW-FORM SWITCH
         */
        System.out.println(dayOfWeek);
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayName);


    }
}
