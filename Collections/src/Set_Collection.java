import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.SortedSet;

public class Set_Collection {
    public static void main(String[] args) {
        // 1️⃣ HashSet Example
        Set<String> hashSet = new HashSet<>(); 
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate, won't be added

        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));
        System.out.println("Size: " + hashSet.size());
        System.out.println("Is Empty: " + hashSet.isEmpty());
        hashSet.remove("Banana");
        System.out.println("After Removing 'Banana': " + hashSet);
        hashSet.clear();
        System.out.println("After Clear: " + hashSet);
        System.out.println();

        // 2️⃣ LinkedHashSet Example (Maintains Insertion Order)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Dog");
        linkedHashSet.add("Cat");
        linkedHashSet.add("Elephant");

        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);
        System.out.println("Contains 'Cat': " + linkedHashSet.contains("Cat"));
        System.out.println("Size: " + linkedHashSet.size());
        linkedHashSet.remove("Cat");
        System.out.println("After Removing 'Cat': " + linkedHashSet);
        System.out.println();

        // 3️⃣ TreeSet Example (Sorted Set)
        SortedSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(25);

        System.out.println("TreeSet (Sorted Order): " + treeSet);
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());
        System.out.println("HeadSet (less than 25): " + treeSet.headSet(25));
        System.out.println("TailSet (greater than or equal to 25): " + treeSet.tailSet(25));
        System.out.println("SubSet (10 to 25): " + treeSet.subSet(10, 25));
        treeSet.remove(20);
        System.out.println("After Removing 20: " + treeSet);
    }
}
