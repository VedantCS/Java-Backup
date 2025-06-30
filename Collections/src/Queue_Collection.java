import java.util.LinkedList;
	import java.util.Queue;
public class Queue_Collection {
	

	    public static void main(String[] args) {
	        // Using LinkedList to implement Queue
	        Queue<Integer> queue = new LinkedList<>();

	        // ✅ 1. Adding Elements
	        queue.add(10);      // Inserts 10
	        queue.add(20);      // Inserts 20
	        queue.offer(30);    // Inserts 30 (offer doesn't throw exception)

	        System.out.println("After adding elements: " + queue);

	        // ✅ 2. Removing Elements
	        System.out.println("Removed using remove(): " + queue.remove()); // Removes 10
	        System.out.println("Removed using poll(): " + queue.poll());     // Removes 20

	        System.out.println("Queue after removals: " + queue);

	        // ✅ 3. Inspecting Elements
	        System.out.println("Front element using element(): " + queue.element()); // 30
	        System.out.println("Front element using peek(): " + queue.peek());       // 30

	        // ✅ 4. Querying the Queue
	        System.out.println("Queue size: " + queue.size());           // 1
	        System.out.println("Is the queue empty? " + queue.isEmpty()); // false
	        System.out.println("Does the queue contain 30? " + queue.contains(30)); // true

	        // ✅ Clearing the queue
	        queue.clear();
	        System.out.println("Queue after clear(): " + queue);
	        System.out.println("Is the queue empty after clear()? " + queue.isEmpty()); // true
	    }
	}


