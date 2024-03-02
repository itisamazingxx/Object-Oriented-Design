package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class StringRemovePunctuationTest {
    
    private StringRemovePunctuation help;

    @BeforeEach
    public void setUp() {
        
        help = new StringRemovePunctuation();

    }

    @Test
    public void testStringRemove() {

        String result1 = help.remove("rj so.45?");
        assertEquals("rjso45", result1);
        String result2 = help.remove("jsf.d!w?");
        assertEquals("jsfdw", result2);


        
    }
    
}