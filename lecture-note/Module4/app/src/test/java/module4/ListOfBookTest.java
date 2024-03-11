package module4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import module4.book.Book;
import module4.book.ElementNode;
import module4.book.EmptyNode;
import module4.book.IListOfBooks;
import module4.book.util.BookBefore;
import module4.book.util.BookWithAuthor;

public class ListOfBookTest {

    EmptyNode emptyListOfBooks;
    ElementNode partialListOfBooks;
    ElementNode listOfBooks;

    @BeforeEach
    public void setUp() {

        emptyListOfBooks = new EmptyNode();

        partialListOfBooks =
        new ElementNode(new Book("HP 1", "J.K. Rowling", 1997, 19.99f),
        new ElementNode(new Book("HP 2", "J.K. Rowling",1999, 29.99f),
        new ElementNode(new Book("HP 3", "J.K. Rowling",2001, 10.99f),
        new EmptyNode())));
            
        listOfBooks =
        new ElementNode(new Book("HP 4", "J.K. Rowling",2004, 15.49f),
        new ElementNode(new Book("HP 5", "J.K. Rowling",2006, 12.99f),
        new ElementNode(new Book("HP 6", "J.K. Rowling",2007, 7.99f),
        partialListOfBooks)));

    }

    @Test
    public void listTest() {

        assertEquals(0, emptyListOfBooks.count());
        assertEquals(3, partialListOfBooks.count());
        assertEquals(6, listOfBooks.count());

    }

    @Test
    public void testToString() {
        String expected = "(Title: HP 4 Year: 2004 Price: 15.49)"+
                "(Title: HP 5 Year: 2006 " +"Price: 12.99)"+
                "(Title: HP 6 Year: 2007 Price: 7.99)"+
                "(Title: HP 1 Year: 1997 Price: 19.99)"+
                "(Title: HP 2 Year: 1999 Price: 29.99)"+
                "(Title: HP 3 Year: 2001 Price: 10.99)";
        assertEquals(expected,listOfBooks.toString());
    }

    @Test
    public void testBookBefore() {
        IListOfBooks lastCentury = listOfBooks.getList(new BookBefore(2000));
        assertEquals(2, lastCentury.count());

        int year = 2000;
        IListOfBooks thisCentury = listOfBooks.getList((Book b) -> b.getYear() < year);
        String expected = "(Title: HP 1 Year: 1997 Price: 19.99)"+
                          "(Title: HP 2 Year: 1999 Price: 29.99)";
        assertEquals(expected, thisCentury.toString());
        
    }

    @Test
    public void testWithAuthor() {
        IListOfBooks allRowling = listOfBooks.getList(new BookWithAuthor("J.K. Rowling"));
        assertEquals(6, allRowling.count());
        IListOfBooks noRowling = listOfBooks.getList(new BookWithAuthor("Harry"));
        assertEquals(0, noRowling.count());
    }

    
}
