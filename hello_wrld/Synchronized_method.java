package hello_wrld;
class TicketBooking {
    private int availableSeats = 2; // Total seats

    public synchronized void bookTicket(String name, int seats) {
        if (availableSeats >= seats) {
            System.out.println(name + " booked " + seats + " ticket(s) successfully!");
            availableSeats -= seats;
            System.out.println("Remaining Seats: " + availableSeats);
        } else {
            System.out.println(name + " failed to book tickets. Not enough available seats.");
        }
    }
}

public class Synchronized_method{
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        Thread user1 = new Thread(() -> booking.bookTicket("User1", 2)); // Tries to book 2 seats
        Thread user2 = new Thread(() -> booking.bookTicket("User2", 2)); // Tries to book 2 seats

        user1.start();
        user2.start();
    }
}

/*Synchronized block
 * class Counter {
    private int count = 0;

    public void increment() {
        synchronized(this) {  // Lock only this block
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class WithSyncBlock {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) counter.increment(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 1000; i++) counter.increment(); });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());  // Always 2000
    }
}
*/
 

