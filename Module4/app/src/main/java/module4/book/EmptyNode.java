package module4.book;

import com.google.common.base.Predicate;

import module4.book.util.IBookPredicate;

public class EmptyNode implements IListOfBooks{

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int countHelp(int acc) {
        return acc;
    }

    @Override
    public String toString() { return "";}

    @Override
    public IListOfBooks allBefore(int year) {
        return new EmptyNode();
    }

    @Override
    public IListOfBooks sortByPrice() {
        return new EmptyNode();
    }

    @Override
    public IListOfBooks insert(Book bookInfo) {
        return new ElementNode(bookInfo, this);
    }

    @Override
    public double totalPrice() {
        return 0.0;
    }

    @Override
    public IListOfBooks getList(Predicate<Book> predicate) {
        return new EmptyNode();
    }

}
