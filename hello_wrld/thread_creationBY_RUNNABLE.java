package hello_wrld;
//note: The start() method is part of the Thread class, not the Runnable interface.
public class thread_creationBY_RUNNABLE implements Runnable { 
	//runnalbe ke andar bas ek method hai named void run() ek method hai isliye toh is
	//class ko abstract nahi krna padra
	public void run() {
		System.out.println("overriding run method in runnable");
	}

	public static void main(String[] args) {
		thread_creationBY_RUNNABLE T= new thread_creationBY_RUNNABLE ();
		//T.start();--->is invalid as it shows error:The method start() is undefined for the type thread_creationBY_RUNNABLE 
		//
		Thread th=new Thread(T);  //T pass kiya kyuki t ka jo class hai usne runnable interface implment kiya 
		 //hai isliye toh uske andar overridden run() method hai aaur wahi run method ki wajase se toh  apan th.start() use kr sakte
		 th.start();
		 //When you call th.start(), the Thread object th will create a new thread and invoke the run() method of T (the Runnable).
	}
}

/* // Java code for thread creation by implementing
// the Runnable Interface
class MultithreadingDemo implements Runnable {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

// Main Class
class Multithread {
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object
				= new Thread(new MultithreadingDemo());
			object.start();
		}
	}
}
*/
