package L1Exe3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayExceptionTest {

    @Test
    public void invalidIndex() {
        ArrayException arrayException = new ArrayException();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayException.throwException(3);
        });
    }
}

