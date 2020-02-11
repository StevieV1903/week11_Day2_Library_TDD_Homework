import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void Before(){
        library = new Library(3);
        book = new Book("Coding", "John Smith", "Educational");
    }

    @Test
    public void libraryBookCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddBookToLibraryIfSpace() {
        library.ifSpaceAddBook(book);
        library.ifSpaceAddBook(book);
        library.ifSpaceAddBook(book);
        library.ifSpaceAddBook(book);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.bookCount());
    }




}
