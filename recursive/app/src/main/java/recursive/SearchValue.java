package recursive;

/**
 * Write a method that given an array of numbers called data and a value called x, 
 * returns the number of times that x appears in data.
 */
public class SearchValue {

    public int search(int[] array, int x) {
        return searchHelp(array, x, 0, 0);

    }

    private int searchHelp(int[] array, int x, int index, int count) {
        if (index < 0 || index >= array.length) {
            return count;
        }
        if (array[index] == x) {
            count += 1;
        }
        return searchHelp(array, x, index+1, count);
    }

}
