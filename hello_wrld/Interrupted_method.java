package hello_wrld;
class MyTasks implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (Thread.interrupted()) {  // Checks and clears the interrupted flag
                System.out.println(Thread.currentThread().getName() + " was interrupted! Stopping execution.");
                break;
            }
            System.out.println(Thread.currentThread().getName() + " executing step " + i);
        }
        
        // Checking the interrupt flag again
        System.out.println(Thread.currentThread().getName() + " interrupt status after loop: " + Thread.interrupted());
    }
}

public class Interrupted_method {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTasks(), "Worker-Thread");
        t1.start();

        try {
            Thread.sleep(10);  // Let the thread run for some time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.interrupt();  // Interrupting the thread
    }
}
