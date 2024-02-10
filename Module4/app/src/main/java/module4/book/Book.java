package module4.book;

import java.util.Comparator;

/**
 * This class represents a book. A book has a title, an author, a year
 * of publication and a price
 */
public class Book implements Comparable<Book>{
    
    private String title;
    private String author;
    private int year;
    private float price;
  
    /**
     * Construct a Book object that has the provided title, author and  price
     *
     */
  
    public Book(String title, String author, int year, float price) {
      this.title = title;
      this.author = author;
      this.year = year;
      this.price = price;
    }
  
    /**
     * Return the title of this book
     *
     * @return the title of this book
     */
  
    public String getTitle() {
      return this.title;
    }
  
    /**
     * Return the author of this book
     *
     * @return the author of this book
     */
    public String getAuthor() {
      return this.author;
    }
  
    /**
     * Return the price of this book
     *
     * @return the price of this book
     */
    public float getPrice() {
      return this.price;
    }
  
    /**
     * Return the year in which this book was published
     * @return the year of publication
     */
    public int getYear() {
      return this.year;
    }
  
    /**
     * Determine if this book was published before the given year
     *
     * @param year the year to test against
     * @return true if this book was published before the provided
     * year, false otherwise
     */
    public boolean before(int year) {
      return this.year < year;
    }
  
    /**
     * Determine if this book is cheaper than the book passed to it
     *
     * @param book the book whose price should be compared to this book
     * @return true if this book is cheaper than the other book, false
     * otherwise
     */
    public boolean cheaperThan(Book book) {
      return this.price < book.getPrice();
    }

    /**
     * Determine if this book's author contains the given name
     */
    public boolean containsAuthor(String authorName) {
      return this.author.contains(authorName);
    }

    public String toString() {
      return String.format("Title: %s Year: %d Price: %.2f", this.title, this.year, this.price);
    }

    public int compareTo(Book b) {
      return 0;
    }

  }
