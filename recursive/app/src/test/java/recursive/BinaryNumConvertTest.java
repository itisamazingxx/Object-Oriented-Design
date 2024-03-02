package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryNumConvertTest {
    private BinaryNumConvert help;

    @BeforeEach
    public void setUp() {
        help = new BinaryNumConvert();
    }

    @Test
    public void testSearchValue() {
        String result1 = help.convert(8);
        assertEquals("1000", result1);
        String result2 = help.convert(6);
        assertEquals("110", result2);
        String result3 = help.convert(5);
        assertEquals("101", result3);
    }
    
}
