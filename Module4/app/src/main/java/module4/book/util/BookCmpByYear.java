package module4.book.util;

import module4.book.Book;

public class BookCmpByYear implements Comparable<Book> {

    int compareTo(Book a, Book b) {
        return  a.getYear() - b.getYear();
    }

    @Override
    public int compareTo(Book o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    
}
