package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringPatternTest {

    private StringPattern help;

    @BeforeEach
    public void setUp() {
        help = new StringPattern();
    }

    @Test
    public void testSearchValue() {
        assertEquals(true, help.checkString("aaaabb"));
        assertEquals(true, help.checkString("bbb"));
        assertTrue(help.checkString("aa"));
        assertFalse(help.checkString("abbba"));
        assertFalse(help.checkString("abab"));
    }
    
}