package hello_wrld;
 class Test extends Thread //can't write public because public class name must be same as name of file
{
	public void run() //public is necessary else error: Cannot reduce the visibility of the inherited method from Thread
	{	System.out.println("Let's say thread is running");
		
	}
}


public class thread_creationBY_THREAD_CLASS {
public static void main(String[] args) {
	Test a=new Test();
	a.start(); //start invokes the run method from the test class which is extending the thread class
//if you again write a.start() after using it once then get runtime error: ILLEGALTHREADSTATEEXCEPTI ON
}
}
/*// Java code for thread creation by extending
//the Thread class
class MultithreadingDemo extends Thread {
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

//Main Class
public class Multithread {
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object
				= new MultithreadingDemo();
			object.start();
		}
	}
}
*/