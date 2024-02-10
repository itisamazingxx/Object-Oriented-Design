package module4.book.util;

import com.google.common.base.Predicate;

import module4.book.Book;

public class BookBefore implements Predicate<Book>{

    private int year;

    public BookBefore(int year) {
        this.year = year;
    }

    @Override
    public boolean test(Book b) {
        return b.getYear() < year;
    }

    @Override
    public boolean apply(Book input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'apply'");
    }
    
}
