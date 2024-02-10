package module4.book;

import com.google.common.base.Predicate;

import module4.book.util.IBookPredicate;

public class ElementNode implements IListOfBooks{

    private Book bookInfo;
    private IListOfBooks next;

    public ElementNode(Book bookInfo, IListOfBooks next) {
        this.bookInfo = bookInfo;
        this.next = next;
    }

    @Override
    public int count() {
        return this.countHelp(0);
    }

    @Override
    public IListOfBooks allBefore(int year) {

        if (bookInfo.before(year)) {
            return new ElementNode(this.bookInfo, this.next.allBefore(year));
        } else {
            return this.next.allBefore(year);
        }
    }

    @Override
    public IListOfBooks sortByPrice() {
        return this.next.sortByPrice().insert(this.bookInfo);
    }

    /**
     * Inserts the first book into the sorted list
     * that the resulting list is sorted
     */
    @Override
    public IListOfBooks insert(Book book) {
        // insert sort
        // 当前节点中的书更便宜 新书应该被插到剩余部分
        // 因为根据排序规则 新书应该位于当前结构后的每个位置
        if (this.bookInfo.cheaperThan(book)) {
            return new ElementNode(this.bookInfo, this.next.insert(book));
        } else {
            // 用这本书作为开头
            return new ElementNode(book, this);
        }
    }
    
    @Override
    public int countHelp(int acc) {
        return this.next.countHelp(1 + acc); // tail recursive call
    }

    public String toString() {
        return "("+this.bookInfo.toString()+")"+this.next.toString();
      }

    @Override
    public double totalPrice() {
        return this.bookInfo.getPrice() + this.next.totalPrice();
      }
   

    @Override
    public IListOfBooks getList(Predicate<Book> predicate) {
        if (predicate.test(this.bookInfo)) {
            return new ElementNode(this.bookInfo, this.next.getList(predicate));
        } else {
            return this.next.getList(predicate);
        }
    }


}
