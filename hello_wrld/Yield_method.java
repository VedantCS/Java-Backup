package hello_wrld;

 class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Step " + i);
            Thread.yield(); // Suggests giving up CPU
        }
    }
}

public class Yield_method{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}

//output WILL VARY, as it depends on the thread scheduler, so each time you are running this program then, 
//every time you will get different output
//The thread scheduler may or may not switch to another thread after yield().