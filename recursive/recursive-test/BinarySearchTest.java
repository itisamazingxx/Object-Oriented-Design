package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    private BinarySearch help;
    private int[] array;

    @BeforeEach
    public void setUp() {
        help = new BinarySearch();
        array = new int[]{1, 4, 6, 7, 8, 53, 56, 67, 677, 7656};
    }

    @Test
    public void testSearchValue() {
        int result1 = help.search(array, 677);
        assertEquals(8, result1);
        int result2 = help.search(array, 8);
        assertEquals(4, result2);
        int result3 = help.search(array, 45);
        assertEquals(-1, result3);
    }
    
}
