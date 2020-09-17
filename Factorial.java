/**
 *
 * @author Naveh Marchoom
 *
 */
public class Factorial {

    /**
     * Get an integer as input from the user, and get their factorial using
     * 'for' loops.
     * @param n - The integer from the user.
     * @return The factorial for the input integer.
     */
    public static long factorialIter(long n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Get an integer as input from the user, and get their factorial using
     * recursive.
     * @param n - The integer from the user.
     * @return The factorial for the input integer.
     */
    public static long factorialRecursive(long n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /**
     * Get an integer as input from the user, and get it's factorial using 2
     * different ways.
     * @param args - The input from the user.
     */
    public static void main(String[] args) {
        long n = Integer.parseInt(args[0]);
        long factorial = factorialRecursive(n);
        System.out.println("recursive: " + factorial);
        factorial = factorialIter(n);
        System.out.println("iterative: " + factorial);
    }
}