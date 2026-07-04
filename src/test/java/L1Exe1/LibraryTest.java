package L1Exe1;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void notNullBookList(){
        Library testlibrary = new Library();
        assertNotNull(testlibrary.getBooks());
    }

    @Test
    public void increaseSizeWhenAddBook(){
        Library testLibrary = new Library();
        testLibrary.addBook("La Tumba");
        testLibrary.addBook("La Casa de los Espíritus");
        assertEquals(2, testLibrary.getBooks().size());
    }

    @Test
    public void noDuplicatedBooks(){
        Library testLibrary = new Library();
        testLibrary.addBook("La Tumba");
        testLibrary.addBook("La Tumba");
        assertEquals(1, testLibrary.getBooks().size());
    }

    @Test
    public void booksKeepInsertionOrder(){
        Library testLibrary = new Library();
        testLibrary.addBook("La Tumba");
        testLibrary.addBook("La Casa de los Espíritus");
        testLibrary.addBook("Se tiene que morir mucha gente");
        assertEquals("La Tumba", testLibrary.getBooks().get(0));
        assertEquals("La Casa de los Espíritus", testLibrary.getBooks().get(1));
        assertEquals("Se tiene que morir mucha gente", testLibrary.getBooks().get(2));
    }

    @Test
    public void getBookPosition(){
        Library testLibrary = new Library();
        testLibrary.addBook("La Tumba");
        testLibrary.addBook("La Casa de los Espíritus");
        testLibrary.addBook("Se tiene que morir mucha gente");
        assertEquals("La Casa de los Espíritus", testLibrary.getBook(1));
    }

    @Test
    public void addBookPosition(){
        Library testLibrary = new Library();
        testLibrary.addBook("La Tumba");
        testLibrary.addBook("La Casa de los Espíritus");
        testLibrary.addBook("Se tiene que morir mucha gente");
        testLibrary.addBook(1, "La Compañera");
        assertEquals("La Compañera", testLibrary.getBook(1));
        assertEquals("Se tiene que morir mucha gente", testLibrary.getBook(3));
    }

    @Test
    public void deleteBookTest() {
        Library testLibrary = new Library();
        testLibrary.addBook("La Tumba");
        testLibrary.addBook("La Casa de los Espíritus");
        testLibrary.addBook("Se tiene que morir mucha gente");
        testLibrary.deleteBook("La Casa de los Espíritus");
        assertFalse(testLibrary.getBooks().contains("La Casa de los Espíritus"));
        assertEquals(2, testLibrary.getBooks().size());
    }

    @Test
    public void sortedBooksAlphabetical() {
        Library testLibrary = new Library();
        testLibrary.addBook("La Tumba");
        testLibrary.addBook("La Casa de los Espíritus");
        testLibrary.addBook("Se tiene que morir mucha gente");
        testLibrary.addBook("La Compañera");

        List<String> sortedBooks = testLibrary.getSortedBooksAbc();
        assertEquals("La Casa de los Espíritus", sortedBooks.get(0));
        assertEquals("Se tiene que morir mucha gente", sortedBooks.get(3));
        assertEquals("La Tumba", testLibrary.getBooks().get(0));
    }
}
