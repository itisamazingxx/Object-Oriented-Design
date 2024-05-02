/**
 * Demonstrates the use of multithreading to simulate three windows selling 100 tickets concurrently.
 * 使用多线程模拟三个窗口同时销售100张票
 */
public class SellTicket {
    public static void main(String[] args) {
        TicketCounter01 ticketCounter01 = new TicketCounter01();
        TicketCounter01 ticketCounter02 = new TicketCounter01();
        TicketCounter01 ticketCounter03 = new TicketCounter01();
        // 会出现oversell
        Thread thread01 = new Thread(ticketCounter01);
        Thread thread02 = new Thread(ticketCounter02);
        Thread thread03 = new Thread(ticketCounter03);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}

class TicketCounter01 implements Runnable {

    private static int ticketNum = 100; // 让多个线程共享

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("Ticket sold out!!");
                break;
            }
            // Rests
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " solds 1 ticket." + 
            "Rest ticket number " + --ticketNum);
        }
    }

}
