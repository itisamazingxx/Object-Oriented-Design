package person;

/**
 * This class represents a book.
 * It illustrates a "has a" relationship through composition.
 */
public class Book {

    private String title;
    private Person author;
    private double price;

    public Book(String title, Person author, double price) {
        
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public String getTitle() {
        return this.title;
    }

    public Person getAuthor() {
        return this.author;
    }
    
    public double price() {
        return this.price;
    }

    /**
     * Returns a string representation of the book,
     * including the title, author and price
     * @return a formatted string
     */
    public String toString() {
        String str;
        str = "Title: " + this.title + "\n" +
        "Author: " + this.author.toString() + "\n";
        str = str + String.format("Price: %.2f", this.price);
        return str;
    }

}
