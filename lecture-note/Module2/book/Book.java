package book;

/**
 * This class represents a book.
 * It illustrates a "has a" relationship through composition.
 */
public class Book {

    private String title;
    private Person author;
    private double price;
    private TypeOfBook bookType;

    public Book(String title, Person author, double price, TypeOfBook bookType) {
        
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookType = bookType;

    }

    public String getTitle() {
        return this.title;
    }

    public Person getAuthor() {
        return this.author;
    }
    
    public double getPrice() {
        return this.price;
    }

    public TypeOfBook getBookType() {
        return this.bookType;
    }

    /**
     * Returns a string representation of the book,
     * including the title, author and price
     * @return a formatted string
     */
    public String toString() {
        String str;
    
        str = "Title: " + this.title + "\n" +
                "Author: " + this.author + "\n" +
                "Type: ";
                
        switch (this.bookType) {
          case PAPERBACK:
            str = str + "Paperback";
            break;
          case HARDCOVER:
            str = str + "Hard Cover";
            break;
          case KINDLE:
            str = str + "Kindle";
            break;
        }
    
        str = str + "\n";
        str = str + String.format("Price: %.2f", price);
    
        return str;
      }

    /**
     * Compute and return the price of this book with given discount
     * @param the percentage discount to be applied
     * @return the discounted price of this book
     */
    public double salePrice(double discount) throws IllegalArgumentException{
        if (discount < 0) {
            // throw exception here
            throw new IllegalArgumentException("Discount cannot be negative");
        }
        return this.price - (this.price * discount) / 100;
    }

    /**
     * This method illustrates an example of
     * methods with objects as arguments
     * @param book
     * @return true represents the author is same, false otherwise
     */
    public boolean sameAuthor(Book book) {
        return this.author.samePerson(book.author);
    }

    /**
     * Compute the sale price of this book using the given
     * discount rate (as percentage) and return a version of this book
     * with the discount rate.
     * @param discount
     * @return a new book that is identical to this book except the price
     * is discounted
     */
    public Book discountBook(double discount) {
        double discountedPrice = this.price;
        try {
            discountedPrice = this.salePrice(discount);
        } catch (IllegalArgumentException e) {

        }
        // illustrate how to create a new object
        return new Book(this.title, this.author, discountedPrice, this.bookType);
    }

}
