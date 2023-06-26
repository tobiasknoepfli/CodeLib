public class Loops {
    public static void main(String[] args) {

        /* FOR-LOOP
        Is used when you know the number of iterations in advance. */
        for (int a = 1; a <= 5; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        /* WHILE-LOOP
        Is used when the number of iterations is not known in advance,
        and the loop continues as long as a certain condition is true. */
        int b = 1;
        while (b <= 5) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println();

        /* DO-WHILE-LOOP
        Is similar to the while loop, but it ensures that the loop body
        executes at least once before checking the condition. */
        int c = 1;
        do {
            System.out.print(c + " ");
            c++;
        } while (c <= 5);
        System.out.println();

        /* ENHANCED FOR-LOOP or FOR-EACH-LOOP
        Is used to iterate over arrays or collections. */
        String[] names = {"John", "Mary", "Alex"};
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        /*NESTED LOOPS
        You can have loops within loops, known as nested loops, to perform
        iterative operations on multiple dimensions or nested structures.
         */
        for (int d = 1; d <= 5; d++) {
            for (int e = 1; e <= d; e++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
