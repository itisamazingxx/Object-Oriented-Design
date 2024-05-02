/**
 * This file illustrates an example of multi-threading, containing two child threads
 */
public class Thread03 {
    // javac Thread03 会启动一个进程
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start(); // 启动第一个线程
        thread2.start(); // 启动第二个线程
        // Run program to check if these two threads alternate in execution
    }
}

class T1 implements Runnable {

    private int times = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("Hi, awesome world! " + ++times + " " + Thread.currentThread().getName());
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

class T2 implements Runnable {

    private int times = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("Oh...it's raining day" + ++times + " " + Thread.currentThread().getName());
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



