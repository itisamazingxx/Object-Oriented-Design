package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    private Fibonacci help;

    @BeforeEach
    public void setUp() {
        help = new Fibonacci();
    }

    @Test
    public void testSearchValue() {
        int result1 = help.findFibonacci(8);
        assertEquals(21, result1);
        int result2 = help.findFibonacci(5);
        assertEquals(5, result2);
        int result3 = help.findFibonacci(17);
        assertEquals(1597, result3);
        
    }
    
}