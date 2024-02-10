package module4.book.util;

import com.google.common.base.Predicate;

import module4.book.Book;

public class BookWithAuthor implements Predicate<Book>{

    private String authorName;

    public BookWithAuthor(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean test(Book b) {
        return b.getAuthor().contains(authorName);
    }

    @Override
    public boolean apply(Book input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'apply'");
    }
    
}
