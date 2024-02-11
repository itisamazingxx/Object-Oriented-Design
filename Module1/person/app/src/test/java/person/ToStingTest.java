package person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToStingTest {

    private Person ariel;
    private Book harry;

    @BeforeEach
    public void setUp() {

        ariel = new Person("Ariel", "Lau", 1995);
        harry = new Book("Harry Porter", ariel, 19.99);

    }

    @Test
    public void personToStringTest() {
        assertEquals("Ariel Lau", ariel.toString());
    }

    @Test
    public void bookToStringTest() {
        assertEquals("Title: Harry Porter\n" +
        "Author: Ariel Lau\n" + "Price: 19.99", harry.toString());
    }
    
}
