package L1Exe3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ArrayExceptionTest {

//    @Test
//    public void arrayException() {
//        ArrayException arrayException = new ArrayException();
//        try {
//            arrayException.generateException();
//            fail("An exception should have been thrown");
//        } catch (ArrayIndexOutOfBoundsException error) {
//
//        }
//    }

    @Test
    public void invalidIndex() {

        ArrayException arrayException = new ArrayException();
        try {
            arrayException.throwException(8);
            fail("An exception should have been thrown");
        } catch (ArrayIndexOutOfBoundsException error) {
            assertEquals("Invalid index", error.getMessage());

        }
    }
}
