package java_week_5_Writing_hw_RoopenPatel;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer objects, store numbers 4, 7 and 8 to set.
 * Show which numbers are between 1 and 10 in the set.( Hint : Use for loop and if else )
 */
public class Program_8_HashSet {
    public static void main(String[] args) {
        // Creating a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
        // Adding values to it
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Showing numbers between 1 and 10
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " Is Found In The Set");
            } else {
                System.out.println(i + " Is Not Found In The Set");
            }
        }
    }
}
