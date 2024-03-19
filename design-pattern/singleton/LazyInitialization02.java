public class LazyInitialization01 {
    public static void main(String[] args) {

    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }
    // 加入同步代码 解决线程不安全问题 (效率低）
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}