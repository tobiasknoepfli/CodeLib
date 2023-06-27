import java.util.EnumSet;

public class Enums {
    //    DECLARATION
    /* declared as public, final and static */
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    //    DECLARATION WITH A CONSTRUCTOR
    enum GreekLetters {
        ALPHA("a"), BETA("b"), GAMMA("c");

        private String latin;

        GreekLetters(String latin) {
            this.latin = latin;
        }

        public String getLatin() {
            return latin;
        }
    }

    //        DECLARATION WITH MULTIPLE VALUES
    enum Size {
        SMALL("S", 32), MEDIUM("M", 36), LARGE("L", 40);

        private String code;
        private int measurement;

        Size(String code, int measurement) {
            this.code = code;
            this.measurement = measurement;
        }

        public String getCode() {
            return code;
        }

        public int getMeasurement() {
            return measurement;
        }
    }

    enum AllMonths {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
//        ACCESSING ENUM CONSTANTS
        Day today = Day.MONDAY;
        System.out.println(today);

//        ITERATE THROUGH ENUM
        for (GreekLetters letters : GreekLetters.values()) {
            System.out.print(letters + ":" + letters.getLatin() + ", ");
        }
        System.out.println();

        System.out.println(Size.MEDIUM.getMeasurement());

//        FIND ORDINAL OF ENUMS
        Day tomorrow = Day.SATURDAY;
        System.out.println(tomorrow.ordinal());

//        GET AN ARRAY OF ALL CONSTANTS
        Day[] days = Day.values();
        for (Day d : days) {
            System.out.print(d + " ");
        }
        System.out.println();

//        CREATE AN ENUMSET AS ENUM SUBCLASS
        EnumSet<AllMonths> firstSemester = EnumSet.range(
                AllMonths.JANUARY, AllMonths.JUNE);
        System.out.println(firstSemester);

//        ADD CONSTANTS TO THE ENUMSET
        firstSemester.add(AllMonths.JULY);
        System.out.println(firstSemester);

//        REMOVE CONSTANTS FROM THE ENUMSET
        firstSemester.remove(AllMonths.JULY);
        System.out.println(firstSemester);
    }

}
