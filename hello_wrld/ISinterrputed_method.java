package hello_wrld;
class MyTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (Thread.currentThread().isInterrupted()) {  // Check if interrupted
            	//isInterrupted()  only checks the flag and does not reset it. 
            	//The flag is cleared(reset) only when the thread throws an InterruptedException or when Thread.interrupted() is used.
                System.out.println(Thread.currentThread().getName() + " was interrupted! Stopping execution.");
                break;
            }
            System.out.println(Thread.currentThread().getName() + " executing step " + i);
        }
    }
}

public class ISinterrputed_method{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask(), "Worker-Thread");
        t1.start();

        try {
            Thread.sleep(10); // Give thread time to start, IF main thread is sleeping for 75ms
            //  it gives Worker-Thread enough time to complete all iterations before interrupt() is called.
            //so isInterrupted() is never checked.
            //if sleep(10) then the interrupt flag t1.interrupt() was checked before executing step 2, and the loop exited early.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.interrupt();  // Interrupt the thread,sets flag to true
    }
}

