package recursive;

/**
 * Exponential power method given a base number x and a positive integer y
 */
public class Pow {

    public int caculatePow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * caculatePow(x, y - 1);
    }

}
