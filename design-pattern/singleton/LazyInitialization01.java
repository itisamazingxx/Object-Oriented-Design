/**
 * Demonstrates the Lazy Initialization design pattern for creating a singleton instance.
 * This class tests the singleton by obtaining instances and comparing them.
 */
public class LazyInitialization01 {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);

    }
}

/**
 * Singleton class using lazy initialization to create a unique instance.
 * This implementation ensures that only one instance of the Singleton class is created
 * and provides a global point of access to it.
 */

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }
    /**
     * Provides a public static method for obtaining the instance.
     * The instance is created upon the first invocation of this method.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}