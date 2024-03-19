/**
 * Demonstrates the use of the Singleton pattern with eager initialization.
 */
public class EagerInitialization01 {
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
    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private Singleton() {}
    
    /**
     * The single instance of the class, created eagerly.
     */
    private final static Singleton instance = new Singleton();

    /**
     * Provides a public static method to access the singleton instance.
     * @return The single instance of the Singleton class.
     */
    public static Singleton getInstance() {
        return instance;
    }
}