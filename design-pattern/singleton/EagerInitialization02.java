
public class EagerInitialization02 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * Eager Initialization (static variable)
 */
class Singleton {
    // 将构造器私有化 外部能new
    private Singleton() {}
    // 本类内部创建对象实例
    private static Singleton instance;
    // 提供一个公有的静态方法 返回实例对象
    static {
        instance = new Singleton(); // 在静态代码块中，创建单例对象
    }
    public static Singleton getInstance() {
        return instance;
    }
}