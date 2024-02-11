package person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    private Person ariel;
    
    @BeforeEach
    public void setUp() {
        ariel = new Person("Ariel", "Smith", 1995);
    }

    @Test
    public void ageTest() {
        assertEquals(28, ariel.getAge());
    }

    @Test
    public void firstNameTest() {
        assertEquals("Ariel", ariel.getFirstName());
    }
}
