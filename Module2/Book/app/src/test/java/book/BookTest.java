package book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {

    private Person ariel;
    private Book beaches;
    private Person anotherauthor;
    private Book pirateBeaches;
    private Book anotherBook;

    @BeforeEach
    public void setUp() {
        ariel = new Person("Ariel", "Lau", 1995);
        beaches = new Book("Harry Porter", ariel, 20, TypeOfBook.HARDCOVER);
        
        anotherauthor = new Person("Pat", "Conroy II", 1948);
        pirateBeaches = new Book("Beaches", anotherauthor, 48, TypeOfBook.PAPERBACK);
        anotherBook = new Book("nono", ariel, 19, TypeOfBook.KINDLE);
    }

    @Test
    public void personToStringTest() {
        assertEquals("Ariel Lau", ariel.toString());
    }

    @Test
    public void bookToStringTest() {
        assertEquals("Title: Harry Porter\n" +
        "Author: Ariel Lau\n" + 
        "Type: Hard Cover\n" +"Price: 20.00", beaches.toString());
    }

    @Test
    public void testDiscount() {
        double discountPrice = beaches.salePrice(20);
        assertEquals(16.00, discountPrice);

    }

    @Test
    public void sameAuthorTest() {
        assertTrue(anotherBook.sameAuthor(beaches));
        assertFalse(pirateBeaches.sameAuthor(anotherBook));

    }

    @Test
    public void discountBookTest() {
        Book discountBook = beaches.discountBook(20);
        assertTrue(beaches.sameAuthor(discountBook));
        assertEquals(beaches.getTitle(), discountBook.getTitle());
        assertEquals(16, discountBook.getPrice(), 0.01);
    }

    
}
