/**
 * This class demonstrates the Singleton design pattern, ensuring that 
 * only one instance of a class is created throughout the lifetime of 
 * an application. */
public class SingletonExample01 {
    public static void main(String[] args) {
        GirlFriend girl1 = GirlFriend.getInstance();
        GirlFriend girl2 = GirlFriend.getInstance();
        System.out.println(girl1==girl2);
    }
}

class GirlFriend {
    private String name;

    // The sole instance of the class, initialized eagerly
    private static GirlFriend gf = new GirlFriend("Ariel");

    /**
     * Private constructor to prevent instantiation outside of the class.
     */
    private GirlFriend(String name) {

    }

    /**
     * Provides the global point of access to the singleton instance.
     */
    public static GirlFriend getInstance() {
        return gf;
    }
}
