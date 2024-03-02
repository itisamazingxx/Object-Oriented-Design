package recursive;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BalancedParenthesisTest {

    private BalancedParenthesis help;

    @BeforeEach
    public void setUp() {
        help = new BalancedParenthesis();
    }

    @Test
    public void testSearchValue() {
        boolean result1 = help.isBalanced("(a+b*(4+(9/c)))");
        assertTrue(result1);
        boolean result2 = help.isBalanced("a)(b)");
        assertFalse(result2);
        boolean result3 = help.isBalanced("((9+3)");
        assertFalse(result3);
    }
    
}
