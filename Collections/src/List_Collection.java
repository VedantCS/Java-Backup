import java.util.Collections;
import java.util.ArrayList;
//import java.util.List; necessary if you want to have flexibility
/* 
 1)import java.util.ArrayList;
 Purpose: Imports the ArrayList class, which is a dynamic array implementation of the List interface.
 
 2)import java.util.List;
 Flexibility: If you decide to switch from ArrayList to LinkedList later, you only need to change the instantiation:
eg: if u want to use linkedlist instead of arraylist simply change: List<String> fruits = new LinkedList<>();
  */
public class List_Collection {

	    public static void main(String[] args) {
	        // 1. Creating an ArrayList
	        ArrayList<String> fruits = new ArrayList<>();
	      
	        //OR -> Using List instead of ArrayList for declaration:
	       // List<String> fruits = new ArrayList<>();
	        
	        // 2. add(E element)
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");//do see the Arrays.asList() method below
//List<Integer> temp=new ArrayList<>(Arrays.asList(1,2,4,5,6));
	        System.out.println("After add(): " + fruits);

	        // 3. addAll(Collection<? extends E> c)
	        ArrayList<String> moreFruits = new ArrayList<>();
	        moreFruits.add("Date");
	        moreFruits.add("Elderberry");
	        moreFruits.add("Fig");	
	        fruits.addAll(moreFruits); //or-  fruits.addAll(1,moreFruits) adds at 1th index and rest  shifts their position
	        System.out.println("After addAll(): " + fruits);

	        // 4. get(int index)
	        System.out.println("Element at index 2: " + fruits.get(2));

	        // 5. set(int index, E element)
	        fruits.set(1, "Blueberry"); 
	        System.out.println("After set(): " + fruits);

	        // 6. remove(int index) and remove(Object o)
	        fruits.remove(0); // Removes "Apple"
	        fruits.remove("Fig"); // Removes "Fig"
	        System.out.println("After remove(): " + fruits);

	        // 7. removeAll(Collection<?> c)
	        ArrayList<String> toRemove = new ArrayList<>();
	        toRemove.add("Date");
	        toRemove.add("Elderberry");
	        fruits.removeAll(toRemove);
	        System.out.println("After removeAll(): " + fruits);

	        // 8. size()
	        System.out.println("Size of fruits: " + fruits.size());

	        // 9. clear()
	        fruits.clear();
	        System.out.println("After clear(): " + fruits);

	        // 10. contains(Object o)
	        fruits.add("Grapes");
	        System.out.println("Contains 'Grapes': " + fruits.contains("Grapes"));
	        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));

	        // 11. containsAll(Collection<?> c)
	        ArrayList<String> checkFruits = new ArrayList<>();
	        checkFruits.add("Grapes");
	        checkFruits.add("Apple");
	        System.out.println("Contains all 'Grapes' and 'Apple': " + fruits.containsAll(checkFruits));

	        // 12. retainAll(Collection<?> c)
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Grapes");
	        System.out.println("updated fruits arraylist :"+fruits);
	        ArrayList<String> retainFruits = new ArrayList<>();
	        retainFruits.add("Banana");
	        retainFruits.add("Grapes");
	        fruits.retainAll(retainFruits);
	        System.out.println("After retainAll(): " + fruits);

	        // 13. indexOf(Object o)
	        System.out.println("Index of 'Grapes': " + fruits.indexOf("Grapes"));

	        // 14. lastIndexOf(Object o)
	        fruits.add("Grapes"); // Adding another "Grapes"
	        System.out.println("second time updated fruits arraylist :"+fruits);
	        System.out.println("Last index of 'Grapes': " + fruits.lastIndexOf("Grapes"));

	  
	        // ----- Using Collections Utility Methods -----

	        // Re-sorting the list
	        Collections.sort(fruits);
	        System.out.println("Sorted: " + fruits);

	        // Reversing the list
	        Collections.reverse(fruits);
	        System.out.println("Reversed: " + fruits);

	        // Shuffling the list
	        Collections.shuffle(fruits);
	        System.out.println("Shuffled: " + fruits);

	        // Finding max and min
	        System.out.println("Max: " + Collections.max(fruits));
	        System.out.println("Min: " + Collections.min(fruits));

	        // Frequency of an element
	        System.out.println("Frequency of 'Grapes': " + Collections.frequency(fruits, "Grapes"));
	    }
	}

	

