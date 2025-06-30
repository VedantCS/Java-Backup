package hello_wrld;

class Task implements Runnable {
public void run() {
        for (int i = 1; i <= 7; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " executing step " + i);
                Thread.sleep(3000);  
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class Sleep_method {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task(), "Thread-1");
        Thread t2 = new Thread(new Task(), "Thread-2");

        t1.start();
        t2.start();
    }
}
/*t1.start() and t2.start() are called in main(), starting both threads nearly simultaneously AKA CONCURRENT
Both threads begin executing the run() method, entering the loop.
t1 executes System.out.println(...) for step 1, then sleeps for 3 seconds.
t2 executes System.out.println(...) for step 1, then sleeps for 3 seconds.
After 3 seconds, t1 wakes up and prints step 2, then sleeps again.
t2 wakes up and prints step 2, then sleeps again.
This continues until both threads complete 7 steps each.*?
/*

class Main  {
    public static void main(String[] args) {
        System.out.println("Started Main Thread.... ");
        try{
         Thread.currentThread().sleep(5000);
         
        }
        catch(InterruptedException e)
        {
              System.out.println("Main thread interrupted!");
        }
         System.out.println("Ended after 5 seconds");
    }
} 
to check cpu cores:  System.out.println("Available CPU Cores: " + Runtime.getRuntime().availableProcessors());
*/
