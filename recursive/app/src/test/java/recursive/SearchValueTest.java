package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import recursive.SearchValue;

public class SearchValueTest {
    
    private SearchValue help;
    private int[] array1;
    private int[] array2;
    private int[] array3;

    @BeforeEach
    public void setUp() {
        
        help = new SearchValue();
        array1 = new int[] {1, 5, 4, 5, 6, 5, 6, 7};
        array2 = new int[] {};
        array3 = new int[] {2, 3, 4, 3, 3, 3, 0, 0, 0};

    }

    @Test
    public void testSearchValue() {

        int result1 = help.search(array1, 5);
        assertEquals(3, result1);
        int result2 = help.search(array2, 9);
        assertEquals(0, result2);
        int result3 = help.search(array3, 0);
        assertEquals(3, result3);
        
    }
    
}
