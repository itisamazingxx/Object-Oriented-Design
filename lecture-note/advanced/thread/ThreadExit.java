public class ThreadExit {
    public static void main(String[] args) {
        T t1 = new T();
        t1.start();
        try {
            t1.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.setLoop(false);
    }
}

class T extends Thread {

    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            System.out.println("Thread is running!!");
            // Rests
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

}
