package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountFactorTest {

    private CountFactor help;

    @BeforeEach
    public void setUp() {
        help = new CountFactor();
    }

    @Test
    public void testSearchValue() {
        int result1 = help.count(10);
        assertEquals(4, result1);
        int result2 = help.count(5);
        assertEquals(2, result2);
        int result3 = help.count(20);
        assertEquals(6, result3);
        
    }
    
}
