
public class Methods {
    public static void main(String[] args) {
        Methods methods = new Methods();
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        methods.start();
        System.out.println();

        methods.printSum(5, 10);
        System.out.println();

        int sum = methods.calculateSum(55, 10);
        System.out.println(sum);
        System.out.println();

        methods.getGreeting();
        System.out.println();

        double f = methods.calculateAverage(numbers);
        System.out.println(f);
        System.out.println();

        int a = methods.factorial(10);
        System.out.println(a);
        System.out.println();

        int b = methods.findMax(345, 645, 5, 123, 2, 535, 234, 23, 4);
        System.out.println(b);
    }

    /* METHOD WITHOUT PARAMETERS AND RETURN VALUE
     */
    void start() {
        System.out.println("Let's caluclate:");
    }

    /* METHOD WITH PARAMETERS BUT NO RETURN VALUE
     */
    void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    /* METHOD WITH PARAMETERS AND RETURN VALUE
     */
    int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    /* METHOD WITH RETURN VALUE BUT NO PARAMETERS
     */
    private String getGreeting() {
        return "So far, so good";
    }

    /* METHOD WITH MULTIPLE PARAMETERS AND RETURN VALUE
     */
    double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        return average;
    }

    /* RECURSIVE METHOD
     */
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /* METHOD WITH MULTIPLE PARAMETERS AND RETURN VALUE
     */
    int findMax(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}




