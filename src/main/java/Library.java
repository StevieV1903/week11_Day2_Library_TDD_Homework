import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;


    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void ifSpaceAddBook(Book book) {
        if (this.books.size() < this.capacity) {
            addBook(book);
        }


    }
}