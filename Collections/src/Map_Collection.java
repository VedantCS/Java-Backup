import java.util.HashMap;
import java.util.Map;

public class Map_Collection{
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Using put() to add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Displaying the map
        System.out.println("Initial Map: " + map);

        // Using get() to retrieve a value
        System.out.println("Value for key 2: " + map.get(2));

        // Using getOrDefault() to get value or default if key not found
        System.out.println("Value for key 5 (default if not found): " + map.getOrDefault(5, "Not Found"));

        // Using containsKey() to check for a key
        System.out.println("Contains key 3? " + map.containsKey(3));

        // Using containsValue() to check for a value
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

        // Using size() to get the number of key-value pairs
        System.out.println("Size of the map: " + map.size());

        // Using isEmpty() to check if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty());

        // Using replace() to update the value for a specific key
        map.replace(2, "Blueberry");
        System.out.println("Map after replace: " + map);

        // Using remove() to delete a key-value pair
        map.remove(1);
        System.out.println("Map after removing key 1: " + map);

        // Using keySet() to get all keys
        System.out.println("Keys in the map: " + map.keySet());

        // Using values() to get all values
        System.out.println("Values in the map: " + map.values());

        // Using entrySet() to get all key-value pairs
        System.out.println("Key-Value pairs using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using clear() to remove all entries
        map.clear();
        System.out.println("Map after clear: " + map);
        System.out.println("Is the map empty after clear? " + map.isEmpty());
    }
}
/* Explanation of Methods Used:

    put(key, value) → Adds key-value pairs to the map.

    get(key) → Retrieves the value associated with a key.

    getOrDefault(key, defaultValue) → Returns the value if the key exists; otherwise, returns the default value.

    containsKey(key) → Checks if the key exists.

    containsValue(value) → Checks if the value exists.

    size() → Returns the number of key-value pairs.

    isEmpty() → Checks if the map is empty.

    replace(key, value) → Replaces the value for a specific key.

    remove(key) → Removes the key-value pair.

    keySet() → Returns a set view of all keys.

    values() → Returns a collection view of all values.

    entrySet() → Returns a set of key-value mappings (entries).

    clear() → Removes all key-value pairs from the map.
    . */