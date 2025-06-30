import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        
        // Adding elements manually
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);

        // Sorting
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // Reversing
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // Finding max and min
        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));

        // Frequency of an element
        int freq = Collections.frequency(numbers, 5);
        System.out.println("Frequency of 5: " + freq);

        // Binary search (requires sorted list)
        int index = Collections.binarySearch(numbers, 5);
        if (index >= 0) {
            System.out.println("Element 5 found at index: " + index);
        } else {
            System.out.println("Element 5 not found.");
        }
    }
}