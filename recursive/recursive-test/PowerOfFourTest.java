package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PowerOfFourTest {
    private PowerOfNum help;

    @BeforeEach
    public void setUp() {
        help = new PowerOfNum();
    }

    @Test
    public void testPowerOfFour() {
        boolean result1 = help.powerOfFour(24);
        assertFalse(result1);
        boolean result2 = help.powerOfFour(16);
        assertTrue(result2);
        boolean result3 = help.powerOfFour(64);
        assertTrue(result3);
        
    }
    
}
