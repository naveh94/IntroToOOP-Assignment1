/**
 *
 * @author Naveh Marchoom
 *
 */
public class Sort {

    /**
     * Changes the input String array into an Integer array, changing the
     * numbers in the array from String format to Integer format.
     * @param numbers - The input string array.
     * @return A new array w integer array.
     */
    public static int[] stringsToInts(String[] numbers) {
        int[] array = new int[numbers.length - 1];
        for (int i = 1; i < numbers.length; i++) {
            array[i - 1] = Integer.parseInt(numbers[i]);
        }
        return array;
    }

    /**
     * Sort the input integer array in an acending sort, (from lower to higher).
     * @param numbers - The input integer array.
     * @return The array after sorting.
     */
    public static int[] sortIntArray(int[] numbers) {
        boolean swapped;
        int n = numbers.length - 1, temp;
        do {
            swapped = false;
            for (int i = 0; i < n; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return numbers;
    }
    /**
     * Flip the order in which the array is sorted.
     * @param numbers - The integer array.
     * @return The flipped array.
     */
    public static int[] flipOrder(int[] numbers) {
        int n = numbers.length - 1, temp;
        for (int i = 0; i < n; i++, n--) {
            temp = numbers[i];
            numbers[i] = numbers[n];
            numbers[n] = temp;
        }
    return numbers;
    }

    /**
     * Prints every integer in the array with a space afterward in one line.
     * @param numbers - The printed array
     */
    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
}

    /**
     * Get a string and a serie of numbers as an input, and sort the numbers in
     * acsending or descending order, according to the string.
     * @param args - input from the user:
     */
    public static void main(String[] args) {
        int[] numbers = stringsToInts(args);
        numbers = sortIntArray(numbers);
        if (args[0].equals("desc")) {
            numbers = flipOrder(numbers);
        }
        printArray(numbers);
    }
}