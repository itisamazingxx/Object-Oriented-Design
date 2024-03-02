package recursive;

/**
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * An integer n is a power of four, if there exists an integer x such that n == 4^x.
 */
public class PowerOfNum {

    public boolean powerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0) {
            return false;
        } 
        return powerOfFour(n / 4);
    }

    public boolean powerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return powerOfTwo(n / 2);
    }

    public boolean powerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 3 != 0) {
            return false;
        }
        return powerOfThree(n / 3);
    }
    
}
