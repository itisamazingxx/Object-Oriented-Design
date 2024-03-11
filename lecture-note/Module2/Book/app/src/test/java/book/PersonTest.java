package book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    private Person ariel;

    Person benlerner = new Person("Ben","Lerner",1982);
    Person benaffleck = new Person("Ben","Affleck",1982);
    Person timlerner = new Person("Tim","Lerner",1982);
    Person anotherbenlerner = new Person("Ben","Lerner",1983);
    Person identicaltwin = new Person("Ben","Lerner",1982);
    
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

    @Test
    public void samePersonTest() {

        assertFalse(benlerner.samePerson(benaffleck));
        assertFalse(benlerner.samePerson(timlerner));
        assertFalse(benlerner.samePerson(anotherbenlerner));
        assertTrue(benlerner.samePerson(identicaltwin));

    }
}
