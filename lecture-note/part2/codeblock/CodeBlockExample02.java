/**
 * This class showcases the initialization order of static and instance members in Java, especially
 * when inheritance is involved. 
 */
public class CodeBlockExample02 {
    // 继承的本质是父类在子类之前被加载
    public static void main(String[] args) {
        // What will print if we new an instance of CC class?
        CC example = new CC();
        // Class A is initializing
        // GET n1
        // Class B is initializing
        // CC class inheritants from B, static code block
        // GET n2
        // Code Block for class B
        // Constructor of class B
        // CC get show called
        // Constructor of CC
    }
}

class AA {
    static {
        System.out.println("Class A is initializing");
    }
}

class BB extends AA {
    // Instance variable initialization
    private int n2 = getN2();

    // Static variable initialization
    private static int n1 = getN1();

    // Instance initialization block in BB
    {
        System.out.println("Code Block for class B");
    }

    // Static initialization block in BB
    static {
        System.out.println("Class B is initializing");
    }

    // Constructor for BB
    public BB() {
        System.out.println("Constructor of class B");
    }

    public static int getN1() {
        System.out.println("GET n1");
        return 100;
    }

    public int getN2() {
        System.out.println("GET n2");
        return 200;
    }
}

class CC extends BB {
    private int show = getShow();

    static {
        System.out.println("CC class inheritants from B, static code block");
    }

    public CC() {
        System.out.println("Constructor of CC");
    }

    public int getShow() {
        System.out.println("CC get show called");
        return 300;
    }
}
