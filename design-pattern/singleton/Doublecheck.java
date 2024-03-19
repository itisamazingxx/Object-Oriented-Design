
public class Doublecheck {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("=====Double Check=====");
        System.out.println(instance1 == instance2);
    }
}


class Singleton {
    private static volatile Singleton instance;
    private Singleton() {};
    // 双重检查代码：解决线程安全 & 懒加载
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}