import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;
    Library library;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("Coding", "John Smith", "Educational");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Coding", book.title);
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("John Smith", book.author);
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Educational", book.genre);
    }


}
