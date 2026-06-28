package Library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LibraryTest {
    @Test
    public void notNullBookList(){
        Library testlibrary = new Library();
        assertNotNull(testlibrary.getBooks());
    }
}
