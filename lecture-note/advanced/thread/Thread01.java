/**
 * Demonstrates creating a thread by extending the Thread class.
 */
public class Thread01 {
    public static void main(String[] args) {

        // Creates a Cat object, which is a thread
        Cat cat = new Cat();
        cat.start(); // Starts the thread

        // 进入到main方法后就是进入了一个主线程
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    } // 主线程 子线程交替执行
}

/**
 * A Cat thread that meows ten times with a one-second pause between meows.
 * This class extends the Thread class, making it a Java thread. It overrides
 * the run method to define the thread's execution behavior.
 */
class Cat extends Thread {

    private int times = 0;

    @Override
    public void run() { // 需要重写run方法 (源码是Thread类实现了runnable接口的run方法)
        while(true) {
            System.out.println("Meow, I am the cutest cat." + ++times);
        // Pause the thread for one second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 10) {
                break;
            }
        }
    }

}
