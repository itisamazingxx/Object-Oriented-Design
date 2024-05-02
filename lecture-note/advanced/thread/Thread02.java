///**
// * Demonstrates thread development by implementing the Runnable interface
// * 通过实现接口Runnable来开发线程
//// */
////public class Thread02 {
////
////    public static void main(String[] args) {
////        Dog dog = new Dog(); // 已经实现了Runnable
////        // 这里不能使用Dog.start()
////        Thread thread = new Thread(dog);
////        thread.start();
////    }
////
////}
//
///**
// * Acts as a proxy class for threading.
// * This simulates a simple thread by delegating to the Runnable target.
// */
//class Proxy implements Runnable {
//
//    private Runnable target = null;
//
//    /**
//     * If a target is set, executes the target's run method.
//     */
//    @Override
//    public void run() {
//        if (target != null) {
//            target.run();
//        }
//    }
//
//    public Proxy(Runnable target) {
//        this.target = target;
//    }
//
//    public void start() {
//        start0();
//    }
//
//    public void start0() {
//        run();
//    }
//
//}
//
//class No implements Runnable {
//
//    private int times = 0;
//
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println("Hi, awesome world! " + ++times + " " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if (times == 10) {
//                break;
//            }
//        }
//    }
//
//}


