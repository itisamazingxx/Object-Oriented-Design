package module4.book.util;


import java.util.function.Predicate;

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

}
