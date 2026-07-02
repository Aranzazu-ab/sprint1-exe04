package L1Exe3;

import java.util.ArrayList;
import java.util.List;

public class ArrayException {
    private final List<Integer> arrayInt;

    public ArrayException() {
        arrayInt = new ArrayList<>(List.of(234,354,420 ));
    }

    public void throwException(int position) {
        if (position < 0 || position >= arrayInt.size()) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
    }
}

