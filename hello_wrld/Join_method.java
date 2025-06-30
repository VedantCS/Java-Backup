package hello_wrld;


class ThreadJoining extends Thread
{

 public void run()
 {
     for (int i = 0; i < 2; i++)
     {
         try
         {
             Thread.sleep(3000);
             System.out.println("Current Thread: "
                     + Thread.currentThread().getName());
         }

         catch(Exception ex)
         {
             System.out.println("Exception has" +
                             " been caught" + ex);
         }
         System.out.println(i);
     }
 }
}

public class Join_method
{
 public static void main (String[] args)
 {
	 ThreadJoining t1 = new ThreadJoining();
     ThreadJoining t2 = new ThreadJoining();
     ThreadJoining t3 = new ThreadJoining();

     t1.start();
     try
     {
         System.out.println("Current Thread: "
               + Thread.currentThread().getName());
         t1.join();
     }

     catch(Exception ex)
     {
         System.out.println("Exception has " +
                             "been caught" + ex);
     }

    
     t2.start();

     
     try
     {
         System.out.println("Current Thread: "
              + Thread.currentThread().getName());
         t2.join();
     }

     catch(Exception ex)
     {
         System.out.println("Exception has been" +
                                 " caught" + ex);
     }
     

     t3.start();
     
     try
     {
         System.out.println("Current Thread: "
              + Thread.currentThread().getName());
         t3.join();
     }

     catch(Exception ex)
     {
         System.out.println("Exception has been" +
                                 " caught" + ex);
     }
 }
}
/*
  The main thread starts executing main().
t1.start() is called.

    This requests the t1 thread to start execution, but it does not guarantee it starts immediately.
    The run() method of t1 may start in parallel or may be delayed, depending on the scheduler.

The main thread immediately moves to the try block and prints "Current Thread: main".
The main thread then calls t1.join(), which forces it to wait until t1 finishes.
Meanwhile, t1 runs its run() method:

    It sleeps for 3 seconds.
    It prints "Current Thread: Thread-0" and 0, then sleeps again.
    It prints "Current Thread: Thread-0" and 1, then finishes.

After t1 completes, the main thread resumes execution and starts t2.
 */

