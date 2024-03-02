package recursive;

/**
 * Write a method that when given a number x counts the number of factors that divide x evenly. 
 * For example 10 is divided evenly by 1, 2, 5, and 10 so it has 4 factor
 */
public class CountFactor {

    public int count(int x) {
        return countHelp(x, 1, 0);
    }

    private int countHelp(int x, int factor, int count) {
        if (factor > x) {
            return count;
        }
        if (x % factor == 0) {
            count += 1;
        }
        return countHelp(x, factor+1, count);
    }
    
}
