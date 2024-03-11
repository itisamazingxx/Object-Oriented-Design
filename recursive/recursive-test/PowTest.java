package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PowTest {

    private Pow help;

    @BeforeEach
    public void setUp() {
        help = new Pow();
    }

    @Test
    public void testPow() {
        int result1 = help.caculatePow(2, 5);
        assertEquals(32, result1);
        int result2 = help.caculatePow(3, 5);
        assertEquals(243, result2);
        int result3 = help.caculatePow(4, 3);
        assertEquals(64, result3);
        
    }
    
}
