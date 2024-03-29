package recursive;
/**
 * Find the f(n) Finbonacci number in series
 */
public class Fibonacci {

    public int findFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
    
}