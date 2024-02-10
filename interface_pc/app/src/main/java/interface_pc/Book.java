package interface_pc;

public class Book {

    private String title;
    private String author;
    private TypeOfBook type;

    public Book(String title, String author, TypeOfBook type) {

        this.title = title;
        this.author = author;
        this.type = type;

    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public TypeOfBook getBookType() {
        return this.type;
    }
    
}
