package module4.book;

import com.google.common.base.Predicate;

import module4.book.util.IBookPredicate;

/**
 * This interface represents all the operations to be supported by a list of books
 */
public interface IListOfBooks {

    /**
     * Returns the number of books in this list
     */
    int count();

    int countHelp(int acc);

    String toString();

    // float totalPrice();

    IListOfBooks allBefore(int year);

    IListOfBooks sortByPrice();

    IListOfBooks insert(Book book);

    double totalPrice();

    // imagine IBookPredicate as a set of operations
    // focusing on how to manupulate this list of book
    // we need to create specific object inside this interface(operation set)
    IListOfBooks getList(Predicate<Book> predicate);

}