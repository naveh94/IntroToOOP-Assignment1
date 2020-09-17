/**
 *
 * @author Naveh Marchoom
 *
 */
public class DescribeNumbers {

    /**
     * Change each of the numbers in the input array, from String format
     * to integer format.
     * @param numbers - The input String array.
     * @return The new converted array.
     */
    public static int[] stringsToInts(String[] numbers) {
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
    return array;
    }

    /**
     * Find the minimum number in the input integer array.
     * @param numbers - The input integer array.
     * @return The minimum number in the array.
     */
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    /**
     * Find the maximum number in the input integer array.
     * @param numbers - The input integer array.
     * @return The maximum number in the array.
     */
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * Get the avarage of the numbers in the input array.
     * @param numbers - The input integer array.
     * @return The avarage of the numbers in the array.
     */
    public static float avg(int[] numbers) {
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    /**
     * Get a serie of numbers as input from the user and get their minimum,
     * their maximum and their avarage.
     * @param args - The input from the user.
     */
    public static void main(String[] args) {
        int[] numbers = stringsToInts(args);
        int min = min(numbers), max = max(numbers);
        float avarage = avg(numbers);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("avg: " + avarage);
    }
}