/**
 * Demonstrates the use of the Singleton pattern with lazy initialization.
 */
//public class SingletonExample02 {
//    public static void main(String[] args) {
//        String name = Cat.name;
//        // Accessing a static field does not trigger instance creation in lazy initialization.
//        Cat cat1 = Cat.getInstance();
//        Cat cat2 = Cat.getInstance();
//        System.out.println(cat1==cat2);
//    }
//
//}
///**
// * The Cat class uses the Singleton pattern with lazy initialization
// */
//class Cat {
//    public static String name;
//    private static Cat cat; // Reference to the single instance, initially null.
//
//    /**
//     * Private constructor to prevent instantiation from outside the class.
//     */
//    private Cat() {
//
//    }
//
//    /**
//     * Provides a public static method to access the singleton instance.
//     */
//    public static Cat getInstance() {
//        if (cat == null) {
//            new Cat();
//        }
//        return cat;
//    }
//}
