package recursive;

public class BinarySearch {

    public int search(int[] array, int target) {
        return searchHelp(array, target, 0, array.length - 1);
    }

    private int searchHelp(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] < target) {
            return searchHelp(array, target, mid+1, end);
        }
        else if (array[mid] > target) {
            return searchHelp(array, target, start, mid-1);
        }
        else {
            return mid;
        }
    }
    
}
